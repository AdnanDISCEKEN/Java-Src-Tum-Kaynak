package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //3 basamakli poztif tam sayi alip sayinin rakamlar top yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tam sayi giriniz");

        int sayi =scanner.nextInt();
        int birlerbasamagi=0;
        int rakamlartoplami=0;

        birlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        sayi=sayi/10;

        birlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        sayi=sayi/10;

        birlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        System.out.println("Girilen sayinin rakamlar toplami = "+rakamlartoplami);

    }
}
