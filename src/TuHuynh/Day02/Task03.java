package TuHuynh.Day02;

import java.util.Arrays;

public class Task03 {

    static int[] bubbleSort(int[] myArr){
        int length = myArr.length;
        int tempValue;
        boolean swapped;

        for (int index = 0; index <length -1; index++){
            swapped = false;
            for (int nextIndex = 0; nextIndex < length-index-1; nextIndex++){
                if (myArr[nextIndex]>myArr[nextIndex+1]){
                    tempValue = myArr[nextIndex];
                    myArr[nextIndex] = myArr[nextIndex+1];
                    myArr[nextIndex+1] = tempValue;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;;
        }

        return  myArr;
    }

    public static void main(String[] args) {
        int[] myArr = new int[] {1,3,2,5,4,0};
        Arrays.sort(myArr);
        System.out.println("Sorted Arr: " + Arrays.toString(myArr));
    }
}
