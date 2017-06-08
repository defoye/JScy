package test;

import JScy.maths.InvalidExpressionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 */
public class ExpressionParserTest extends BaseTest {

    @Test
    public void testParse() throws InvalidExpressionException {

        final String QUERY = "-5 + 7(x^2) + ((sin(x)";
        final String EXPECTED = "$5+7*(x^2)+((sin(x)))";
        parser.parse(QUERY);
        String actual = parser.getExpression();

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    public void testTokenizer() throws InvalidExpressionException {

        final String QUERY = "sin(x) / 5*x";
        final String[] EXPECTED = {"x", "sin", "5", "x", "*", "/"};
        parser.parse(QUERY);
        final String[] actual = parser.getTokens().toArray(new String[parser.getTokens().size()]);
System.out.println(actual);
        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    public void readable() throws InvalidExpressionException {

        final String QUERY = "5x + 7*x^2";
        final String EXPECTED = "5x + 7x^2";
        parser.parse(QUERY);
        String actual = parser.readable(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }
}
