package JScy.maths;

import java.util.List;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 */
public class Evaluation {

    private String expression;
    private String var;
    private boolean isValid;
    private List<String> errorMessages;

    public String getVar() {

        return var;
    }

    public double evaluate(String expression, double val) throws InvalidExpressionException {



        return 0.0;
    }

    public boolean isValid() {
        return isValid;
    }


}
