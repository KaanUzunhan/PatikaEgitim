import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Değişkenleri atıyoruz
        int a,b,c,total;

        //Kullanıcıdan veri alıyoruz
        System.out.println("A sayısını giriniz: ");
        a=input.nextInt();

        System.out.println("B sayısını giriniz: ");
        b=input.nextInt();

        System.out.println("C sayısını giriniz: ");
        c=input.nextInt();


        //işlemi yaptırıyoruz
        total= a+b*c-b;

        //işlem sonucunu yazdırıyoruz
        System.out.println("İşlemin Sonucu: " + total);

    }
}
