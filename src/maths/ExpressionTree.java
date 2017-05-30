package maths;

import java.util.ArrayList;
import java.util.Stack;

/**
 * <p> This class represents a binary tree that represents an expression
 *     such that each node itself is an Expression and contains either
 *     one or two children, depending on if that Expression is a
 *     UnaryOperation or a BinaryOperation, respectively. </p>
 *
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @version     1.0
 * @see <a href="https://en.wikipedia.org/wiki/Binary_expression_tree">
 *      Wikipedia: Binary expression tree</a>
 */
class ExpressionTree {

    private Expression root;
    private String var;
    private ArrayList<String> tokens;

    ExpressionTree(String var, ArrayList<String> tokens) {

        this.var = var;
        this.tokens = tokens;
        root = constructTree(tokens);
    }

    public Expression getRoot() {

        return root;
    }

    // reads the "tokens" in order from the list and builds a tree
    public Expression constructTree(ArrayList<String> postTokens)
    {
        Expression root = null;
        Stack<Expression> nodes = new Stack<>();

        for(String str: postTokens)
        {
            if(str.matches("[0-9]+")) {
                nodes.push(new Constant(Double.parseDouble(str)));
            }
            else if(str.equals(var))
                nodes.push(new Variable(var));
            else if(!nodes.isEmpty() && ExpressionParser.isFunction(str)) {
                Expression function = matchFunc(str, nodes.pop());
                nodes.push(function);
            }
            else if(!nodes.isEmpty() && str.equals("$")) {
                Expression unaryMinus = new Negation(nodes.pop());
                nodes.push(unaryMinus);
            }
            else if(!nodes.isEmpty()){
                Expression binaryOperator = matchOperator(str, nodes.pop(), nodes.pop());
                nodes.push(binaryOperator);
            }
        }

        if(!nodes.isEmpty())
            root = nodes.pop();

        return root;
    }

    private Expression matchFunc(String str, Expression exp) {

        switch(str) {
            case "ln":
                return new NaturalLogarithm(exp);
            default: System.out.println("Ambiguous function");
                return null;
        }
    }

    private Expression matchOperator(String str, Expression left, Expression right) {

        switch(str) {
            case "+":
                return new Sum(left, right);
            case "-":
                return new Difference(left, right);
            case "*":
                return new Product(left, right);
            case "/":
                return new Quotient(left, right);

            default: System.out.println("Ambiguous function");
                return null;
        }
    }
}
