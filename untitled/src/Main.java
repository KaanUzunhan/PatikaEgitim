import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int n = inp.nextInt();

        int a = 0;

        for (int i = 1; i <= 10; i++) {
            a = n * i;

            System.out.println(n + "x" + i + "=" + a);
        }


    }
}
