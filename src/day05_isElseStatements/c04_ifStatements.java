package day05_isElseStatements;

import java.util.Scanner;

public class c04_ifStatements {
    public static void main(String[] args) {
        /*verilen bir sayinin 2,3,5,7,11,23 sayilarindan kacina kalansız bolundugunu yazdirin

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int sayac =0;

        if (sayi%2==0) sayac++;
        if (sayi%3==0) sayac++;
        if (sayi%5==0) sayac++;
        if (sayi%7==0) sayac++;
        if (sayi%11==0) sayac++;
        if (sayi%23==0) sayac++;
        System.out.println("Girilen sayi, verilen sayilardan "+sayac+" tanesine tam bolunur");












       /*Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif tam sayi giriniz");
        int girilensayi = scanner.nextInt();
        int sayac =0;
        if(girilensayi%2==0) sayac++;
        if(girilensayi%3==0) sayac++;
        if(girilensayi%5==0) sayac++;
        if(girilensayi%7==0) sayac++;
        if(girilensayi%11==0) sayac++;
        if(girilensayi%23==0) sayac++;
        System.out.println("Girilen sayi, istenen sayilardan "+sayac+" tanesine tam bolunebiliyor");*/
    }
}
