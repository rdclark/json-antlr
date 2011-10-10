// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g 2011-10-10 00:52:06

package net.nextquestion.json;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "OBJECT", "FIELD", "ARRAY", "COMMA", "TRUE", "FALSE", "NULL", "String", "Number", "Exponent", "Digit", "EscapeSequence", "WS", "UnicodeEscape", "HexDigit", "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'", "':'"
    };
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int NULL=12;
    public static final int NUMBER=5;
    public static final int Exponent=15;
    public static final int Digit=16;
    public static final int EOF=-1;
    public static final int HexDigit=20;
    public static final int TRUE=10;
    public static final int WS=18;
    public static final int Number=14;
    public static final int OBJECT=6;
    public static final int COMMA=9;
    public static final int UnicodeEscape=19;
    public static final int FIELD=7;
    public static final int String=13;
    public static final int FALSE=11;
    public static final int EscapeSequence=17;
    public static final int ARRAY=8;
    public static final int STRING=4;

    // delegates
    // delegators


        public JSONTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSONTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return JSONTree.tokenNames; }
    public String getGrammarFileName() { return "/Users/jim/work/code/github/json-antlr/grammar/JSONTree.g"; }


        private Object extractNumber(CommonTree numberToken, CommonTree exponentToken) {
            String numberBody = numberToken.getText();
            String exponent = (exponentToken == null) ? null : exponentToken.getText().substring(1); // remove the 'e' prefix if there
            boolean isReal = numberBody.indexOf('.') >= 0 || exponent != null;
            if (!isReal) {
                return new Integer(numberBody);
            } else {
                double result = Double.parseDouble(numberBody);
                if (exponent != null) {
                    result = result * Math.pow(10.0f, Double.parseDouble(exponent));
                }
                return new Double(result);
            }
        }
        
        private String extractString(CommonTree token) {
            // StringBuffers are an efficient way to modify strings
            StringBuffer sb = new StringBuffer(token.getText());
            // Process character escapes
            int startPoint = 1; // skip initial quotation mark
            for (;;) {
                int slashIndex = sb.indexOf("\\", startPoint); // search for a single backslash
                if (slashIndex == -1) break;
                // Else, we have a backslash
                char escapeType = sb.charAt(slashIndex + 1);
                switch (escapeType) {
                    case'u':
                        // Unicode escape.
                        String unicode = extractUnicode(sb, slashIndex);
                        sb.replace(slashIndex, slashIndex + 6, unicode); // backspace
                        break; // back to the loop

                        // note: Java's character escapes match JSON's, which is why it looks like we're replacing
                    // "\b" with "\b". We're actually replacing 2 characters (slash-b) with one (backspace).
                    case 'b':
                        sb.replace(slashIndex, slashIndex + 2, "\b"); // backspace
                        break;

                    case 't':
                        sb.replace(slashIndex, slashIndex + 2, "\t"); // tab
                        break;

                    case 'n':
                        sb.replace(slashIndex, slashIndex + 2, "\n"); // newline
                        break;

                    case 'f':
                        sb.replace(slashIndex, slashIndex + 2, "\f"); // form feed
                        break;

                    case 'r':
                        sb.replace(slashIndex, slashIndex + 2, "\r"); // return
                        break;

                    case '\'':
                        sb.replace(slashIndex, slashIndex + 2, "\'"); // single quote
                        break;

                    case '\"':
                        sb.replace(slashIndex, slashIndex + 2, "\""); // double quote
                        break;

                    case '\\':
                        sb.replace(slashIndex, slashIndex + 2, "\\"); // backslash
                        break;
                        
                    case '/':
                        sb.replace(slashIndex, slashIndex + 2, "/"); // solidus
                        break;

                }
                startPoint = slashIndex+1;

            }

            // remove surrounding quotes
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);

            return sb.toString();
        }

        private String extractUnicode(StringBuffer sb, int slashIndex) {
            // Gather the 4 hex digits, convert to an integer, translate the number to a unicode char, replace
            String result;
            String code = sb.substring(slashIndex + 2, slashIndex + 6);
            int charNum = Integer.parseInt(code, 16); // hex to integer
            // There's no simple way to go from an int to a unicode character.
            // We'll have to pass this through an output stream writer to do
            // the conversion.
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(baos, "UTF-8");
                osw.write(charNum);
                osw.flush();
                result = baos.toString("UTF-8"); // Thanks to Silvester Pozarnik for the tip about adding "UTF-8" here
            } catch (Exception e) {
                e.printStackTrace();
                result = null;
            }
            return result;
        }




    // $ANTLR start "value"
    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:126:1: value returns [Object result] : (s= string | n= number | o= object | a= array | TRUE | FALSE | NULL );
    public final Object value() throws RecognitionException {
        Object result = null;

        String s = null;

        Object n = null;

        Map o = null;

        List a = null;


        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:127:2: (s= string | n= number | o= object | a= array | TRUE | FALSE | NULL )
            int alt1=7;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt1=1;
                }
                break;
            case NUMBER:
                {
                alt1=2;
                }
                break;
            case OBJECT:
                {
                alt1=3;
                }
                break;
            case ARRAY:
                {
                alt1=4;
                }
                break;
            case TRUE:
                {
                alt1=5;
                }
                break;
            case FALSE:
                {
                alt1=6;
                }
                break;
            case NULL:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:127:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_value50);
                    s=string();

                    state._fsp--;

                     result = s; 

                    }
                    break;
                case 2 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:128:4: n= number
                    {
                    pushFollow(FOLLOW_number_in_value60);
                    n=number();

                    state._fsp--;

                     result = n; 

                    }
                    break;
                case 3 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:129:4: o= object
                    {
                    pushFollow(FOLLOW_object_in_value69);
                    o=object();

                    state._fsp--;

                     result = o; 

                    }
                    break;
                case 4 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:130:4: a= array
                    {
                    pushFollow(FOLLOW_array_in_value78);
                    a=array();

                    state._fsp--;

                     result = a; 

                    }
                    break;
                case 5 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:131:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_value85); 
                     result =Boolean.TRUE; 

                    }
                    break;
                case 6 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:132:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_value92); 
                    result = Boolean.FALSE; 

                    }
                    break;
                case 7 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:133:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_value99); 
                    result = null; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "value"


    // $ANTLR start "string"
    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:136:1: string returns [String result] : ^( STRING String ) ;
    public final String string() throws RecognitionException {
        String result = null;

        CommonTree String1=null;

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:137:2: ( ^( STRING String ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:137:4: ^( STRING String )
            {
            match(input,STRING,FOLLOW_STRING_in_string117); 

            match(input, Token.DOWN, null); 
            String1=(CommonTree)match(input,String,FOLLOW_String_in_string119); 

            match(input, Token.UP, null); 
             result = extractString(String1); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "string"


    // $ANTLR start "object"
    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:141:1: object returns [Map result] : ^( OBJECT ( pair[$result] )+ ) ;
    public final Map object() throws RecognitionException {
        Map result = null;

         result = new HashMap(); 
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:143:2: ( ^( OBJECT ( pair[$result] )+ ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:143:4: ^( OBJECT ( pair[$result] )+ )
            {
            match(input,OBJECT,FOLLOW_OBJECT_in_object147); 

            match(input, Token.DOWN, null); 
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:143:13: ( pair[$result] )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FIELD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:143:13: pair[$result]
            	    {
            	    pushFollow(FOLLOW_pair_in_object149);
            	    pair(result);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "object"


    // $ANTLR start "number"
    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:146:1: number returns [Object result] : ^( NUMBER Number ( Exponent )? ) ;
    public final Object number() throws RecognitionException {
        Object result = null;

        CommonTree Number2=null;
        CommonTree Exponent3=null;

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:147:2: ( ^( NUMBER Number ( Exponent )? ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:147:4: ^( NUMBER Number ( Exponent )? )
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_number169); 

            match(input, Token.DOWN, null); 
            Number2=(CommonTree)match(input,Number,FOLLOW_Number_in_number171); 
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:147:20: ( Exponent )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Exponent) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:147:20: Exponent
                    {
                    Exponent3=(CommonTree)match(input,Exponent,FOLLOW_Exponent_in_number173); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
             result = extractNumber(Number2, Exponent3); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "number"


    // $ANTLR start "array"
    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:151:1: array returns [List list] : ^( ARRAY (v= value )+ ) ;
    public final List array() throws RecognitionException {
        List list = null;

        Object v = null;


         list = new ArrayList(); 
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:153:2: ( ^( ARRAY (v= value )+ ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:153:4: ^( ARRAY (v= value )+ )
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_array200); 

            match(input, Token.DOWN, null); 
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:153:12: (v= value )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=STRING && LA4_0<=OBJECT)||LA4_0==ARRAY||(LA4_0>=TRUE && LA4_0<=NULL)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:153:13: v= value
            	    {
            	    pushFollow(FOLLOW_value_in_array205);
            	    v=value();

            	    state._fsp--;

            	    list.add(v); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "array"


    // $ANTLR start "pair"
    // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:156:1: pair[Map map] : ^( FIELD key= String v= value ) ;
    public final void pair(Map map) throws RecognitionException {
        CommonTree key=null;
        Object v = null;


        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:157:2: ( ^( FIELD key= String v= value ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSONTree.g:157:4: ^( FIELD key= String v= value )
            {
            match(input,FIELD,FOLLOW_FIELD_in_pair226); 

            match(input, Token.DOWN, null); 
            key=(CommonTree)match(input,String,FOLLOW_String_in_pair230); 
            pushFollow(FOLLOW_value_in_pair234);
            v=value();

            state._fsp--;


            match(input, Token.UP, null); 
             map.put(extractString(key), v); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pair"

    // Delegated rules


 

    public static final BitSet FOLLOW_string_in_value50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_value85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_value92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_string119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJECT_in_object147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pair_in_object149 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_NUMBER_in_number169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Number_in_number171 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_Exponent_in_number173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_in_array200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_array205 = new BitSet(new long[]{0x0000000000001D78L});
    public static final BitSet FOLLOW_FIELD_in_pair226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_pair230 = new BitSet(new long[]{0x0000000000001D78L});
    public static final BitSet FOLLOW_value_in_pair234 = new BitSet(new long[]{0x0000000000000008L});

}