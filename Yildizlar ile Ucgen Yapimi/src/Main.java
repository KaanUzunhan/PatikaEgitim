import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int n = inp.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}