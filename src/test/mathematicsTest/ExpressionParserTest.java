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
    void testParse() throws InvalidExpressionException {

        final String QUERY = "-5 + 7((x^2) + ((sin(x))";
        final String EXPECTED = "$5+7*((x^2)+((sin(x))))";
        parser.parse(QUERY);
        String actual = parser.getExpression();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void testTokenize() throws InvalidExpressionException {

        final String QUERY = "(5+x) / sin(x)";
        final String[] EXPECTED = {"5", "x", "+", "x", "sin", "/"};
        parser.parse(QUERY);
        final String[] actual = parser.getTokens().toArray(new String[parser.getTokens().size()]);

        Assertions.assertArrayEquals(EXPECTED, actual);
    }

    @Test
    void testFormat() throws InvalidExpressionException {

        final String QUERY = "5x + 7*x^2";
        final String EXPECTED = "5x + 7x^2";
        parser.parse(QUERY);
        String actual = parser.format(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }
}
