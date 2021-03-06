package com.company.operators;

import com.company.Node;

public class Power extends Operator {

    public Power(Node left, Node right) {
        super("^", left, right);
    }


    public double evaluate() {
        return Math.pow(left.evaluate(),right.evaluate());
    }

    public Power(){
        super("^");
    }
    public Operator
    makeNew(){
        return new Power();
    }
}
