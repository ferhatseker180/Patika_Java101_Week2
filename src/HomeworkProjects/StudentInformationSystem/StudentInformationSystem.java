package HomeworkProjects.StudentInformationSystem;

public class StudentInformationSystem {
    public static void main(String[] args) {

        // We add lesson information
        Course mat = new Course("Mathematical","MAT101","MAT");
        Course physics = new Course("Physics","Phy01","PHY");
        Course chemical = new Course("Chemical", "Chemical101","CHMC");

        // We add teacher information
        Teacher t1 = new Teacher("Murat","900521354","MAT");
        Teacher t2 = new Teacher("Zekai","123456890","PHY");
        Teacher t3 = new Teacher("Jonathon","472365147","CHMC");

        // We add in system there.
        mat.addTeacher(t1);
        physics.addTeacher(t2);
        chemical.addTeacher(t3);

        // We add Student and student courses notes
        Student s1 = new Student("Laz Ziya","13",140123321,mat,physics,chemical);
        s1.addBulkExamNote(100,80,50);
        s1.addSpokenExamNote(90,70,60);
        s1.isPass();

        Student s2 = new Student("Testere Necmi","180",756321478,mat,physics,chemical);
        s2.addBulkExamNote(50,90,60);
        s2.addSpokenExamNote(50,90,60);
        s2.isPass();

        Student s3 = new Student("Hüsrev Ağa","247",145365147,mat,physics,chemical);
        s2.addBulkExamNote(60,40,100);
        s2.addSpokenExamNote(60,40,100);
        s2.isPass();

    }
}
