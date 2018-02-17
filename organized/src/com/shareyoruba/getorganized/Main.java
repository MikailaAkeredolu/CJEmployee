package com.shareyoruba.getorganized;

public class Main {

    public static void main(String[] args) {
        //local variable
       float floatVal = 1.0f;
       double doubleVal = 4.0d;
       byte byteVal = 7;
       short shortVal = 7;
       long longVa = 5;

        //
       short result1 = (short)longVa;
       short result2 = (short)( byteVal - longVa);
       float result3 = (long)(longVa - doubleVal);
       long result4 = (long) (shortVal - longVa + floatVal + doubleVal);

       System.out.println("logged out =>  " +  result4);


    }
}


