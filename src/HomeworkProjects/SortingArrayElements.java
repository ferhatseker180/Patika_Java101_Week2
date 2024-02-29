package HomeworkProjects;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayElements {
    public static void main(String[] args) {

        // Import Scanner and create array
        Scanner input = new Scanner(System.in);
        System.out.print("Size of the Array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        // Take number for users and assigment number into arr
        for (int i = 0; i<size; i++){
            System.out.print("Enter The Number: ");
            int number = input.nextInt();
            arr[i] = number;
        }

        // Elements in the array are sorted and printed
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

    }
}
