package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Product extends BinaryOperation {

    public Product(Expression left, Expression right) {

        super(left, right, BinaryOperator.MULTIPLY);
    }

    @Override
    Expression derive() {
        return new Sum(
                new Product(left.derive(), right),
                new Product(left, right.derive())
        );
    }

    @Override
    Expression simplify() {
        return null;
    }
}
