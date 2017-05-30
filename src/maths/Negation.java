package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Negation extends UnaryOperation {

    Negation(Expression exp) {

        super(exp, UnaryOperator.NEGATE);
    }

    @Override
    Expression derive() {
        return new Negation(exp.derive());
    }

    @Override
    Expression simplify() {
        return null;
    }
}
