package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // isim isteyip ismi buyuk harfe cevirip kaydedin yeni hali yazdir

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isiminizi giriniz");

        String girilenisim = scanner.nextLine();

        girilenisim= girilenisim.toUpperCase();

        System.out.println("girilen ismin duzenlenmis hali : " + girilenisim);


    }
}
