package com.shareyoruba.calcengine;

/**
 * Created by makerofapps on 9/4/17.
 */
public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getLeftVal(){
        return leftVal;
    }

    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }



    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }


    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


    //Constructors
    public MathEquation(){

    }

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);  //chain up to previous constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }



    //Method
    public void execute(){

        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal + rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error invalid opCode");
                result = 0.0d;
                break;

        }

    }

}
