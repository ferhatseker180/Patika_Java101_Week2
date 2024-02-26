package HomeworkProjects;

import java.util.Scanner;

public class ExponentialWithRecursive {

    // Exponentiation function with recursive method
    public static int calculatePower(int baseValue, int exponentValue) {

        if (exponentValue == 0) {
            return 1;
        } else {
            return baseValue * calculatePower(baseValue, exponentValue - 1);
        }

    }

    public static void main(String[] args) {

        // Import Scanner and take user value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int baseValue = input.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponentValue = input.nextInt();

        System.out.println("Result = " + calculatePower(baseValue, exponentValue));

    }
}
