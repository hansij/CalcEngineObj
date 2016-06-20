package com.pluralsight.calcengineobj;

/**
 * Created by Elev12 on 2016-06-17.
 */
public class Subtracter extends CalculateBase {
    public Subtracter(){}
    public Subtracter(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
