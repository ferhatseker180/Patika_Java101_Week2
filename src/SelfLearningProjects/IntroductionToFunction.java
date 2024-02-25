package SelfLearningProjects;

import java.util.Scanner;

public class IntroductionToFunction {

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter The First Number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter The Second Number: ");
            double num2 = input.nextDouble();
            System.out.print("1-> +\n2-> -\n3-> *\n4-> /\nWhich Operator Will You Choose: ");
            int operator = input.nextInt();

            double result = calculateMachine(num1,num2,operator);
            System.out.println(result);

        }catch (Exception e){
            System.out.println("Error!");

        }
    }

    public static double calculateMachine(double num1, double num2, int operator){

        double result = 0;
        switch (operator){
            case 1 :  result = num1 + num2; break;
            case 2 :  result = num1 - num2; break;
            case 3 :  result = num1 * num2; break;
            case 4  : result = num1 / num2; break;
        }
        return result;
    }

}
