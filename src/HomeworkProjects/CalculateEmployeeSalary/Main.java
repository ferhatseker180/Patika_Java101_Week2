package HomeworkProjects.CalculateEmployeeSalary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.print("What is your salary: ");
        int salary = input.nextInt();
        System.out.print("How many hours did you work: ");
        int workHours = input.nextInt();
        System.out.print("What is your hire year: ");
        int hireYear = input.nextInt();

        // We create Employee object
        Employee worker1 = new Employee(name, salary, workHours, hireYear);
        worker1.writeInfo();
    }
}
