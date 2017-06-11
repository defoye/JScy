package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Logarithm extends UnaryNode {

    public Logarithm(Expression exp) {

        super(exp, UnaryOperator.LOG);
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
