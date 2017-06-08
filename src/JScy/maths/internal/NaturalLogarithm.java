package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
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
