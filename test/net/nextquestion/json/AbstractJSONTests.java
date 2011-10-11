package net.nextquestion.json;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: rdclark
 * Date: Jun 3, 2007
 * Time: 1:01:41 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractJSONTests {

    protected void testViaStringTree(String source, String expected) throws IOException, RecognitionException {
        JSONParser parser = createParser(source);
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        System.out.println(st);
        assert st.equals(expected) : "Expected " + expected + ", but found " + st;
    }

    protected JSONTree createTreeParser(String testString) throws IOException, RecognitionException {
        JSONLexer lexer = createLexer(testString);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        // Invoke the program rule in get return value
        JSONParser.value_return r = parser.value();
        CommonTree t = (CommonTree) r.getTree();
        // Walk resulting tree; create treenode stream first
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        // AST nodes have payloads that point into token stream
        nodes.setTokenStream(tokens);
        // Create a tree Walker attached to the nodes stream
        return new JSONTree(nodes);
    }

    protected JSONParser createParser(String testString) throws IOException {
        JSONLexer lexer = createLexer(testString);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        return parser;
    }

    private JSONLexer createLexer(String testString) throws IOException {
        CharStream stream = new ANTLRStringStream(testString);
        JSONLexer lexer = new JSONLexer(stream);
        return lexer;
    }

    private String toStringTree(ParserRuleReturnScope result) {
        assert result != null;
        String st = ((Tree) result.getTree()).toStringTree();
        return st;
    }
}
