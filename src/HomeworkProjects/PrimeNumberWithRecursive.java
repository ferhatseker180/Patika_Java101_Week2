package HomeworkProjects;

import java.util.Scanner;

public class PrimeNumberWithRecursive {

    // The following function checks whether the number is prime or not
    public static boolean isPrimeNumber(int number, int dividing){

        if (number <= 2){
            return (number == 2);
        }
        if (number % dividing == 0){
            return false;
        }
        if (dividing * dividing > number){
            return true;
        }
        return isPrimeNumber(number, dividing + 1);
    }
    public static void main(String[] args) {

        // import scanner and take a value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number = input.nextInt();

        // check and print result
        boolean isPrime = isPrimeNumber(number,2);
        if (isPrime){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " isn't a prime number");
        }


    }
}
