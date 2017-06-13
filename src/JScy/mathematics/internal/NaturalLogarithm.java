/*
 *  UNFINISHED
 *  TODO: public Expression simplify()
 */

package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class NaturalLogarithm extends UnaryNode {

    public NaturalLogarithm(Expression exp) {

        super(exp, UnaryOperator.NATURALLOG);
    }

    @Override
    public Expression derive() {

        if(exp instanceof Constant)
            return new Constant(0);

        return new Quotient(
                exp.derive(),
                this
        );
    }

    @Override
    public Expression reduce() {
        return this;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
