package TuHuynh.Day02;

import java.util.Arrays;

public class Task04 {

    static int[] revertArr( int[] arr, int length){
        int tempValue;
        for (int index = 0; index < length/2; index++){
            tempValue = arr[index];
            arr[index] = arr[length-index-1];
            arr[length-index-1] = tempValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] myArr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Reverted Arr: " + Arrays.toString(revertArr(myArr, myArr.length)));
    }
}
