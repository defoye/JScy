package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
public class Quotient extends BinaryNode {

   public Quotient(Expression left, Expression right) {

       super(left, right, BinaryOperator.DIVIDE);
    }

    @Override
    public Expression derive() {
        return new Quotient(
                new Difference(
                        new Product(left.derive(), right),
                        new Product(left, right.derive())
                ),
                new Product(right, right)
        );
    }

    @Override
    public Expression simplify() {
        return null;
    }
}
