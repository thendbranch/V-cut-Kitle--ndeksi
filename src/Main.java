import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Vücut Kitle İndeksi Hesaplama :
            Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
            Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül :
            Kilo (kg) / Boy(m) * Boy(m)

        Çıktısı :
            Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
            Lütfen kilonuzu giriniz : 105
            Vücut Kitle İndeksiniz : 35.49215792320173
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Vücut Kitle İndeksi Hesaplama");
        System.out.print("Lütfen Boyunuzu (Metre Cinsinde) Giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        int kilo = input.nextInt();

        double kitle = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kitle);

    }
}