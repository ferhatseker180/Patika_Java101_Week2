package HomeworkProjects;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Import Scanner and Take User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Which element in the Fibonacci sequence do you want to see the result of: ");
        int count = input.nextInt();

        // Show Result
        System.out.println("Result = " + findFibonacci(count));
    }

    // Our calculate function
    public static int findFibonacci(int count){
        if (count == 1 || count == 2){
            return 1;
        }
        return findFibonacci(count - 1) + findFibonacci(count - 2);
    }
}
