package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Secant extends UnaryNode {

    public Secant(Expression exp) {

        super(exp, UnaryOperator.SEC);
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
