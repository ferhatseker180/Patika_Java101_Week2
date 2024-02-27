package HomeworkProjects.BoxingMatch;

public class Match {
    // define variable
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    // create constructor
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Match system codes
    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                System.out.println("First Punch: " + firstDamage());
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("The weights of the athletes do not match.");
        }

    }

    // Compare and check weight
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    // Who is punches first?
    public String firstDamage() {
        int randomFighter = (int) (Math.random() * 2) + 1;
        if (randomFighter == 1) {
            return f1.name;
        } else {
            return f2.name;
        }

    }

    // Show match winner
    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    // show score in every round
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaning Health \t:" + f1.health);
        System.out.println(f2.name + " Remaning Health \t:" + f2.health);
    }
}
