package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi girin");

        char isimilkharf = scanner.nextLine().toUpperCase().charAt(0);
        String soyisim = scanner.nextLine();
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + isimilkharf +" "+ soyisim +", "+yas);

    }
}
