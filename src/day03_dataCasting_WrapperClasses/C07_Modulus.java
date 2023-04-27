package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {

        System.out.println(20%8);//kalanı yazdirir o da 4
        System.out.println(589547962%3);// 3 e bolunebilseydi sonuc 0 olurdu
        // bir sayi diger sayinin katı midir derse modulus alinir sonuc 0 ise tam katidir

        // pozitif tam sayi alip birler basamaginin karesini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilensayi =scanner.nextInt();
        System.out.println(girilensayi%10*girilensayi%10);

        //girilen sayidan birler basamagini silip kalan sayiyi yazdirin213 girince 21 yazdirsin

        System.out.println(girilensayi/10);//213/10
    }
}
