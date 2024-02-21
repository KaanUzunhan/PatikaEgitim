import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma  \n3-Bölme \n4-Çarpma");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Çıkan Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkan Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çıkan Sonuç: " + (n1 / n2));
                break;
            case 4:
                System.out.println("Çıkan Sonuç:" + (n1 * n2));
                break;
            default:
                System.out.println("Yanlış bir tuşlama yaptınız!!");
        }
    }
}
