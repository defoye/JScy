package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class NaturalLogarithm extends UnaryNode {

    public NaturalLogarithm(Expression exp) {

        super(exp, UnaryOperator.NATURALLOG);
    }

    @Override
    public Expression derive() {
        return new Quotient(exp.derive(), exp);
    }

    @Override
    public Expression simplify() {
        return null;
    }
}
