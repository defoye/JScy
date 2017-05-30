package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class NaturalLogarithm extends UnaryOperation {

    NaturalLogarithm(Expression exp) {

        super(exp, UnaryOperator.NATURALLOG);
    }

    @Override
    Expression derive() {
        return new Quotient(exp.derive(), exp);
    }

    @Override
    Expression simplify() {
        return null;
    }
}
