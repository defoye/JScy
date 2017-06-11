package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
abstract class UnaryNode extends Expression {

    protected Expression exp;
    protected UnaryOperator type;

    UnaryNode(Expression exp, UnaryOperator type) {
        this.exp = exp;
        this.type = type;
    }

    public String getType() {

        return type.toString();
    }

    @Override
    public Expression getLeftChild() {
        return null;
    }

    @Override
    public Expression getRightChild() {
        return exp;
    }
}
