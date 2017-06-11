/*
 *  UNFINISHED
 *
 *  TODO:
 */

package test.mathematicsTest;

import JScy.mathematics.InvalidExpressionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import test.BaseTest;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class ExpressionParserTest extends BaseTest {

    @Test
    void parse() throws InvalidExpressionException {

        final String QUERY = "-5 + 7(x^2) + ((sin(x)";
        final String EXPECTED = "$5+7*(x^2)+((sin(x)))";
        parser.parse(QUERY);
        String actual = parser.getExpression();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void tokenize() throws InvalidExpressionException {

        final String QUERY = "sin(x) / 5*x";
        final String[] EXPECTED = {"x", "sin", "5", "x", "*", "/"};
        parser.parse(QUERY);
        final String[] actual = parser.getTokens().toArray(new String[parser.getTokens().size()]);

        Assertions.assertArrayEquals(EXPECTED, actual);
    }

    @Test
    void readable() throws InvalidExpressionException {

        final String QUERY = "5x + 7*x^2";
        final String EXPECTED = "5x + 7x^2";
        parser.parse(QUERY);
        String actual = parser.readable(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void isOperator() {
    }

    @Test
    void isOperand() {
    }

    @Test
    void isFunction() {

        final String QUERY = "csc";
        final boolean EXPECTED = true;
        final boolean actual = parser.isFunction(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void isFunction2() {

        final String QUERY = "csce";
        final boolean EXPECTED = false;
        final boolean actual = parser.isFunction(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void getPrecedence() {
    }

    @Test
    void isLeftAssociative() {
    }
}
