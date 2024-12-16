import java.util.Scanner;

public class DiziFrekans {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu al
        System.out.print("Dizi boyutunu girin: ");
        int boyut = tarayici.nextInt();

        int[] dizi = new int[boyut]; // Kullanıcıdan alınacak elemanları saklayacak diziyi tanımlıyoruz

        // Kullanıcıdan dizi elemanlarını alalım
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Dizi[" + i + "]: ");
            dizi[i] = tarayici.nextInt();
        }

        // Frekans hesaplama için kullanılmış dizi
        boolean[] kontrol = new boolean[boyut]; // Elemanların kontrol edildiğini takip edecek olan kısım

        System.out.println("\nDizideki Eleman Frekansları:");

        // Her bir elemanın frekansını bul
        for (int i = 0; i < boyut; i++) {
            if (kontrol[i]) { // Daha önce hesaplandıysa geçecektir
                continue;
            }

            int sayi = dizi[i];
            int frekans = 1;

            for (int j = i + 1; j < boyut; j++) {
                if (dizi[j] == sayi) {
                    frekans++;
                    kontrol[j] = true; // Tekrar sayma
                }
            }
            System.out.println(sayi + ": " + frekans);
        }
    }
}
