package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
class Exponent extends BinaryNode {

    Exponent(Expression left, Expression right) {

        super(left, right, BinaryOperator.POWER);
    }

    @Override
    public Expression derive() {

        return null;
    }

    @Override
    public Expression simplify() {

        return new Exponent(left.simplify(), right.simplify());
    }
}
