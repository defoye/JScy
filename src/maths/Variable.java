package maths;
/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Variable extends Expression {

    String value;

    Variable(String value) {
        this.value = value;
    }

    @Override
    Expression derive() {
        return new Constant(1);
    }

    @Override
    Expression simplify() {
        return this;
    }
}
