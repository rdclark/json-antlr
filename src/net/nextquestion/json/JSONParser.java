// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/jim/work/code/github/json-antlr/grammar/JSON.g 2011-10-10 00:52:05

package net.nextquestion.json;

import java.util.regex.Pattern;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSONParser extends Parser {
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


        public JSONParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSONParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JSONParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jim/work/code/github/json-antlr/grammar/JSON.g"; }

     
    protected void mismatch(IntStream input, int ttype, BitSet follow) 
    throws RecognitionException 
    { 
    throw new MismatchedTokenException(ttype, input); 
    } 
    public Object recoverFromMismatchedSet(IntStream input, 
    RecognitionException e, 
    BitSet follow) 
    throws RecognitionException 
    { 
    throw e; 
    } 


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:49:1: value : ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL );
    public final JSONParser.value_return value() throws RecognitionException {
        JSONParser.value_return retval = new JSONParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        JSONParser.string_return string1 = null;

        JSONParser.number_return number2 = null;

        JSONParser.object_return object3 = null;

        JSONParser.array_return array4 = null;


        Object string_literal5_tree=null;
        Object string_literal6_tree=null;
        Object string_literal7_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:50:2: ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL )
            int alt1=7;
            switch ( input.LA(1) ) {
            case String:
                {
                alt1=1;
                }
                break;
            case Number:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 22:
                {
                alt1=6;
                }
                break;
            case 23:
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
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:50:4: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_value96);
                    string1=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string1.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:51:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_value101);
                    number2=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number2.getTree());

                    }
                    break;
                case 3 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:52:4: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_value106);
                    object3=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object3.getTree());

                    }
                    break;
                case 4 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:53:4: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_value111);
                    array4=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array4.getTree());

                    }
                    break;
                case 5 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:54:4: 'true'
                    {
                    string_literal5=(Token)match(input,21,FOLLOW_21_in_value116);  
                    stream_21.add(string_literal5);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:11: -> TRUE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:55:4: 'false'
                    {
                    string_literal6=(Token)match(input,22,FOLLOW_22_in_value125);  
                    stream_22.add(string_literal6);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:12: -> FALSE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:56:4: 'null'
                    {
                    string_literal7=(Token)match(input,23,FOLLOW_23_in_value134);  
                    stream_23.add(string_literal7);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:11: -> NULL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NULL, "NULL"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:59:1: string : String -> ^( STRING String ) ;
    public final JSONParser.string_return string() throws RecognitionException {
        JSONParser.string_return retval = new JSONParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String8=null;

        Object String8_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:59:9: ( String -> ^( STRING String ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:59:11: String
            {
            String8=(Token)match(input,String,FOLLOW_String_in_string149);  
            stream_String.add(String8);



            // AST REWRITE
            // elements: String
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:4: -> ^( STRING String )
            {
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:60:7: ^( STRING String )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING, "STRING"), root_1);

                adaptor.addChild(root_1, stream_String.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:64:1: number : n= Number {...}? ( Exponent )? -> ^( NUMBER Number ( Exponent )? ) ;
    public final JSONParser.number_return number() throws RecognitionException {
        JSONParser.number_return retval = new JSONParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token n=null;
        Token Exponent9=null;

        Object n_tree=null;
        Object Exponent9_tree=null;
        RewriteRuleTokenStream stream_Exponent=new RewriteRuleTokenStream(adaptor,"token Exponent");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:64:8: (n= Number {...}? ( Exponent )? -> ^( NUMBER Number ( Exponent )? ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:64:10: n= Number {...}? ( Exponent )?
            {
            n=(Token)match(input,Number,FOLLOW_Number_in_number173);  
            stream_Number.add(n);

            if ( !((Pattern.matches("(0|(-?[1-9]\\d*))(\\.\\d+)?", n.getText()))) ) {
                throw new FailedPredicateException(input, "number", "Pattern.matches(\"(0|(-?[1-9]\\\\d*))(\\\\.\\\\d+)?\", n.getText())");
            }
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:65:6: ( Exponent )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Exponent) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:65:6: Exponent
                    {
                    Exponent9=(Token)match(input,Exponent,FOLLOW_Exponent_in_number183);  
                    stream_Exponent.add(Exponent9);


                    }
                    break;

            }



            // AST REWRITE
            // elements: Number, Exponent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:4: -> ^( NUMBER Number ( Exponent )? )
            {
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:66:7: ^( NUMBER Number ( Exponent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBER, "NUMBER"), root_1);

                adaptor.addChild(root_1, stream_Number.nextNode());
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:66:23: ( Exponent )?
                if ( stream_Exponent.hasNext() ) {
                    adaptor.addChild(root_1, stream_Exponent.nextNode());

                }
                stream_Exponent.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:69:1: object : '{' ( members )? '}' -> ^( OBJECT ( members )? ) ;
    public final JSONParser.object_return object() throws RecognitionException {
        JSONParser.object_return retval = new JSONParser.object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        JSONParser.members_return members11 = null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_members=new RewriteRuleSubtreeStream(adaptor,"rule members");
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:69:8: ( '{' ( members )? '}' -> ^( OBJECT ( members )? ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:69:10: '{' ( members )? '}'
            {
            char_literal10=(Token)match(input,24,FOLLOW_24_in_object209);  
            stream_24.add(char_literal10);

            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:69:14: ( members )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==String) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:69:14: members
                    {
                    pushFollow(FOLLOW_members_in_object211);
                    members11=members();

                    state._fsp--;

                    stream_members.add(members11.getTree());

                    }
                    break;

            }

            char_literal12=(Token)match(input,25,FOLLOW_25_in_object214);  
            stream_25.add(char_literal12);



            // AST REWRITE
            // elements: members
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:4: -> ^( OBJECT ( members )? )
            {
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:70:7: ^( OBJECT ( members )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT, "OBJECT"), root_1);

                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:70:16: ( members )?
                if ( stream_members.hasNext() ) {
                    adaptor.addChild(root_1, stream_members.nextTree());

                }
                stream_members.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "object"

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:73:1: array : '[' elements ']' -> ^( ARRAY elements ) ;
    public final JSONParser.array_return array() throws RecognitionException {
        JSONParser.array_return retval = new JSONParser.array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        JSONParser.elements_return elements14 = null;


        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"rule elements");
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:73:7: ( '[' elements ']' -> ^( ARRAY elements ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:73:9: '[' elements ']'
            {
            char_literal13=(Token)match(input,26,FOLLOW_26_in_array238);  
            stream_26.add(char_literal13);

            pushFollow(FOLLOW_elements_in_array240);
            elements14=elements();

            state._fsp--;

            stream_elements.add(elements14.getTree());
            char_literal15=(Token)match(input,27,FOLLOW_27_in_array242);  
            stream_27.add(char_literal15);



            // AST REWRITE
            // elements: elements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:4: -> ^( ARRAY elements )
            {
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:74:7: ^( ARRAY elements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);

                adaptor.addChild(root_1, stream_elements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "array"

    public static class elements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elements"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:77:1: elements : value ( COMMA value )* ;
    public final JSONParser.elements_return elements() throws RecognitionException {
        JSONParser.elements_return retval = new JSONParser.elements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA17=null;
        JSONParser.value_return value16 = null;

        JSONParser.value_return value18 = null;


        Object COMMA17_tree=null;

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:77:9: ( value ( COMMA value )* )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:77:11: value ( COMMA value )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_value_in_elements262);
            value16=value();

            state._fsp--;

            adaptor.addChild(root_0, value16.getTree());
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:77:17: ( COMMA value )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:77:18: COMMA value
            	    {
            	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_elements265); 
            	    pushFollow(FOLLOW_value_in_elements268);
            	    value18=value();

            	    state._fsp--;

            	    adaptor.addChild(root_0, value18.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "elements"

    public static class members_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "members"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:80:1: members : pair ( COMMA pair )* ;
    public final JSONParser.members_return members() throws RecognitionException {
        JSONParser.members_return retval = new JSONParser.members_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA20=null;
        JSONParser.pair_return pair19 = null;

        JSONParser.pair_return pair21 = null;


        Object COMMA20_tree=null;

        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:80:9: ( pair ( COMMA pair )* )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:80:11: pair ( COMMA pair )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_pair_in_members281);
            pair19=pair();

            state._fsp--;

            adaptor.addChild(root_0, pair19.getTree());
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:80:16: ( COMMA pair )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:80:17: COMMA pair
            	    {
            	    COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_members284); 
            	    pushFollow(FOLLOW_pair_in_members287);
            	    pair21=pair();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pair21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "members"

    public static class pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pair"
    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:83:1: pair : String ':' value -> ^( FIELD String value ) ;
    public final JSONParser.pair_return pair() throws RecognitionException {
        JSONParser.pair_return retval = new JSONParser.pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String22=null;
        Token char_literal23=null;
        JSONParser.value_return value24 = null;


        Object String22_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:83:6: ( String ':' value -> ^( FIELD String value ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:83:8: String ':' value
            {
            String22=(Token)match(input,String,FOLLOW_String_in_pair301);  
            stream_String.add(String22);

            char_literal23=(Token)match(input,28,FOLLOW_28_in_pair303);  
            stream_28.add(char_literal23);

            pushFollow(FOLLOW_value_in_pair305);
            value24=value();

            state._fsp--;

            stream_value.add(value24.getTree());


            // AST REWRITE
            // elements: value, String
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:4: -> ^( FIELD String value )
            {
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:84:7: ^( FIELD String value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_String.nextNode());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
         
        catch (RecognitionException e) { 
        throw e; 
        } 
        finally {
        }
        return retval;
    }
    // $ANTLR end "pair"

    // Delegated rules


 

    public static final BitSet FOLLOW_string_in_value96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_value116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_value125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_value134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_string149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_number173 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_Exponent_in_number183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_object209 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_members_in_object211 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_object214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_array238 = new BitSet(new long[]{0x0000000005E06000L});
    public static final BitSet FOLLOW_elements_in_array240 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_array242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_elements262 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_elements265 = new BitSet(new long[]{0x0000000005E06000L});
    public static final BitSet FOLLOW_value_in_elements268 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_pair_in_members281 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_members284 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_members287 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_String_in_pair301 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_pair303 = new BitSet(new long[]{0x0000000005E06000L});
    public static final BitSet FOLLOW_value_in_pair305 = new BitSet(new long[]{0x0000000000000002L});

}