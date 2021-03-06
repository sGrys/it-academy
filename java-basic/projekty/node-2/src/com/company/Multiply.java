package com.company;

public class Multiply extends Operator {
    public Multiply(Node left, Node right){
        super("*", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()*right.evaluate();
    }
    protected boolean requiresBrackets()
    {
        return false;
    }
}
