package com.company;

public class Divide extends Operator {
    public Divide(Node left, Node right){
        super("/", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()/right.evaluate();
    }
    protected boolean requiresBrackets()
    {
        return false;
    }
}
