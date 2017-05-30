package maths;

import maths.InvalidExpressionException;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
public final class Calculus {

    public static String derive(String expression) throws InvalidExpressionException {

        ExpressionParser parser = new ExpressionParser(expression);

        ExpressionTree expTree = new ExpressionTree(parser.getVar(), parser.getTokens());

        return null;
    }

    public static double derive(String expression, double val) {



        return 0.0;
    }

    public static double evaluate(String expression) throws InvalidExpressionException {

        return 0.0;
    }

    private static boolean isValidExpression() {
        return false;
    }
}
