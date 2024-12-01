// Ozal OMARLI 2212101203

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Başlangıç bakiyesini alalım
        System.out.println(" Lütfen Başlangıç Bakiyenizi Belirtiniz: ");
        double bakiye = scanner.nextDouble();

        while (true) {

            // İşlem menüsünü yazdırıyoruz

            System.out.println("--- Banka İşlemleri Menüsü ---");
            System.out.println(" 1. Para Yatır ");
            System.out.println(" 2. Para Çek ");
            System.out.println(" 3. Bakiye Sorgula ");
            System.out.println(" 4. Çıkış ");

            System.out.println("Lütfen bir işlem seçiniz");

            int secim = scanner.nextInt();
            switch (secim) {
                case 1: // Para Yatırma İşlemi için
                    System.out.println(" Yatırmak istediğiniz tutarı giriniz: ");
                    double yatirilanTutar = scanner.nextDouble();
                    if (yatirilanTutar > 0) {
                        bakiye += yatirilanTutar;
                        System.out.println(yatirilanTutar + "TL Başarıyla yatırıldı.");
                    } else {
                        System.out.println("Geçersiz tutar! Lütfen doğru değer giriniz.");
                    }

                    break;
                case 2: // Para çekme İşlemi için
                    System.out.println(" Çekmek istediğiniz tutarı giriniz: ");

                    int cekilenTutar = scanner.nextInt();
                    if (cekilenTutar > 0 && cekilenTutar <= bakiye) {
                        bakiye -= cekilenTutar;
                        System.out.println(cekilenTutar + "TL başaıryla çekildi ");
                    } else {
                        System.out.println(" Yetersiz Bakiye! Mevcut bakiye : " + bakiye + "TL");
                    }
                    break;
                case 3: // Bakiye sorgulama işlemi için
                    System.out.println("Mevcut Bakiyeniz :" + bakiye);
                    break;

                case 4: // Çıkış işlemi İçin
                    System.out.println( "Çıkış Yapılıyor. İyi günler dileriz " );
                    return;

                    default: // Hatalı giriş olma durumu

                        System.out.println("Hatalı seçim! Lütfen geçerli bir işlem seçiniz" );
            }
        }
    }
}