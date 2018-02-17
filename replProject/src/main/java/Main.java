/**
 * Created by makerofapps on 11/17/17.
 */
public class Main {

    public static int getLastIndex(String[] names) {
        return  names.length - 1;
        //return 123;
    }

    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
        //return 123;
    }

    public static String getFirstElement(String[] names) {
   //     String[] arr = {"b","c","d"};
   //     arr[0] = "xyz";
   //     System.out.println(arr[0]);

          return "a"; //names[0];
       // return "78";


    }



    public static String getLastElement(String[] names) {
        int size = names.length - 1;
        return names[size];
        //return "yyy";

    }

    public static String getSecondToLastElement(String[] names) {
       return names[names.length - 2];
       //return "";
    }


    public static int getSum(int[] ints) {
        int sum = 0;

        for(int x = 0; x < ints.length; x++){
            sum += ints[x];
        }

        return sum;
       // return 60;
    }

    public static int getAverage(int[] ints) {
        int average = 0;
        for( int x = 0; x < ints.length; x++){
            average += ints[x];
        }
        System.out.println("The average is " + average / ints.length);
        return average / ints.length;
//        int sum = 0;
//        for(int j = 0; j < ints.length; j++){
//            sum += ints[j];
//        }
//        return sum / ints.length;
//        //return 4;
    }

    public static boolean contains(String[] names, String element) {

        for(String n :names){
            if(n.equalsIgnoreCase(element)){
                return true;
            }
        }
        return false;

    }

    public static int getIndexByElement(String[] names, String element) {
        for(int x = 0; x <names.length; x++){
            if(names[x].equalsIgnoreCase(element)){
                return x;
            }
        }
        return -1;

    }

    //More questions by Mikaila

//    public static void printOddNumbersInRange(int start, int end){
//        while(start >= end){
//            if(start % 2 != 0){
//                System.out.print("odd"+ start + " ");
//            }
//            start--;
//        }
//    }


    public static String printOddNumbersInRange(int start, int end){
        String result = "";
        //int Start = 19;
       // int End = 3;
        while(start>=end) {
            if(start%2!=0) {
                result += start;
            }
            start--;   }
        return result;

    }
    /*
     String result = "";
      while(start>=end) {
			if(start%2 !=0) {
		  result +=  start;}
			start--;}
      return result;
      }
     */



    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String result = "";
        for (int i=0; i< n; i++) {
            result += str;
        }
        return result;
    }




    public static String repeatFirstThreeLetters(String str, int n) {

        int frontLen = 3;

        if (frontLen > str.length()) {

            frontLen = str.length();
        }

        String front = str.substring(0, frontLen);

        String result = "";

        for (int i= 0; i< n; i++) {
            result +=  front;
        }

        return result;
    }



//	    public static void continueDemo(){
//	    	while(int x = 0; x < 10; x++){
//	    		if(x == 7){
//
//	    		}
//	    		System.out.println(x);
//	    	}


    public static void main(String[] args) {
        String[] names = {"a","b","c","d","e"};
        int[] numbers  = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Main.getLastIndex(names));
        System.out.println(Main.getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        System.out.println(contains(names, "c"));
        System.out.println(getIndexByElement(names, "B"));
        System.out.println(printGivenStringTimesNumberGiven("ha",3));
        System.out.println(repeatFirstThreeLetters("chocolate", 3));
        //printOddNumbersInRange(20,3);
        System.out.println(printOddNumbersInRange(20,3));
    }

}

