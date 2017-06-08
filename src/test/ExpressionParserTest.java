package test;

import JScy.maths.InvalidExpressionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

/**
 * <p> This class represents a binary tree that represents an expression
 * such that each node itself is an Expression and contains either
 * one or two children, depending on if that Expression is a
 * UnaryOperation or a BinaryOperation, respectively. </p>
 */
public class ExpressionParserTest extends BaseTest {

    @Test
    public void testParse() throws InvalidExpressionException {

        final String QUERY = "-5 + 7(x^2) + ((sin(x)";
        final String EXPECTED = "$5 + 7*(x^2) + ((sin(x)))";
        parser.parse(QUERY);
        String actual = parser.getExpression();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    public void testTokenizer() throws InvalidExpressionException {

        final String QUERY = "sin(x) / 5*x";
        final String[] EXPECTED = {"sin", "x", "5", "x", "*", "/"};
        parser.parse(QUERY);
        ArrayList<String>
    }
}
