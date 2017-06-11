package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Cotangent extends UnaryNode {

    public Cotangent(Expression exp) {

        super(exp, UnaryOperator.COT);
    }

    @Override
    public Expression derive() {
        return null;
    }

    @Override
    public Expression simplify() {
        return null;
    }
}
