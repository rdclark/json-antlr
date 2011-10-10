// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/jim/work/code/github/json-antlr/grammar/JSON.g 2011-10-10 00:52:05

package net.nextquestion.json;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONLexer extends Lexer {
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

    public JSONLexer() {;} 
    public JSONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jim/work/code/github/json-antlr/grammar/JSON.g"; }

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:7:7: ( ',' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:8:7: ( 'true' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:8:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:9:7: ( 'false' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:9:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:10:7: ( 'null' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:10:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:11:7: ( '{' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:12:7: ( '}' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:13:7: ( '[' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:14:7: ( ']' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:15:7: ( ':' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:8: ( ( '-' )? ( Digit )+ ( '.' ( Digit )+ )? )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:10: ( '-' )? ( Digit )+ ( '.' ( Digit )+ )?
            {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:10: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:15: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:15: Digit
            	    {
            	    mDigit(); 

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

            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:22: ( '.' ( Digit )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:24: '.' ( Digit )+
                    {
                    match('.'); 
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:28: ( Digit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:87:28: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            int _type = Exponent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:9: ( ( 'e' | 'E' ) ( '-' )? ( '1' .. '9' ) ( Digit )* )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:11: ( 'e' | 'E' ) ( '-' )? ( '1' .. '9' ) ( Digit )*
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:21: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:26: ( '1' .. '9' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:27: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:37: ( Digit )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:89:37: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:91:9: ( '\"' ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' | '/' ) )* '\"' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:92:2: '\"' ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' | '/' ) )* '\"'
            {
            match('\"'); 
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:92:6: ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' | '/' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>=' ' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='.')||(LA7_0>='0' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:92:8: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:92:25: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' | '/' )
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:95:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:95:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:95:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:6: ( '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '\\/' ) )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:10: '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '\\/' )
            {
            match('\\'); 
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:15: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '\\/' )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt9=1;
                }
                break;
            case 'b':
                {
                alt9=2;
                }
                break;
            case 't':
                {
                alt9=3;
                }
                break;
            case 'n':
                {
                alt9=4;
                }
                break;
            case 'f':
                {
                alt9=5;
                }
                break;
            case 'r':
                {
                alt9=6;
                }
                break;
            case '\"':
                {
                alt9=7;
                }
                break;
            case '\'':
                {
                alt9=8;
                }
                break;
            case '\\':
                {
                alt9=9;
                }
                break;
            case '/':
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:16: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 2 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:31: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:35: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:39: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:43: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:47: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:51: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:56: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:61: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 10 :
                    // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:98:66: '\\/'
                    {
                    match('/'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:102:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:102:4: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:106:2: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:110:2: ( '0' .. '9' )
            // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:110:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    public void mTokens() throws RecognitionException {
        // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:8: ( COMMA | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | Number | Exponent | String | WS )
        int alt10=13;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt10=1;
            }
            break;
        case 't':
            {
            alt10=2;
            }
            break;
        case 'f':
            {
            alt10=3;
            }
            break;
        case 'n':
            {
            alt10=4;
            }
            break;
        case '{':
            {
            alt10=5;
            }
            break;
        case '}':
            {
            alt10=6;
            }
            break;
        case '[':
            {
            alt10=7;
            }
            break;
        case ']':
            {
            alt10=8;
            }
            break;
        case ':':
            {
            alt10=9;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt10=10;
            }
            break;
        case 'E':
        case 'e':
            {
            alt10=11;
            }
            break;
        case '\"':
            {
            alt10=12;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt10=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;
        }

        switch (alt10) {
            case 1 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:10: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 2 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:64: Number
                {
                mNumber(); 

                }
                break;
            case 11 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:71: Exponent
                {
                mExponent(); 

                }
                break;
            case 12 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:80: String
                {
                mString(); 

                }
                break;
            case 13 :
                // /Users/jim/work/code/github/json-antlr/grammar/JSON.g:1:87: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}