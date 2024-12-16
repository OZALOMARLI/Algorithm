import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        // Matrisin satır ve sütun sayısını alıyoruz
        System.out.print("Matris satır sayısını girin: ");
        int satir = tarayici.nextInt();
        System.out.print("Matris sütun sayısını girin: ");
        int sutun = tarayici.nextInt();

        // Matrisin oluşturulması kısmı
        int[][] matris = new int[satir][sutun];
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = tarayici.nextInt();
            }
        }

        // Girilen matrisi ekrana yazdıracağız
        System.out.println("Matris:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matrisini hesaplayacağımız kısım
        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisi ekrana yazdırıyoruz
        System.out.println("--------------------");
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}