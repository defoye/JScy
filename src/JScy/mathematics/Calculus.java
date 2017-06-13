package JScy.mathematics;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Calculus {

    public static String derive(String expression) throws InvalidExpressionException {

        ExpressionTree expTree = parseToTree(expression);

        expTree.printTree();
        expTree.derive();
        expTree.printTree();
        expTree.reduce();
        expTree.printTree();
        return expTree.toString();
    }

    public static final double derive(String expression, double val) throws InvalidExpressionException {

        ExpressionTree expTree = parseToTree(expression);

        expTree.derive();
        expTree.reduce();

        return expTree.getVal();
    }

    public static String reduce(String expression) throws InvalidExpressionException {

        ExpressionTree expTree = parseToTree(expression);

        expTree.reduce();

        return expTree.toString();
    }

    public static final double evaluate(String expression) throws InvalidExpressionException {

        return 0.0;
    }

    private static final ExpressionTree parseToTree(String expression) throws InvalidExpressionException {

        ExpressionParser parser = new ExpressionParser();
        parser.parse(expression);

        return new ExpressionTree(parser.getVar(), parser.getTokens());
    }
}
