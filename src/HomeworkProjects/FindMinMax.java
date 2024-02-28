package HomeworkProjects;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinMax {

    // This function provides to find closest min value
    public static double findMin(double[] arr, double number) {

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < number) {
                return arr[i];
            }

        }
        return Double.NaN;
    }
    // This function provides to find closest max value
    public static double findMax(double[] arr, double number) {

        Arrays.sort(arr);
        for (double num : arr) {
            if (num > number) {
                return num;
            }
        }
        return Double.NaN;
    }

    public static void main(String[] args) {

        // Write a program that finds the closest number to the smallest number and the closest number to the largest number of the elements in the array.
        // We created array
        double[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        // Import Scanner and take value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        double number = input.nextDouble();

        // We run our function
        double min = findMin(arr, number);
        double max = findMax(arr, number);
        System.out.println("Closest Min Value : " + min + "\n" + "Closest Max Value: " + max);



        /* Find Min And Max
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

         */

    }
}
