package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
abstract class UnaryNode extends Expression {

    protected Expression exp;
    protected UnaryOperator type;

    UnaryNode(Expression exp, UnaryOperator type) {
        this.exp = exp;
        this.type = type;
    }

    public UnaryOperator getType() {

        return type;
    }
}
