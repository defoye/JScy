package test.mathematicsTest;

import JScy.mathematics.Calculus;
import JScy.mathematics.InvalidExpressionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.BaseTest;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class CalcTest extends BaseTest {
    @Test
    void diffReadable() throws InvalidExpressionException {

        final String QUERY = "0*x^2+4*1*x^(2-1)+1*x^(3-1)*cot(x^3)";
        final String EXPECTED = "4*x+x^2*cot(x^3)";
        String actual = Calculus.diffReadable(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void reduce() throws InvalidExpressionException {
        final String QUERY = "0*x^2+4*1*x^(2-1)+1*x^(3-1)*cot(x^3)";
        final String EXPECTED = "4*x+x^2*cot(x^3)";
        String actual = Calculus.rewrite(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    //rewrite SOMETHING
    @Test
    void reduce2() throws InvalidExpressionException {

        final String QUERY = "4*5*x";
        final String EXPECTED = "20*x";
        String actual = Calculus.rewrite(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    // Power Rule
    @Test
    void diff() throws InvalidExpressionException {

        final String QUERY = "4*x^2";
        final String EXPECTED = "8*x";
        String actual = Calculus.diff(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    // Cosecant Identity & Chain Rule
    @Test
    void diff2() throws InvalidExpressionException {

        final String QUERY = "-csc(x^3)";
        final String EXPECTED = "3*x^2*cot(x^3)*csc(x^3)";
        String actual = Calculus.diff(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    // Negative Exponent
    @Test
    void diff4() throws InvalidExpressionException {

        final String QUERY = "1 / (x+2)";
        final String EXPECTED = "-1/(x+2)(x+2)";
        String actual = calculus.diff(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    // Negative Exponent
    @Test
    void diff5() throws InvalidExpressionException {

        final String QUERY = "1 / (x^2)";
        final String EXPECTED = "-2/x^3";
        String actual = calculus.diff(QUERY);

        Assertions.assertEquals(EXPECTED, actual);
    }

    @Test
    void evaluate() {
    }
}

