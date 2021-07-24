package TuHuynh.Day02;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    static final int MAX_ARR_LENGTH = 10;

    static double averageArr (int[] arr, int totalNumber){
        int sumArr = Arrays.stream(arr).sum();
        return (double) sumArr/totalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double average;
        int[] arr = new int[MAX_ARR_LENGTH];
        int totalElements = MAX_ARR_LENGTH;

        System.out.println("Please input data (0 to exit program):");
        for (int index = 0; index <10; index ++){
            System.out.println("Element "+ index + ": ");
            int inputValue = scanner.nextInt();
            if(inputValue!=0){
                arr[index] = inputValue;
            }
            else{
                totalElements = index ++;
                break;
            }
        }

        average = averageArr(arr, totalElements);
        System.out.println("Average "+totalElements +" elements of array: "+ decimalFormat.format(average));
    }
}
