package JScy.maths.internal;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
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
}