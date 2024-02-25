import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1,n2,max=0,min=0;

        System.out.print("Kaç tane tam sayı gireceksiniz: ");
        n1=inp.nextInt();

        System.out.print("1.sayıyı giriniz: ");
        n2=inp.nextInt();

        max=n2;
        min=n2;

        for (int i = 2; i <= n1; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
             n2=inp.nextInt();
             if (n2<=max){
                 max=n2;
             } else if (n2>=min) {
                 min=n2;
             }
        }
        System.out.println( " En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}