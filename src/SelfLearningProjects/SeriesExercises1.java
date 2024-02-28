package SelfLearningProjects;

import java.util.Scanner;

public class SeriesExercises1 {
    public static void main(String[] args) {

/*
        //Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
               System.out.print(matrix[row][column] + " ");
            }
           System.out.println();
        }

        // İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
        int[][] matrix2 = new int[3][3];

        for (int row = 0; row < matrix2.length; row++) {
            for (int col=0; col<matrix2[row].length; col++){
                int random = (int) (Math.random() * 100);
                matrix2[row][col] = random;
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }



        /*
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            // Çıktısı 6 5
            // 4 3
            // 2 1
        }

         */

        // Foreach:
        int[] list = {1,2,3,5};
        for (int i: list){
            System.out.print(i + " ");
            // Çıktı: 1 2 3 5
        }
        int sum = 0;
        for (int i: list){
            sum += i;
        }
        System.out.println(sum); // Arraydaki tüm elemanları toplar ve 11 çıktısını verir.

        String[] cars = {"BMW","lamborgini","Porsche","Mercedes","Audi"};
        for (String i : cars){
            System.out.println(i + " ");
        }

        // Çok boyutlu matrislerde ForEach:
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] i : matrix){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
            // Çıktı: 1 2 3
            //4 5 6
            //7 8 9
        }
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }

    }

}
