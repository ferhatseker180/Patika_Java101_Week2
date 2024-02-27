package HomeworkProjects.BoxingMatch;

public class Fighter {
    // Define variables
    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    // create constructor
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    // Game hit system
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " damage hit.");
        if (foe.dodge()) {
            System.out.println(foe.name + " is deflects incoming damage");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    // Make dodge posibility calculate
    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }


}
