package day04_Increment_Concenation;

import java.util.Scanner;

public class C02_Preincrement_postincrement {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi isteyin
// Girilen tam sayiyi yazdirip
// sonra 1 artirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilensayi=scanner.nextInt();
        System.out.println("Girilen sayi : "+girilensayi++);

        //bir sayi daha alin önce artırıp sonra yazdirin

        System.out.println("Lutfen bir tam sayi daha girin");
        int girilensayi2=scanner.nextInt();
        System.out.println("Girilen sayi2 : " + ++girilensayi2);

        System.out.println("Kodun sonunda GS : "+girilensayi+", GS2 : "+girilensayi2);
    }
}
