package test.mathematicsTest;

import JScy.mathematics.InvalidExpressionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.BaseTest;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class CalculusTest extends BaseTest {

    @Test
    void reduce() throws InvalidExpressionException {
        final String QUERY = "0*x^2+4*1*x^(2-1)+1*x^(3-1)*cot(x^3)";
        final String EXPECTED = "4*x+x^2*cot(x^3)";
        String actual = calculus.reduce(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    //reduce SOMETHING
    @Test
    void reduce4() throws InvalidExpressionException {

        final String QUERY = "4*5*x";
        final String EXPECTED = "20*x";
        String actual = calculus.reduce(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void derive() throws InvalidExpressionException {

        final String QUERY = "-4*x^2 - csc(x^3)";
        final String EXPECTED = "8*x+3*x^2*cot(x^3)*csc(x^3)";
        String actual = calculus.derive(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void derive2() {
    }

    @Test
    void evaluate() {
    }
}
