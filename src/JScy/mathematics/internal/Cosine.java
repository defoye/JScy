package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Cosine extends UnaryNode {

    public Cosine(Expression exp) {

        super(exp, UnaryOperator.COS);
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
