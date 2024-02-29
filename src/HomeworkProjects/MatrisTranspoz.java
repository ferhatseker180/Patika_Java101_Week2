package HomeworkProjects;

public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] matris = {{1, 2, 3}, {4, 5, 6}};

        // We printed the original matrix
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============");
        System.out.println("Transpose Of The Matrix:");

        // The function that transposes the matrix was written
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }


    }
}
