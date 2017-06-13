package test;

import JScy.mathematics.Calculus;
import JScy.mathematics.ExpressionParser;
import JScy.mathematics.ExpressionTree;

/**
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 */
public abstract class BaseTest {

    protected ExpressionParser parser = new ExpressionParser();
    protected ExpressionTree expressionTree = new ExpressionTree();
    protected Calculus calculus = new Calculus();
}
