import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Verileri atadık
        double Boy,Kilo,kitle,boy;

        //Kullanıcıdan veri alıyoruz
        System.out.print("Lütfen Boyunuzu (metre cinsinde) giriniz: ");
        Boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz: ");
        Kilo=input.nextDouble();

        //endeksi hesaplıyoruz
        boy = Boy*Boy;
        kitle=Kilo/boy;

        //yazdırıyoruz
        System.out.println("Vücut Kitle endeksiniz: "  + kitle);
    }
}
