package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz");

        double ondaliklisayi = scanner.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int tamsayi= scanner.nextInt();


        System.out.println("Girilen sayilarin toplami : " + (ondaliklisayi+tamsayi));

        System.out.println("girilen sayilarin carpimi : "+ (ondaliklisayi*tamsayi));
    }
}
