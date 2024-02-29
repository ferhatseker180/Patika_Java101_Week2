package HomeworkProjects;

public class BLetterWithStars {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        // 7'ye 4'lük bir matris tanımladık.

        // 7 sütunluk matirste 0, 4,7. sütunlardan başlayan yıldız olmasını istendiğinden i aralığı buna göre belirlendi.
        // Diğer sütunlarda else çalıştı ve boşluk bırakıldı

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        // Foreach yapısı kullanıldı.
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
