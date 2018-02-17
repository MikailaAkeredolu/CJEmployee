package com.shareyoruba.calcengine;

public class Main {

    public static void main(String[] args) {

        //Use constructor
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

            for (MathEquation equation : equations) {
                equation.execute();
                System.out.print("Results = ");
                System.out.println(equation.getResult());
            }

        }

    //Method to create new instance of MathEquation
//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//        return equation;
//
//
//    }

}


//        double val1 = 100;
//        double val2 = 50;
//        double result;
//        char opCode = 'm';

//        if (opCode == 'a')
//            result = val1 + val2;
//        else if (opCode == 's')
//            result = val2 - val1;
//        else if (opCode == 'd') {
//            result = val2 != 0 ? val1 / val2 : 0.0d;
////            if(val2 != 0)
////            result = val1 / val2;
////        else
////            result = 0.0d;
//
//        }else if (opCode == 'm')
//            result = val1 * val2;
//        else {
//            System.out.println("Error - invalid op code");
//            result = 0.0d;
//
//        }
//        System.out.println(result);

    //FACTORIAL

    //While loop

//    int value = 5;
//    int factorial = 1;
//
//        while(value > 1) {
//                factorial = factorial * value;
//                value -= 1;
//                }
//                System.out.println("Factorial is =  " + factorial);
//
//
//
//                //Do while loop - while less than 100
//                int iVal = 5;
//
//                do {
//                System.out.print(" * 2 = ");  //does not go to a new line
//                iVal = iVal * 2;
//                System.out.println(iVal);
//                }while (iVal < 100);



        //Arrays
        //Sum of values within an array
        //float[] theVals = new float[3];  // Allocate space to store 3 floats
//        theVals[0] = 10.0f; //store 10 in index 0;
//        theVals[1] = 20.0f;
//        theVals[2] = 15.0f;

//        float[] theVals = {10.0f, 20.0f, 15.0f};
//
//        float sum = 0.0f;

//        for(int x = 0; x < theVals.length; x++){
//            sum += theVals[x];
//        }
//        System.out.println(sum);


        //For Each Loop

//        for (float cVal: theVals) {
//        sum += cVal;
//        System.out.println(sum);
//        }
//
//
//        //Switch statements
//
//        int switchValue = 10;
//
//        switch(switchValue % 2){
//        case 0:
//        System.out.println(switchValue + " is even");
//        break;
//        case 1:
//        System.out.println(switchValue + " is odd");
//        break;
//default:
//        System.out.println("oops it broke");
//        break;
//
//
//        }
//
//
//        }

