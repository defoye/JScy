package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
public class Negation extends UnaryNode {

    public Negation(Expression exp) {

        super(exp, UnaryOperator.NEGATE);
    }

    @Override
    public Expression derive() {
        return new Negation(exp.derive());
    }

    @Override
    public Expression simplify() {
        return null;
    }
}
