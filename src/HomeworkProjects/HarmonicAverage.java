package HomeworkProjects;

import java.util.Scanner;

public class HarmonicAverage {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number = input.nextInt();
        double sum = 0.0;
        double[] harmonic = new double[number];

        for (double i = 0; i<harmonic.length; i++){

             // sum += (1/i);
            System.out.print(1/i + " ");
        }
        double average = number / sum;
      //  System.out.println("Harmonic Numbers Average: " + average);



        /*
        // define variable
        int number;
        double result = 0.0;

        // Import scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = input.nextInt();

        // Find harmonic numbers and sum all of them
        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("Harmonic Numbers sum = " + result);

         */
    }
}
