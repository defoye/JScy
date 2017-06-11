package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Constant extends Expression {

    double value;

    public Constant(double value) {

        this.value = value;
    }

    @Override
    public Expression derive() {

        return new Constant(0);
    }

    @Override
    public Constant simplify() {

        return this;
    }

    @Override
    public String getType() {
        return String.valueOf(value);
    }

    @Override
    public Expression getLeftChild() {
        return null;
    }

    @Override
    public Expression getRightChild() {
        return null;
    }
}
