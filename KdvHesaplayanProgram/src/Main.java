import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tutarı al
        System.out.print("Lütfen tutarı girin: ");
        try {
            double tutar = scanner.nextDouble();

            // KDV hesapla
            double kdvOrani = (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.08;
            double kdvTutari = tutar * kdvOrani;
            double toplamTutar = tutar + kdvTutari;

            // Sonuçları ekrana yazdır
            System.out.println("Tutar: " + tutar + " TL");
            System.out.println("KDV Oranı: %" + kdvOrani);
            System.out.println("KDV Tutarı: " + kdvTutari + " TL");
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        } catch (Exception e) {
            System.out.println("Geçersiz bir değer girdiniz. Lütfen bir sayı girin.");
        } finally {
            scanner.close();
        }
    }
}