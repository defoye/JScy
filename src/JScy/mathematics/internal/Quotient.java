package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
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

       Expression numerator = left.simplify();
       Expression denominator = right.simplify();

       if(numerator.getType().equals("0") || denominator.getType().equals("1")) {
           return numerator;
       }
       if(numerator.equals(denominator)) {
           return new Constant(1);
       }
        if (denominator instanceof Quotient) {
            if (numerator instanceof Quotient) {
                return new Quotient(
                        new Product(numerator.getLeftChild(), denominator.getRightChild()),
                        new Product(denominator.getLeftChild(), numerator.getRightChild())
                ).simplify();
            } else {
                return new Quotient(
                        new Product(numerator, denominator.getRightChild()),
                        denominator.getRightChild()
                ).simplify();
            }
        } else if (numerator instanceof Quotient) {
            return new Quotient(
                    numerator.getLeftChild(),
                    new Product(denominator, numerator.getRightChild())
            ).simplify();
        }

        return new Quotient(numerator, denominator);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Expression)) {
            return false;
        }

        if (object == this) {
            return true;
        }

        Expression t = simplify();
        Expression o = ((Expression) object).simplify();

        if (!(t instanceof Quotient)) {
            return t.equals(o);
        }

        if (!(o instanceof Quotient)) {
            return false;
        }

        Quotient qt = (Quotient) t;
        Quotient qo = (Quotient) o;

        return qt.getLeftChild().equals(qo.getLeftChild())
                && qt.getRightChild().equals(qo.getRightChild());
    }
}
