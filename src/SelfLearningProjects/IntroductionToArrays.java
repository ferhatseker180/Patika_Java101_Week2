package SelfLearningProjects;

import java.util.Arrays;

public class IntroductionToArrays {
    public static void main(String[] args) {

        // Arrays.toString() : Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
        int[] dizi1 = {3, 5, 7, 9};
        System.out.println(Arrays.toString(dizi1)); // Çıktısı : [3, 5, 7, 9]

        // Arrays.fill(): Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        int[] dizi2 = {1, 4, 7, 9};
        Arrays.fill(dizi2, 2);
        System.out.println(Arrays.toString(dizi2)); // Çıktısı: [2, 2, 2, 2]

        // Arrays.sort(): Dizideki elemanları sıralar.
        int[] dizi3 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(dizi3);
        System.out.println(Arrays.toString(dizi3)); // Çıktısı: [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]

        // Arrays.binarySearch(): Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
        int[] dizi4 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(dizi4);
        System.out.println(Arrays.toString(dizi4));
        int index = Arrays.binarySearch(dizi4,33);
        System.out.println("33'ün indeksi :" + index); // Çıktı: 33'ün indeksi :8

        // Arrays.copyOf() ve Arrays.copyOfRange() metotu
        int[] dizi5 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] copyArray = Arrays.copyOf(dizi5, 3);
        System.out.println(Arrays.toString(copyArray)); // Çıktı: [6, 1, 55]
        int[] copyOfRangeArray = Arrays.copyOfRange(dizi5,0,5);
        System.out.println(Arrays.toString(copyOfRangeArray)); // Çıktı: [6, 1, 55, 21, 33]

        //Arrays.equals() metotu: Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.
        int[] dizi6 = {1,2,3};
        int[] dizi7 = {1,2,3};

        System.out.println(Arrays.equals(dizi6,dizi7)); // Çıktı: true
    }
}
