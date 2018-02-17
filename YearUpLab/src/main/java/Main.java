
import java.util.Arrays;

/**
 * Created by makerofapps on 11/27/17.
 */
public class Main {

    /**
     * Year Up Students Work For
     * Monday, November 27th, 2017
     */
   // public static void DrillQuestions() {
        /**
         * Given the following legend
         *
         * f   >>   7
         * s   >>   $
         * 1   >>   !
         * a   >>   @
         *
         * your method should replace any character represented by a key in the legend, with its corresponding value.
         * Input  = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
         * Output = “T'h'e ''7.@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”
         *
         * output = The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer
         */
      //  }



//         [1     2    3     4    5     6    7]
//         "The small brown dog hopped the fence.”
//         [0     1    2     3    4     5    6] - index
//
//         "The  Wu  Tang  Wu  Hopped  Wu Fence"
  //       ===================================================


//        public static String replaceCharacters(String str) {
//                char [] strToChar = str.toCharArray();
//                char[] myCharKey = {'f', 's', '1', 'a'};
//                char[] myCharValue = {'7', '$', '!', '@'};
//                for (int x = 0; x < myCharKey.length; x++) {
//                    String key = String.valueOf(myCharKey[x]);
//                    String val = String.valueOf(myCharValue[x]);
//                    String bigF =  String.valueOf(strToChar[4]);
//
//                    if (str.contains(bigF) || str.contains(key)) {
//                        str = str.replace(bigF,val);
//                        str = str.replace(key, val);
//                    }
//                }
//                return str;
//            }

         /*"The  Wu  Tang  Wu  Hopped  Wu Fence"  |    int counter = 0;*/

        public static String replaceWuTangTwoThreeDivisible(String stringInput) {
            String[] strArray = stringInput.split(" ");
            for(int x = 0; x < strArray.length - 1; x++){  //index 0 - 4
                System.out.println(x+1 + " ====>>>");
                    if((x+1) % 2 == 0){   // 1,2,3,4,5,6 - check each time staring at postion
                        stringInput = stringInput.replace(strArray[x],"Wu");

                    }else if((x+1) % 3 == 0){
                        stringInput = stringInput.replace(strArray[x],"Tang");
                    }

            }
            return stringInput;
        }


        public static String createStringOfFibonnaciUpToMax(int maxnumber) {

            int first=0;
            int second=1;
            int next = 0;
            String formatted = "";
            for(int i = 0; i < maxnumber; i++) {
                if(i <= 1) {
                    next = i;
                    formatted = "0";
                }else if(next < maxnumber){
                    formatted += String.valueOf("," + next);
                    next = first + second;
                    first = second;
                    second = next;
                }
            }
            return formatted;
        }




    public static String extractAllOddNumbers(int[] numbers) {
        Arrays.sort(numbers);
        String formatted="";
        int counter = 0;
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] % 2 != 0){
                if(counter == 0){
                    formatted += numbers[x];
                }else {
                    formatted += "," + numbers[x];
                }
                counter++;
            }
        }
        return formatted;
    }


    public static String extractAllEvenNumbers(int[] numbers) {
        Arrays.sort(numbers);
        String formatted="";
        int counter = 0;  // used to check first iteration
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] % 2 == 0){
                if(counter == 0){ //if first iteration
                    formatted += numbers[x];  // do not add a comma
                }else {
                    formatted += "," + numbers[x];
                }
                counter++;
            }
        }
        return formatted;


    }

   // new int[]{2, 5, 6, 7, 23, 4, 8, 12, 9}




    public static String replaceCharacters(String str) {
        char[] strToChar = str.toCharArray();
        String[] myCharKey = {"f", "s", "1", "a"};
        String[] myCharValue = {"7", "$", "!", "@"};
        String bigF = String.valueOf(strToChar[4]);
            for (int x = 0; x < myCharKey.length; x++) {
                if (str.contains(bigF) || str.contains(myCharKey[x])) {
                    str = str.replace(bigF, myCharValue[x]).replace(myCharKey[x], myCharValue[x]);
                }
            }
            return str;
        }




        /*
        Write a java method to count all the words in a string
         */

        public static int WordsInAStringCounter(String str){

          String[] strArray = str.split(" ");
          int count = 0;

         if(!(" ".equals(str.substring(0,1))) || (!(" ".equals(str.substring(str.length() - 1))))){

             for(int x = 0; x < strArray.length ; x ++){

                 if (strArray[x].equals("")){
                     count -= count;
                 }
                    count++;
             }

           }
            return count ;

        }

        /**
         * Return the average value of an array
         */
        public static double average(double[] doubleArray) {
            int sum = 0;

            for(int x = 0; x < doubleArray.length; x ++){
                sum += doubleArray[x];
            }

            return sum / doubleArray.length;
        }
        /**
         * Swap the first element in an array with the last element in an array and return
         */
        public static String[] swap(String[] stringArray) {
          String temp = stringArray[0]; //assign to first array to temp var
          stringArray[0] = stringArray[stringArray.length - 1];  // assign last to first
          stringArray[stringArray.length - 1] = temp;  // reassign temp var to last index
            return  stringArray;
        }


        /**
         * Print the largest value in the array
         */


//    public static int printLargest(int[] ar) {
//        int[] sortedArr = new int[ar.length];  //fresh array based on length of arg
//        for (int i = 0; i < ar.length; i++) {
//            sortedArr[i] = ar[i];
//        }
//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int x = 0; x < sortedArr.length - 1; x++) {
//                if (sortedArr[x] < sortedArr[x + 1]) {
//                    temp = sortedArr[x];
//                    sortedArr[x] = sortedArr[x + 1];
//                    sortedArr[x + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        System.out.println("-----");
//        return sortedArr[0];
//    }
        /**
         * Print the lowest value in the array
         */

//        public static int printLowest(int[] ar) {
//            int[] sortedArr = new int[ar.length];  //fresh array based on length of arg
//            for (int i = 0; i < ar.length; i++) {
//                sortedArr[i] = ar[i];
//            }
//            boolean flag = true;
//            int temp;
//            while (flag) {
//                flag = false;
//                for (int x = 0; x < sortedArr.length - 1; x++) {
//                    if (sortedArr[x] < sortedArr[x + 1]) {
//                        temp = sortedArr[x];
//                        sortedArr[x] = sortedArr[x + 1];
//                        sortedArr[x + 1] = temp;
//                        flag = true;
//                    }
//                }
//            }
//            System.out.println("-----");
//            return sortedArr[sortedArr.length - 1];
//
//        }

        //A, E, I, O, U, and sometimes Y.
       //strin - w3resource

        public static int VowelsCounter(String str){
            char[] strArray = str.toCharArray();
           char[] vowels = {'a','e','o','i','u'};
           int counter = 0;
           for(int x = 0; x < str.length(); x++){
               for(int y = 0; y < vowels.length; y++){
                   if(strArray[x] == vowels[y]){
                       counter++;
                   }
               }
           }

            return counter;
        }



    public static void main(String[] args) {

       String[] arr = {"A1","B2","C3"};
        int[] numArr = {2, 5, 6, 7, 23, 4, 8, 12, 9, 0};
       double[] numbers = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
//        printArrays(numArr);
   System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar’s worth of fertilizer"));
       System.out.println(Arrays.toString(swap(arr)));
     //  System.out.println( printLargest(numArr));
      //  System.out.println(printLowest(numArr));
        System.out.println(average(numbers));
//        System.out.println(Arrays.toString(numArr));
       System.out.println(average(numbers) + " average result");
        System.out.println(WordsInAStringCounter("Wu Tang Clan For Ever"));
       System.out.println(createStringOfFibonnaciUpToMax(18));
     System.out.println(extractAllOddNumbers(numArr));
      System.out.println(extractAllEvenNumbers(numArr));
        System.out.println(VowelsCounter("WuTangClan"));
//
       System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
       String[] dog = "The small brown dog hopped the fence".split(" ");
        System.out.println(Arrays.toString(dog));
        System.out.println(dog.length - 1);

        }





}
