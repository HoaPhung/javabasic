package TuHuynh.Day02;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    static int countOcurrencesOfNumber(int[] arr, int number){
        int count = 0;
        for (int index = 0; index < arr.length; index ++){
            if (arr[index] == number)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] myArr = new int[]{10,11,22,22,22,33,44,55};
        Arrays.sort(myArr);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Please input a number (enter 0 to exit the program): ");
            int inputValue = scanner.nextInt();
            int counter = countOcurrencesOfNumber(myArr, inputValue);

            if(inputValue == 0){
                System.out.println("Byte");
                System.exit(1);
            }
            else {
                if (counter == 0) {
                    System.out.println(inputValue + " did not appear");
                } else {
                    System.out.println("Times: " + counter);
                }
            }
        }
    }

}
