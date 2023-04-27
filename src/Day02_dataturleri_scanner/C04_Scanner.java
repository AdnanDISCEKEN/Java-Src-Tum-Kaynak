package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Lutfen bir tam sayi giriniz");

        int girilensayi = scanner.nextInt();

        System.out.println("Girdiginiz sayinin iki kati : " + 2*girilensayi);


    }
}
