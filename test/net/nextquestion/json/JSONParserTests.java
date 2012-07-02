package net.nextquestion.json;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: rdclark
 * Date: May 30, 2007
 * Time: 8:11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class JSONParserTests extends AbstractJSONTests {


    @Test
    public void testSimpleString() throws IOException, RecognitionException {
        testViaStringTree("\"abcd\"", "(STRING \"abcd\")");
    }

    @Test
    public void testCharacterEscapes() throws IOException, RecognitionException {
        testViaStringTree("\"ab\\\\cd\"", "(STRING \"ab\\\\cd\")");
    }

    @Test(expectedExceptions = RecognitionException.class)
    public void testUnescapedSolidus() throws IOException, RecognitionException {
        // The solidus "/" must be escaped in JSON. The parser will throw an exception for it.
        JSONParser parser = createParser("ab/cd");
        ParserRuleReturnScope result = parser.value();
    }

    /* Note: We don't test the rest of the escapes here as they're better tested
       at the tree parser level (after post-processing). The parser simply passes
       the whole escape sequence to the tree parser for processing.
     */

    @Test
    public void testUnicodeCharacter() throws IOException, RecognitionException {
        testViaStringTree("\"\\u001C\"", "(STRING \"\\u001C\")");
    }


    @Test
    public void testPositiveInteger() throws IOException, RecognitionException {
        testViaStringTree("12345", "(NUMBER 12345)");
    }

    @Test
    public void testNegativeInteger() throws IOException, RecognitionException {
        testViaStringTree("-12345", "(NUMBER -12345)");
    }

    @Test
    public void testPositiveRealNoExponent() throws IOException, RecognitionException {
        testViaStringTree("123.45", "(NUMBER 123.45)");
    }

    @Test
    public void testNegativeRealNoExponent() throws IOException, RecognitionException {
        testViaStringTree("-123.45", "(NUMBER -123.45)");
    }

    @Test
    public void testPositiveRealExponent() throws IOException, RecognitionException {
        testViaStringTree("123.45e4", "(NUMBER 123.45 e4)");
    }

    @Test
    public void testNegativeRealExponent() throws IOException, RecognitionException {
        testViaStringTree("123.45E-4", "(NUMBER 123.45 E-4)");
    }

    @Test(expectedExceptions = RecognitionException.class)
    public void testDoubleZero() throws IOException, RecognitionException {
        // Leading zeros aren't allowed. The parser now throws an exception in that case
        JSONParser parser = createParser("007");
        ParserRuleReturnScope result = parser.value();
    }

    @Test
    public void testZero() throws IOException, RecognitionException {
        testViaStringTree("0", "(NUMBER 0)");
    }

    @Test
    public void testObject() throws IOException, RecognitionException {
        testViaStringTree("{\"name\":\"anObject\",\"value\":5}",
                "(OBJECT (FIELD \"name\" (STRING \"anObject\")) (FIELD \"value\" (NUMBER 5)))");
    }

    @Test
    public void testArray() throws IOException, RecognitionException {
        testViaStringTree("[\"one\",2]", "(ARRAY (STRING \"one\") (NUMBER 2))");
    }

    @Test
    public void testEmptyArray() throws IOException, RecognitionException {
        testViaStringTree("[]", "ARRAY");
    }

    @Test
    public void testTrue() throws IOException, RecognitionException {
        testViaStringTree("true", "TRUE");
    }

    @Test
    public void testFalse() throws IOException, RecognitionException {
        testViaStringTree("false", "FALSE");
    }

    @Test
    public void testNull() throws IOException, RecognitionException {
        testViaStringTree("null", "NULL");
    }

}
