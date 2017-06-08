package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
public class Product extends BinaryNode {

    public Product(Expression left, Expression right) {

        super(left, right, BinaryOperator.MULTIPLY);
    }

    @Override
    public Expression derive() {
        return new Sum(
                new Product(left.derive(), right),
                new Product(left, right.derive())
        );
    }

    @Override
    public Expression simplify() {
        return null;
    }
}
