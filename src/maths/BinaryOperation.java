package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 *
 * @Deprecated  This class is not supposed to be used by clients
 *              if it is left public
 */
abstract class BinaryOperation extends Expression {

    protected Expression left;
    protected Expression right;
    protected BinaryOperator type;

    BinaryOperation(Expression left, Expression right, BinaryOperator type) {

        this.left = left;
        this.right = right;
        this.type = type;
    }
}
