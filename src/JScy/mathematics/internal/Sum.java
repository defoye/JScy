package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Sum extends BinaryNode {

    public Sum(Expression left, Expression right) {

        super(left, right, BinaryOperator.PLUS);
    }

    @Override
    public Expression derive() {
        return new Sum(left.derive(), right.derive());
    }

    @Override
    public Expression simplify() {
        return null;
    }
}
