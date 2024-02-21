import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DEĞİŞKENLERİ ATIYORUZ
        double Armutkg, Elmakg, Domateskg, Muzkg, Patlıcankg;
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5;

        //KULLANICIDAN VERİLERİ ALIYORUZ
        System.out.print("Armut kaç kilo: ");
        Armutkg = input.nextDouble();

        System.out.print("Elma kaç kilo: ");
        Elmakg = input.nextDouble();

        System.out.print("Domates kaç kilo: ");
        Domateskg = input.nextDouble();

        System.out.print("Muz kaç kilo: ");
        Muzkg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo: ");
        Patlıcankg = input.nextDouble();

        //GİRİLEN KG İLE BİRİM FİYATLARI ÇARPIYORUZ
        double Toplam = ((Armutkg * Armut) + (Elmakg * Elma) + (Domateskg * Domates) + (Muzkg * Muz) + (Patlıcankg * Patlıcan));

        //KULLANICIYA TOPLAM FİYATI YAZDIRIYORUZ
        System.out.println("Ödemeniz Gereken Ücret: " + Toplam);

    }
}