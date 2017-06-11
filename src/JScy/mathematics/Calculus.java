package JScy.maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public final class Calculus {

    public static String derive(String expression) throws InvalidExpressionException {

        ExpressionTree expTree = parseToTree(expression);

        expTree.derive();

        return expTree.toString();
    }

    public static double derive(String expression, double val) throws InvalidExpressionException {

        ExpressionTree expTree = parseToTree(expression);

        expTree.derive();

        return expTree.getVal();
    }

    public static String simplify(String expression) throws InvalidExpressionException {

        ExpressionTree expTree = parseToTree(expression);

        expTree.simplify();

        return expTree.toString();
    }

    public static double evaluate(String expression) throws InvalidExpressionException {

        return 0.0;
    }

    private static ExpressionTree parseToTree(String expression) throws InvalidExpressionException {

        ExpressionParser parser = new ExpressionParser();
        parser.parse(expression);

        return new ExpressionTree(parser.getVar(), parser.getTokens());
    }
}
