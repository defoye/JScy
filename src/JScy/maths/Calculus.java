package JScy.maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
public final class Calculus {

    private static String expression;

    public static String derive(String expression) throws InvalidExpressionException {
        Calculus.expression = expression;

        ExpressionParser parser = new ExpressionParser();
        parser.parse(expression);

        ExpressionTree expTree = new ExpressionTree(parser.getVar(), parser.getTokens());

        expTree.getRoot().derive();

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
