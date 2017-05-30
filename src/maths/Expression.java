package maths;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
abstract class Expression {
    abstract Expression derive();
    abstract Expression simplify();

    enum BinaryOperator {

        PLUS("+"),
                MINUS("-"),
                MULTIPLY("*"),
                DIVIDE("/"),
                POWER("^");

        final private String display;

        BinaryOperator(String display) {
            this.display = display;
        }

        public String toString() {
            return display;
        }

    }

    enum UnaryOperator {

        NEGATE("$"),
        NATURALLOG("ln"),
        LOG("log"),
        SIN("sin"),
        COS("cos"),
        TAN("tan"),
        CSC("csc"),
        SEC("sec"),
        COT("cot");

        final private String display;

        UnaryOperator(String display) {
            this.display = display;
        }

        public String toString() {
            return display;
        }

    }
}



