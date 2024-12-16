// 2212101203 OZAL OMARLI

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, kalan, yeniSayi = 0;

        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı girin: ");
        int ilkSayi = scanner.nextInt();

        // Sayının tersini bulmak için
        System.out.println("Sayının tersini bul:");
        int tersSayi = 0; // Ters sayı başlangıçta 0
        int geciciSayi = ilkSayi; //Sayıyı kopyalamak için başka bir geçici sayı tanımlıyoruz

        // Döngü ile sayıyı basamaklarına ayırıyoruz  ve tersini oluşturuyoruz
        while (geciciSayi > 0) {
            int sonBasamak = geciciSayi % 10; // Son basamağı alıyoruz
            System.out.println("Basamak: " + sonBasamak);
            tersSayi = tersSayi * 10 + sonBasamak; // Ters sayıyı oluşturuyoruz
            geciciSayi = geciciSayi / 10; // Son basamağı düş
        }

        System.out.println("Ters sayı: " + tersSayi);

        // Ters sayı ile orijinal sayıyı karşılaştır
        if (ilkSayi == tersSayi) {
            System.out.println(ilkSayi + " bir palindromdur.");
        } else {
            System.out.println(ilkSayi + " bir palindrom değildir.");
        }

    }
}