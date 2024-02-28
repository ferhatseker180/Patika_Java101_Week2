package SelfLearningProjects;

public class IntroductionToSeries {

    // We assigned the array as a parameter to the function.
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        // We are coping main series.
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {

        // Create Basic Series
        double[] series1 = new double[5];
        // double: type series 1 : name  [5]: number of elements in the series

        // List 0.index
        series1[0] = 9;
        System.out.println(series1[0]);

        double[] series2 = {1.1, 2.1, 3.1, 4.1};

        int[] series3 = {1, 2, 3, 4, 5};

        // printArray(series2);
        int[] newList = reverse(series3);
        printArray(newList);

        // Burada for döngüsü içerisinde değer atama işlemi yaptık.
        int cars[], count = 3;
        cars = new int[count];
        for (int i = 0; i < cars.length; i++)
            cars[i] = (i + 1) * 2;
        for (int j = 0; j < cars.length; j++)
            System.out.print(cars[j] + ",");
        // Çıktısı 2,4,6 olur

        // Multidimensional Series
        int[][] matris = new int[6][6]; // 6'ya 6'lık bir matris.
        // Değer atama aşağıdaki gibidir.
        matris[0][0] = 0; // 0'a 0'na 0 değerini atadık.
        matris[2][3] = 839; // 2 bizim satırımız yani aşağıya doğru 3 bizim sütunumuz. ! Saymaya 0'dan başlanır.
        System.out.println(matris[2][3]);
        // 839 çıktısı alınır.
        // Aşağıdaki gibi varsayılan değerler atanabilir.
        int[][] matris2 = {{0, 459, 939},
                {453, 0, 490},
                {939, 480, 839}};
        System.out.println(matris2[1][2]); // 490 çıktısı alınır.

        // Çıktı olarak 1 2 3 4
        // 5 6 7 8
        // 9 10 11 12 çıktısını istiyoruz bunun için aşağıdaki yöntem kullanılır.
        int[][] matrix = new int[3][4];
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
