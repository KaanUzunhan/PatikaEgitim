import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tam sayı giriniz: ");
        int a = inp.nextInt();

        System.out.print("Ondalıklı sayı giriniz: ");
        double b = inp.nextDouble();

        double c = a;
        int d= (int) b;

        System.out.println(c);
        System.out.println(d);


    }
}
