package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Difference extends BinaryNode {

    public Difference(Expression left, Expression right) {

        super(left, right, BinaryOperator.MINUS);
    }

    @Override
    public Expression derive() {

        return new Difference(left.derive(), right.derive());
    }

    @Override
    public Expression simplify() {

        Expression l = left.simplify();
        Expression r = right.simplify();

        //if()

        return null;
    }
}
