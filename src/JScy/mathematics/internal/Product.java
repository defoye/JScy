package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
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

        Expression l = left.simplify();
        Expression r = right.simplify();

        if(l.getType().equals("1")) {
            return r;
        }
        if(r.getType().equals("1")) {
            return l;
        }
        if(l.getType().equals("0")) {
            return l;
        }
        if(r.getType().equals("0")) {
            return r;
        }

        return null;
    }
}
