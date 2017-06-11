package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Sine extends UnaryNode {

    public Sine(Expression exp) {

        super(exp, UnaryOperator.SIN);
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
