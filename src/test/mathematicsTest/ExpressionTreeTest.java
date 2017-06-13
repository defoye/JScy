package test.mathematicsTest;

import JScy.mathematics.InvalidExpressionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.BaseTest;

import java.util.ArrayList;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class ExpressionTreeTest extends BaseTest {

    @Test
    void constructTree() throws InvalidExpressionException {

        parser.parse("sin(x) / 5*x");
        final ArrayList<String> QUERY = parser.getTokens();
        expressionTree.init("x", QUERY);
        final String EXPECTED = "x";
        final String actual = expressionTree.getRoot().getLeftChild().getRightChild().getType();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void constructTree2() throws InvalidExpressionException {

        parser.parse("sin(x) / (5+x)");
        final ArrayList<String> QUERY = parser.getTokens();
        expressionTree.init("x", QUERY);
        final String EXPECTED = "+";
        final String actual = expressionTree.getRoot().getRightChild().getType();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void simplify() {
    }

    @Test
    void derive() {
    }

    @Test
    void derive1() {
    }

    @Test
    void treeToString() {
    }

    @Test
    void createInfix() throws InvalidExpressionException {

        final String QUERY = "sin(x) / 5*x";
        final String EXPECTED = "sin(x)/5*x";
        parser.parse(QUERY);
        expressionTree.init(parser.getVar(), parser.getTokens());
        final String actual = expressionTree.toString();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void createInfix2() throws InvalidExpressionException {

        final String QUERY = "sin(x) / (5+x)";
        final String EXPECTED = "sin(x)/(5+x)";
        parser.parse(QUERY);
        expressionTree.init(parser.getVar(), parser.getTokens());
        final String actual = expressionTree.toString();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void matchFunc() {
    }

    @Test
    void matchOperator() {
    }
}
