import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;

        System.out.print("Kullanıcı Adı Giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = inp.nextLine();

        if (userName.equals("Kaanuzunhan") && password.equals("Patika123")) {
            System.out.print("Başarı bir şekilde giriş yaptınız");
        } else {
            System.out.println("Girmiş olduğunuz bilgiler hatalı!!");
            System.out.println("Yeni şifre oluşturmak istermisiniz?");
        }
        String yeniSifre;

        System.out.print("Yeni Şifrenizi Giriniz: ");
        yeniSifre = inp.nextLine();

        if (yeniSifre.equals("Patika123")) {
            System.out.println("Yeni şifre son 3 şifrenizle aynı olamaz!!");

        } else {
            System.out.println("Şifreniz Başarılı Şekilde Oluşturuldu!");
        }
    }
}