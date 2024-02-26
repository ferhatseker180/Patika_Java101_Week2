package HomeworkProjects;

import java.util.Scanner;

public class CalculateMachine {

    public static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();
        int result = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + "." + "Number: ");
            int number = input.nextInt();
            result += number;
        }
        System.out.println("Result = " + result);
    }

    public static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();
        int result = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + "." + "Number: ");
            int number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;

        }
        System.out.println("Result = " + result);
    }

    public static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();
        int result = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + "." + "Number: ");
            int number = input.nextInt();
            if (number == 0) {
                result = 0;
            }
            if (number == 1) {
                break;
            }
            result *= number;
        }
        System.out.println("Result = " + result);
    }

    public static void divided() {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + "." + "Number: ");
            number = input.nextDouble();
            if (i != 0 && number == 0) {
                System.out.println("The value of the divisor cannot be 0");
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result = " + result);
    }

    public static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int baseValue = input.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponentValue = input.nextInt();
        int result = 1;
        for (int i = 1; i <= exponentValue; i++) {
            result *= baseValue;
        }
        System.out.println("Result = " + result);
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be factored: ");
        int number = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Result = " + result);
    }

    public static void takeMod() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int result = firstNumber % secondNumber;
        System.out.println("Result = " + result);
    }

    public static void calculateRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first edge length: ");
        int firstEdge = input.nextInt();
        System.out.print("Enter the second edge length: ");
        int secondEdge = input.nextInt();

        if (firstEdge == secondEdge) {
            System.out.println("Wrong Edge Information");
        } else {
            double perimeter = (firstEdge + secondEdge) * 2;
            double area = firstEdge * secondEdge;

            System.out.println("Rectangle Perimeter = " + perimeter);
            System.out.println("Rectangle Area = " + area);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n" + "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n" + "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Which operation do you choose: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    takeMod();
                    break;
                case 8:
                    calculateRectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Uncorrect Value, Please Try Again...");
            }
        } while (select != 0);


    }
}
