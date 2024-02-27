package SelfLearningProjects;

import java.util.Scanner;

public class IntroductionToConstructor {

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    IntroductionToConstructor(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    int increaseSpeed(int increment) {
        if (speedLimit < 180) {
            speed += increment;
        }
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed >= 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed: " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
        System.out.println("Speed Limit : " + this.speedLimit);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IntroductionToConstructor car = new IntroductionToConstructor("Mercedes","Red",240);
        car.printInfo();

    }
}
