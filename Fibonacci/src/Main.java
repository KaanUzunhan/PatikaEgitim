import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int elemanSayisi = inp.nextInt();

        int a = 0, b = 1, c;

        for (int i = 1; i <= elemanSayisi; ++i) {
            if (i == 1) {
                System.out.print(a + " ");
            } else if (i == 2) {
                System.out.print(b + " ");

            } else {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }

        }
    }
}