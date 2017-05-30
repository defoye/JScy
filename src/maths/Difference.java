package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Difference extends BinaryOperation {

    public Difference(Expression left, Expression right) {

        super(left, right, BinaryOperator.MINUS);
    }

    @Override
    Expression derive() {

        return new Difference(left.derive(), right.derive());
    }

    @Override
    Expression simplify() {

        Expression l = left.simplify();
        Expression r = right.simplify();

        //if()

        return null;
    }
}
