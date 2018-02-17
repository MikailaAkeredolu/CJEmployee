package BoxingUnboxing.io;

import java.util.ArrayList;

/**
 * Created by makerofapps on 12/5/17.
 */

class IntClass{


    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }




}



//Main
public class Main {
    public static void main(String[] args) {

        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");


        ArrayList<IntClass>intClassArrsyList = new ArrayList<IntClass>();
        intClassArrsyList.add(new IntClass(54));

        Integer integer = new Integer(69);
        Double doubleValue = new Double(12.26);

        ArrayList<Integer> intArList = new ArrayList<Integer>();

        //Autoboxing - convert small int to Integer
        for (int x = 0; x <= 10; x++){
            intArList.add(Integer.valueOf(x));
        }

        //Boxing - Convert Integer to int
        for (int x = 0; x <= 10; x++){
            System.out.println(x + " ---> " + intArList.get(x).intValue());
        }

        //Automatic Autoboxing by Java
        Integer myIntValue = 55;   //Compiler doing this - Integr.valueOf(55)

        int myInt = myIntValue.intValue();    //Compile is doing myInt.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));  //autoboxing
          //  myDoubleValues.add(dbl);  - will still work cos compiler does above for you

            // System.out.println(myDoubleValues);
        }
        System.out.println("=======================");
        for(int x = 0; x < myDoubleValues.size(); x++){
                double val = myDoubleValues.get(x).doubleValue(); //unboxing
            System.out.println(x + " ---> " + val);
        }

    }
}
