import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = inp.nextInt();

        int k = 0, b = 0, i = 0;


        while (i <= sayi) {
            sayi++;
            if ((i % 3 == 0) && (i % 4 == 0)) {
                k += i;
                b++;
            }
            i++;
        }
        double ortalama;

        if (b > 0) {
            ortalama = (double) k / b;
            System.out.println("3 ve 4 tam bölünen sayıların ortalaması " + ortalama);
        } else {
            System.out.println("3 ve 4 e tam bölünen sayı bulunamadı");
        }
    }
}