import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınıyor
        System.out.print("Bir sayı girin: ");
        int orjinalSayi = tarayici.nextInt();

        // Tek ve çift basamakları tutacak değişkenleri tanımlıyoruz
        StringBuilder tekBasamaklar = new StringBuilder();
        StringBuilder ciftBasamaklar = new StringBuilder();

        // Sayının basamaklarını kontrol etmek için gerekli değişkenler
        int geciciSayi = orjinalSayi; // Orijinal sayının bir kopyası

        // Sayının basamaklarını ayırma ve tek/çift kontrolü yapıyoruz
        while (geciciSayi > 0) {
            int sonBasamak = geciciSayi % 10; // Sayının en sağdaki basamağı alınır
            if (sonBasamak % 2 == 0) {
                ciftBasamaklar.append(sonBasamak).append(" "); // Çift basamakları ekle
            } else {
                tekBasamaklar.append(sonBasamak).append(" "); // Tek basamakları ekle
            }
            geciciSayi = geciciSayi / 10; // Sayının son basamağı çıkarılıyor
        }

        // Tek ve çift basamakları ekrana yazdır
        System.out.println("Tek basamaklar: " + tekBasamaklar.reverse().toString().trim());
        System.out.println("Çift basamaklar: " + ciftBasamaklar.reverse().toString().trim());

    }
}
