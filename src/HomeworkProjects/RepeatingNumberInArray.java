package HomeworkProjects;

public class RepeatingNumberInArray {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Program to find repeating even numbers

        // Define array and variables
        int[] list = {1, 2, 3, 1, 4, 5, 5, 1, 6,2,4};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        // We are surfing i and j elements and we controlled which number is double
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && ((list[i] %2 == 0) && (list[j] %2 == 0) && list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }

            }
        }

        // Numbers are prevented from repeating
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println("Repeating even numbers: " + value + " ");
            }
        }

        /*

        // Program to find repeating all numbers
        int[] list = {1, 2, 3, 1, 4, 5, 5, 1, 6};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }

            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }

         */

    }
}
