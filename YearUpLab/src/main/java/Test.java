/**
 * Created by makerofapps on 11/28/17.
 */
public class Test {
    public static int printLargest(int[] ar) {
        int[] sortedArr = new int[ar.length];  //fresh array based on length of arg
        for (int i = 0; i < ar.length; i++) {
            sortedArr[i] = ar[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int x = 0; x < sortedArr.length - 1; x++) {
                if (sortedArr[x] < sortedArr[x + 1]) {
                    temp = sortedArr[x];
                    sortedArr[x] = sortedArr[x + 1];
                    sortedArr[x + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("-----");
        return sortedArr[sortedArr.length - 1];
    }
    public static void main(String[] args) {
        int[] testArray = {90, 100, 80, 30, 70};
        System.out.println(printLargest(testArray));
    }
}
