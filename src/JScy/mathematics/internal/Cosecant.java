package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Cosecant extends UnaryNode {

    public Cosecant(Expression exp) {

        super(exp, UnaryOperator.CSC);
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
