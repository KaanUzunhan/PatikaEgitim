import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz ");
        Scanner input = new Scanner(System.in);
        //Değişkenleri belirliyoruz
        int yil;
        //Kullanıcıdan veri alıyoruz.
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();
        //Koşulları oluşturuyoruz.
        if ((yil % 4 == 0) || (yil % 400 == 0)) {

            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " Bir artık yıl değildir !!");
        }
    }
}
