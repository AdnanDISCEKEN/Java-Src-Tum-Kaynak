package Day02_dataturleri_scanner;

import java.util.Scanner;

public class c07_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi,soyisminizi,yasinizi giriniz");

        String isim = scanner.nextLine();
        String soyisim = scanner.nextLine();
        int yas = scanner.nextInt();

        System.out.println("isminiz : "+ isim);
        System.out.println("soyisminiz : "+ soyisim);
        System.out.println("yasiniz : "+ yas);
        System.out.println("Kaydiniz basariyla gerceklesmistir");
    }
}
