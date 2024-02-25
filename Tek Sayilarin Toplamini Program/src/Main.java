import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        int total = 0;

        do {
            System.out.println("Sayı giriniz: ");
            number = inp.nextInt();
            if (number % 4 == 0) {
                total += number;
            }

        } while (number % 2 == 0 && number > 0);
        System.out.println("Toplam: " + total);
    }
}