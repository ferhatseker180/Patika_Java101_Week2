package HomeworkProjects;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        // Create array and define element of array
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        // We must count of repeated number
        int count = 0;
        // I sorted because I want to clean and regular array
        Arrays.sort(arr); // 5,10,10,10,20,20,20,20

        // The first loop is to browse through each element of the array.
        // The reason we ask whether it is equal to -1 in the if block is that the value is checked with a value that cannot be counted again after being counted,
        // so instead of -1 we could have said -2 etc.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println("Number " + arr[i] + " : " + "Repeated " + count + " times");
            }
        }


    }
}
