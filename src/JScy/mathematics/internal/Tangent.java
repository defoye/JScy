package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Tangent extends UnaryNode {

    public Tangent(Expression exp) {

        super(exp, UnaryOperator.TAN);
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
