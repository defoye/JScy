package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
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

        Expression e = exp.simplify();

        if(exp instanceof Negation) {
            return exp.getRightChild();
        }

        return new Negation(e);
    }
}
