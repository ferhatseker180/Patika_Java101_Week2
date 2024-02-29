package SelfLearningProjects;

import java.util.Arrays;

public class CopyArray {

    // Our own copying method
    public static int[] copyArray(int[] source) {
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }
        return copy;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2, 5, 4, 6};
        int[] arr2 = new int[arr1.length];

        // First Technic: System.arraycopy(): First array, start point, Second array, start point, count of element
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // Second Technic: clone();
        int[] arr3 = arr1.clone();
        System.out.println(Arrays.toString(arr3));

        // Recommend Technique: Arrays.copyOf() and Arrays.copyOfRange()
        int[] arr4 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = Arrays.copyOfRange(arr1, 1, 3); // 1 to 3 index and 3 not include
        System.out.println(Arrays.toString(arr5)); // Output: 3 , 2

        // System.arrayCopy() : This snippet copies a specific part of the array (2 elements starting from index 1) into an array named 'destination'.
        int[] a = {2, 4, 5, 3, 6};
        int[] a2 = new int[a.length];
        System.arraycopy(a, 1, a2, 0, 2);
        System.out.println(Arrays.toString(a2)); // Output: [4, 5, 0, 0, 0]

        // Copying a specific part of a large array
        int[] source = new int[1000];
        int[] destination = new int[500];
        System.arraycopy(source, 250, destination, 0, 500);

        // Copying the string in reverse order
        int[] original = {1, 2, 3, 4, 5};
        int[] reverse = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
            // Output: {5, 4, 3, 2, 1}
        }

        // Copying array to another array and doubling the elements of the copy
        int[] org = {1, 2, 3, 4, 5};
        int[] doubleValues = new int[original.length];

        for (int i = 0; i < org.length; i++) {
            doubleValues[i] = original[i] * 2;
        }
       // Output: {2, 4, 6, 8, 10}


    }
}
