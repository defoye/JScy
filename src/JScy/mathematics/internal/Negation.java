/*
 *  UNFINISHED
 *
 *  TODO: public Expression derive()
 *  TODO: public Expression simplify()
 */

package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Negation extends UnaryNode {

    public Negation(Expression exp) {

        super(exp, UnaryOperator.NEGATE);
    }

    @Override
    public Expression derive() {

        if(exp instanceof Cosine)
            return exp.derive();

        return new Negation(exp.derive());
    }

    @Override
    public Expression reduce() {

        Expression e = exp.reduce();

        if(e instanceof Negation) {
            return e.getRightChild();
        }

        return new Negation(e);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
