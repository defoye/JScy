package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Exponent extends BinaryOperation {

    Exponent(Expression left, Expression right) {

        super(left, right, BinaryOperator.POWER);
    }

    @Override
    Expression derive() {

        return null;
    }

    @Override
    Expression simplify() {

        return new Exponent(left.simplify(), right.simplify());
    }
}
