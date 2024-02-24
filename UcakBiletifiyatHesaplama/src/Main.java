import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");

        Scanner input = new Scanner(System.in);
      // Değişkenleri atıyoruz
        int yas, ytipi;

        boolean tekyon;

        double a, km = 0.10, mesafe, ttutar;
      //Kullanıcıdan verileri alıyoruz
        System.out.print("Mesafeyi giriniz: ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=>Tek yön , 2=>Çift yön=) : ");
        ytipi = input.nextInt();

        tekyon = ytipi == 1;
        double tutar;
      //koşulları sağlıyoruz
        if (mesafe >= 0 && yas >= 0) {
            if (yas < 12) {
                tutar = ((mesafe * km) - (mesafe * km) * 0.5);
                ttutar = tekyon ? tutar : ((tutar - (tutar * 0.2)) * 2);
                System.out.println("Toplam tutar: " + ttutar);

            } else if (yas > 12 && yas <= 24) {
                tutar = ((mesafe * km) - (mesafe * km) * 0.1);
                ttutar = tekyon ? tutar : ((tutar - (tutar * 0.2)) * 2);
                System.out.println("Toplam tutar: " + ttutar);

            } else if (yas >= 65) {
                tutar = ((mesafe * km) - (mesafe * km) * 0.3);
                ttutar = tekyon ? tutar : ((tutar - (tutar * 0.2)) * 2);
                System.out.println("Toplam tutar: " + ttutar);


            } else {
                tutar = (mesafe * km);
                ttutar = tekyon ? tutar : tutar * 2;
                System.out.println("Toplam tutar: " + ttutar);
            }

        } else {
            System.out.println("Geçersiz değer girdiniz!!");
        }


    }

}



