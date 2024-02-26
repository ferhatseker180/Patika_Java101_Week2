package HomeworkProjects;

import java.util.Scanner;

public class StopTargetWithRecursive {

    // Recursive Technical
    public static void numberProcess(int number) {

        if (number > 0) {
            System.out.print(number + " ");
            numberProcess(number - 5);
        } else if (number < 0) {
            System.out.print(number + " ");
            numberProcess(number + 5);
        } else {
            System.out.print(number + " ");
            for (int i = 5; i <= 20; i += 5) {
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number = input.nextInt();
        numberProcess(number);

        // Classic Technical
        /*
        while (temp>0){
            System.out.print(temp+" " );
            temp -= 5;
        }
        while (temp<=number){
            System.out.print(temp + " ");
            temp +=5;

        }

         */
    }
}
