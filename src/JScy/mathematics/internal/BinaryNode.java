package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 *
 * @Deprecated  This class is not supposed to be used by clients
 *              if it is left public
 */
abstract class BinaryNode extends Expression {

    protected Expression left;
    protected Expression right;
    protected BinaryOperator type;

    BinaryNode(Expression left, Expression right, BinaryOperator type) {

        this.left = left;
        this.right = right;
        this.type = type;
    }

    public String getType() {

        return type.toString();
    }

    @Override
    public Expression getLeftChild() {
        return left;
    }

    @Override
    public Expression getRightChild() {
        return right;
    }
}

