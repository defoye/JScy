/*
 *  UNFINISHED
 *
 *  TODO: private String createInfix(Expression root)
 *      TODO: second if statement
 */

package JScy.mathematics;

import JScy.mathematics.internal.*;

import java.util.ArrayList;
import java.util.Stack;

/**
 * <p> This class represents a binary tree that represents an expression
 *     such that each node itself is an Expression and contains either
 *     one or two children, depending on if that Expression is a
 *     UnaryOperation or a BinaryOperation, respectively. </p>
 *
 * @author      Ernest DeFoy <erniedefoy@yahoo.com>
 * @see <a href="https://en.wikipedia.org/wiki/Binary_expression_tree">
 *      Wikipedia: Binary expression tree</a>
 */
public class ExpressionTree {

    private Expression root;
    private String var;
    private double val;
    private ArrayList<String> tokens;

    public ExpressionTree() {

        init("x", new ArrayList<>());
    }

   public ExpressionTree(String var, ArrayList<String> tokens) {

        init(var, tokens);
    }

    public Expression getRoot() {

        return root;
    }

    public double getVal() {

        return val;
    }

    public void init(String var, ArrayList<String> tokens) {
        this.var = var;
        this.val = 0;
        this.tokens = tokens;
        root = constructTree(tokens);
    }

    public void simplify() {
        root.simplify();
    }

    public void derive() {
        root.derive();
    }

    public void derive(double val) {
        derive();

        // val = root.evalulate(val);
    }

    public String toString() {
        return createInfix(root);
    }

    //creates string representing infix expression
    public String createInfix(Expression root)
    {
        String str = "";

        if(root == null) {
            return str;
        }

        if (ExpressionParser.isOperand(root.getType(), var)) {
            str += root.getType();

        }
        else if(root.getType().equals("$")) {
            str += "-";
        }
        else if(ExpressionParser.isFunction(root.getType())) { // does not include unary minus
            str += root.getType();
            str += "(";
        }
        else {
            int parentPrecedence = ExpressionParser.getPrecedence(root.getType());

            str += root.getType();
            if(root.getLeftChild() != null && (ExpressionParser.getPrecedence(root.getLeftChild().getType()) < parentPrecedence || ExpressionParser.isLeftAssociative(root.getLeftChild().getType()))) {
                str += "(";
            }
				if(ExpressionParser.getPrecedence(root.getRightChild().getType()) < parentPrecedence) {
					str += ")";
				}
        }

        return createInfix(root.getLeftChild()) + str + createInfix(root.getRightChild());
    }

    // reads the "tokens" in order from the list and builds a tree
    public Expression constructTree(ArrayList<String> postTokens)
    {
        Expression root = null;
        Stack<Expression> nodes = new Stack<>();

        for(String str: postTokens)
        {
            if(str.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?")) {
                nodes.push(new Constant(Double.parseDouble(str)));
            }
            else if(str.equals(var)) {
                nodes.push(new Variable(var));
            }
            else if(!nodes.isEmpty() && ExpressionParser.isFunction(str)) {
                Expression function = matchFunc(str, nodes.pop());
                nodes.push(function);
            }
            else if(!nodes.isEmpty() && str.equals("$")) {
                Expression unaryMinus = new Negation(nodes.pop());
                nodes.push(unaryMinus);
            }
            else if(!nodes.isEmpty()){
                Expression right = nodes.pop();
                Expression binaryOperator = matchOperator(str, nodes.pop(), right);
                nodes.push(binaryOperator);
            }
        }

        if(!nodes.isEmpty())
            root = nodes.pop();

        return root;
    }

    public Expression matchFunc(String str, Expression exp) {

        switch(str) {
            case "ln":
                return new NaturalLogarithm(exp);
            case "log":
                return new Logarithm(exp);
            case "sin":
                return new Sine(exp);
            case "cos":
                return new Cosine(exp);
            case "tan":
                return new Tangent(exp);
            case "csc":
                return new Cosecant(exp);
            case "sec":
                return new Secant(exp);
            case "cot":
                return new Cotangent(exp);
            default: System.out.println("Ambiguous function");
                return null;
        }
    }

    public Expression matchOperator(String str, Expression left, Expression right) {

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