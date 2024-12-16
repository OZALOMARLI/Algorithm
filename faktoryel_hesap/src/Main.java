// 2212101203 OZAL OMARLI
import java.util.Scanner; // Kullanıcıdan giriş almak için Scanner sınıfını içe aktarıyoruz.

public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: (N) "); // Kullanıcıdan bir sayı girmesini istiyoruz.
        int n = scanner.nextInt(); // Kullanıcının girdiği sayıyı 'n' değişkenine atıyoruz.

        // 1'den n'e kadar olan her sayının faktöriyelini hesaplayacak döngü tanımlıyoruz
        for (int i = 1; i <= n; i++) { 
            int faktoryel = 1; // Faktöriyel hesaplamak için başlangıç değerini 1 olarak ayarlıyoruz.

            // i sayısının faktöriyelini hesaplamak için iç döngü
            for (int k = 1; k <= i; k++) { // k değişkeni 1'den i'ye kadar döner.
                faktoryel = faktoryel * k; // Faktöriyel hesaplama: faktoryel = faktoryel * k
            }

            // i sayısının faktöriyelini ekrana yazdırıyoruz.
            System.out.println(i + "! = " + faktoryel); // Sonucu formatlı bir şekilde yazdırıyoruz.
        }
    }
}
