package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Quotient extends BinaryOperation {

   Quotient(Expression left, Expression right) {

       super(left, right, BinaryOperator.DIVIDE);
    }

    @Override
    Expression derive() {
        return new Quotient(
                new Difference(
                        new Product(left.derive(), right),
                        new Product(left, right.derive())
                ),
                new Product(right, right)
        );
    }

    @Override
    Expression simplify() {
        return null;
    }
}
