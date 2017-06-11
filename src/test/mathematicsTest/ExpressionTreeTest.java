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
        final String EXPECTED1 = "/";
        expressionTree.init("x", QUERY);
        final String actual1 = expressionTree.getRoot().getType();

        Assertions.assertEquals(EXPECTED1, actual1);

        final String EXPECTED2 = "sin";
        final String actual2 = expressionTree.getRoot().getLeftChild().getType();

        Assertions.assertEquals(EXPECTED2, actual2);
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
    void matchFunc() {
    }

    @Test
    void matchOperator() {
    }
}
