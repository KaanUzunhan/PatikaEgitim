package Week1;
//kullanıcıdan veri alıcaz.

import java.util.Scanner;

public class NotOrtalamasıHesapla {
    public static void main(String[] args) {
        // Değişkenleri oluşturuyoruz
        double mat, fizik, kimya, turkce, tarih, muzik, beden;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextDouble();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextDouble();

        System.out.print("kimya notunuz: ");
        kimya = input.nextDouble();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextDouble();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextDouble();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextDouble();

        System.out.print("Beden eğitimi notunuz: ");
        beden = input.nextDouble();

        //Not toplamını buluyoruz
        double Toplam = (mat + fizik + kimya + turkce + tarih + muzik + beden);

        //Not ortalamasını alıyoruz
        double ortalama = Toplam / 7;


        System.out.println("Not ortalamanız: " + ortalama);
        System.out.println(ortalama >= 60 ? "sınıfı geçtiniz" : "sınıfta kaldınız");

    }
}