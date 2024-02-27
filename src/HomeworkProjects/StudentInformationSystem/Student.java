package HomeworkProjects.StudentInformationSystem;

public class Student {
    // Define variables
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course physics;
    Course chemical;
    double average;
    boolean isPass;

    // Create Student Constructor
    Student(String name, String stuNo, int classes, Course mat, Course physics, Course chemical) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.physics = physics;
        this.chemical = chemical;
        calculateAverage();
        this.isPass = false;
    }

    // Create Taking Exam Notes System
    public void addBulkExamNote(int mat, int physics, int chemical) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.note = chemical;
        }
    }

    // Create Taking Spoken Exam Notes System
    public void addSpokenExamNote(int mat, int physics, int chemical) {
        if (this.mat.spokenExam >= 0 && this.mat.spokenExam <= 100) {
            this.mat.spokenExam = mat;
        }

        if (this.physics.spokenExam >= 0 && this.physics.spokenExam <= 100) {
            this.physics.spokenExam = physics;
        }
        if (this.chemical.spokenExam >= 0 && this.chemical.spokenExam <= 100) {
            this.chemical.spokenExam = chemical;
        }

    }

    // Compare Notes and give warning
    public void isPass() {
        if (this.mat.note == 0 || this.physics.note == 0 || this.chemical.note == 0) {
            System.out.println("Grades not entered correctly");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed The Class");
            } else {
                System.out.println("Failed The Class");
            }
        }
    }

    // Calculate student courses notes
    public void calculateAverage() {
        this.average = ((this.physics.note * 0.8 + this.physics.spokenExam * 0.2) +
                (this.chemical.note * 0.8 + this.chemical.spokenExam * 0.2) +
                (this.mat.note * 0.8 + this.mat.spokenExam * 0.2)) / 3;
    }

    // Check pass situation
    public boolean isCheckPass() {
        calculateAverage();
        return this.average > 55;
    }

    // Show notes from Student
    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematical Exam Note : " + this.mat.note);
        System.out.println("Mathematical Spoken Exam Note : " + this.mat.spokenExam);
        System.out.println("Physics Exam Note : " + this.physics.note);
        System.out.println("Physics Spoken Exam Note : " + this.physics.spokenExam);
        System.out.println("Chemical Exam Note : " + this.chemical.note);
        System.out.println("Chemical Spoken Exam Note : " + this.chemical.spokenExam);

    }

}
