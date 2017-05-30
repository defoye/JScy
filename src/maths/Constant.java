package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
class Constant extends Expression {

    double value;

    Constant(double value) {

        this.value = value;
    }

    @Override
    Expression derive() {

        return new Constant(0);
    }

    @Override
    Constant simplify() {

        return this;
    }
}
