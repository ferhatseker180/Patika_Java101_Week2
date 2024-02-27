package HomeworkProjects.BoxingMatch;

public class Main {
    public static void main(String[] args) {

        // create object
        Fighter ali = new Fighter("Muhammed Ali", 20, 100, 90, 0);
        Fighter holmes = new Fighter("Lary Holmes", 10, 95, 100, 0);
        Match r = new Match(ali, holmes, 90, 100);
        r.run();
    }
}
