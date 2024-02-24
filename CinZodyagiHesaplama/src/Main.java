import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        //değişkenleri belirliyoruz.
        int dyili;
        //kullanıcıdan değer alıyoruz.
        System.out.println("Doğum yılınızı giriniz: ");
        dyili = input.nextInt();
        //koşulu oluşturuyoruz
        if (dyili % 12 == 0) {
            System.out.println("Çin zodyağı burcunuz: Maymun");

        } else if (dyili % 12 == 1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");

        } else if (dyili % 12 == 2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        } else if (dyili % 12 == 3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        } else if (dyili % 12 == 4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        } else if (dyili % 12 == 5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        } else if (dyili % 12 == 6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        } else if (dyili % 12 == 7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        } else if (dyili % 12 == 8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        } else if (dyili % 12 == 9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        } else if (dyili % 12 == 10) {
            System.out.println("Çin zodyağı burcunuz: At");
        } else if (dyili % 12 == 11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        } else {
            System.out.println("Hata!! (Pozitif sayı giriniz)");
        }


    }
}






