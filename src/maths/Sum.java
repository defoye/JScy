package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Sum extends BinaryOperation {

    public Sum(Expression left, Expression right) {

        super(left, right, BinaryOperator.PLUS);
    }

    @Override
    Expression derive() {
        return new Sum(left.derive(), right.derive());
    }

    @Override
    Expression simplify() {
        return null;
    }
}
