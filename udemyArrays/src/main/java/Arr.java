import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by makerofapps on 11/22/17.
 */
public class Arr {
    /*
    Challenge for Arrays

     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int []arrSort = getIntegers(5);
        int[] sortIT = sortIntegers(arrSort);
        printArrays(sortIT);

        //method to create arrays
        System.out.println(Arrays.toString(CreateAr()));

      }

    public static int[] sortIntegers(int[] ar){
        int[] sortedArr = new int[ar.length];  //fresh array based on length of arg
        for(int i = 0; i < ar.length; i++){
            System.out.println( "===" + ar.length);
            sortedArr[i] = ar[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int x = 0; x < sortedArr.length - 1; x++){ // 0 < 4  //index
                System.out.println(Arrays.toString(sortedArr));
                System.out.println(sortedArr.length - 1);
                if(sortedArr[x] < sortedArr[x + 1]){
                    temp = sortedArr[x];
                    sortedArr[x] = sortedArr[x + 1];
                    sortedArr[x + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArr;
    }

    public static void printArrays(int[] a){
        //a = getIntegers(5);
        for(int y = 0; y < a.length; y++){
            System.out.println("Value " + y + " : " + a[y]);
        }
    }

    public static int[] getIntegers( int numbers){
        int[] arr = new int[numbers];
        System.out.println("enter numbers \r");
        for(int x = 0; x < arr.length; x++){
            numbers =  scanner.nextInt();
            arr[x] = numbers;
        }
        return arr;
    }

    //Create an array with a for loop



    public static int[] CreateAr(){

       int[] arrayToCreate = new int[10];
//        for(int x = 0; x < arrayToCreate.length;  x++){
//            arrayToCreate[x] = x * 10;
//        }
//        return arrayToCreate;
        int x = 1;

        while(x < arrayToCreate.length){
            arrayToCreate[x] = x * 10;
            x++;
        }
       return arrayToCreate;
    }



}


