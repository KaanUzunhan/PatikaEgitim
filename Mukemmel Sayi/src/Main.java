import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, total = 0; //Değişkenleri atıyoruz

        System.out.println("Bir sayı giriniz: ");
        n1 = inp.nextInt();  //kullanıcıdan bir sayı değeri alıyoruz

        for (int i = 1; i < n1; i++) { //koşul ve döngüleri oluşturuyoruz
            if (n1 % i == 0) {
                total += i;
            }
        }

        if (total == n1) {//ekrana çıktıyı veriyoruz
            System.out.println(n1 + " Mükemmel sayıdır");
        } else {
            System.out.println(n1 + " Mükemmel sayı değildir");
        }


    }


}
