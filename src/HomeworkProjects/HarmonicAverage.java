package HomeworkProjects;

import java.util.Scanner;

public class HarmonicAverage {
    public static void main(String[] args) {
         // Create variable and series
        double sum = 0.0;
        double[] harmonic = {2.3, 3.2, 5.2, 4.8, 6.1};

        // We are defining our harmonic variable into i and we sum all of them
        for (int i = 0; i < harmonic.length; i++) {

            sum += 1 / harmonic[i];
        }
        // Average formul
        double average = harmonic.length / sum;
        System.out.println(average);


        /*
       Classic Technical:
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
