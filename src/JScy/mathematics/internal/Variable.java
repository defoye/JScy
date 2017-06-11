package JScy.mathematics.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public class Variable extends Expression {

    String value;

    public Variable(String value) {
        this.value = value;
    }

    @Override
    public Expression derive() {
        return new Constant(1);
    }

    @Override
    public Expression simplify() {
        return this;
    }

    @Override
    public String getType() {
        return value;
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
