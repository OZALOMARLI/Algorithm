// 2212101203 OZAL OMARLI
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: (N) ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int faktoryel = 1;
            for ( int k = 1; k <= i; k++) {
                faktoryel = faktoryel * k ;
            }
            System.out.println(i+ "! = " +faktoryel );
        }
    }
}