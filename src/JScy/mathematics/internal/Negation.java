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

        if(exp instanceof Negation) {
            return exp.getRightChild();
        }

        return new Negation(exp.reduce());
    }

    @Override
    public double getValue() {
        return 0;
    }
}
