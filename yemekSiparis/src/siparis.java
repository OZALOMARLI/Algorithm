//  Ozal OMARLI 2212101203

import java.util.Scanner;

public class siparis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] urun = {"", "Pizza", "Burger", "İçecek"};
        int[] fiyat = {0, 50, 30, 10};

        int toplamUcret = 0;
        int secim = 1;

        while (secim != 0) {

            System.out.println("Menü:");
            System.out.println("1. Pizza (50 TL)");
            System.out.println("2. Burger (30 TL)");
            System.out.println("3. İçecek (10 TL)");
            System.out.println("0. Siparişi tamamla");

            // Ürün seçimi yapma
            System.out.print("Lütfen bir ürün seçiniz (1, 2, 3 veya 0): ");
            secim = scanner.nextInt();

            int adet = 0;
            // Adet bilgisi alma
            if (secim != 0) {
                System.out.print("Kaç adet almak istersiniz? ");
                adet = scanner.nextInt();
            }

            // Toplam tutarı hesaplıyoruz
            toplamUcret += fiyat[secim] * adet;
        }

        System.out.println("Toplam tutar: " + toplamUcret + " TL");

        // Ödemenin doğrulanma kısmı


        while (true) {
            System.out.print("Lütfen ödemenizi yapınız: ");
            int odeme = scanner.nextInt();

            if (odeme == toplamUcret) {
                System.out.println("Siparişiniz onaylandı!");
                break;
            } else {
                System.out.println("Hatalı ödeme! Lütfen doğru tutarı giriniz.");
            }
        }

        scanner.close();
    }
}
