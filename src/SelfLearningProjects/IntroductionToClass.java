package SelfLearningProjects;

import java.util.Scanner;

public class IntroductionToClass {

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    int increaseSpeed(int increment) {
        if (speedLimit<180){
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

    void printSpeed(){
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        IntroductionToClass mercedes = new IntroductionToClass();

        Scanner input = new Scanner(System.in);

        System.out.print("What model will your car be: ");
        mercedes.model = input.nextLine();
        System.out.print("What color will your car be: ");
        mercedes.color = input.nextLine();
        mercedes.speed = 100;
        System.out.print("At what km speed do you want to fix your speed: ");
        mercedes.speedLimit = input.nextInt();


        System.out.print("Your car model: " + mercedes.model + "\nYour car color: " + mercedes.color);

        // Cruise Control System Design
        if (mercedes.speed> mercedes.speedLimit){
            mercedes.decreaseSpeed(mercedes.speed - mercedes.speedLimit);
            System.out.println("Your speed: " + mercedes.speed);
        }
        if (mercedes.speed< mercedes.speedLimit){
            mercedes.increaseSpeed(mercedes.speedLimit - mercedes.speed);
            System.out.println("Your Speed: " + mercedes.speed);
        }


    }


}


