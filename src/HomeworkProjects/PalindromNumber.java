package HomeworkProjects;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check if it is a palindrome: ");
        int number = input.nextInt();
        System.out.println("Your Number: " + number);

        System.out.println("Is the entered number a palindrome? : " + isPalindrom(number));
    }

    public static boolean isPalindrom(int number){
        int tempNumber = number, reverseNumber = 0, lastNumber;

        while (tempNumber != 0){
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /=10;
        }

        if (reverseNumber == number){
            return true;
        }else {
            return false;
        }

    }
}
