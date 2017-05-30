package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
abstract class UnaryOperation extends Expression {

    protected Expression exp;
    protected UnaryOperator type;

    UnaryOperation(Expression exp, UnaryOperator type) {
        this.exp = exp;
        this.type = type;
    }
}
