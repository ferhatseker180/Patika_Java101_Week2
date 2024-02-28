package HomeworkProjects.CalculateEmployeeSalary;

public class Employee {
    // Define variables
    String name;
    int salary;
    int workHours;
    int hireYear;

    // Create Constructor
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Bonus Calculate Function
    public double bonus() {
        if (workHours>40){
            int perHours = 30;
           double bonusSalary = (workHours - 40)*perHours;
           return bonusSalary;
        }
        return 0;
    }
// Tax Calculate Function
    public double tax() {
      if (this.salary>1000){
          double tax;
         return tax = this.salary * 0.03;
      } else {
          return 0;
      }
    }

    // Raise Salary Function
    public double raiseSalary() {
       int nowYear = 2021;
       double experience = nowYear - hireYear;
       if(experience<10){
          return this.salary*0.05;
       }
       if (experience>9 && experience<20){
           return this.salary*0.1;
       }
      else {
           return this.salary*0.15;
       }
    }

    // Here we write the function that will show the information to the user.
    public void writeInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Raise Salary: " + raiseSalary());
        System.out.println("Salary with Tax and Bonuses: " + (this.salary + bonus() - tax()));
        System.out.println("Total Salary: " + (this.salary + bonus() - tax() + raiseSalary()));

    }

}
