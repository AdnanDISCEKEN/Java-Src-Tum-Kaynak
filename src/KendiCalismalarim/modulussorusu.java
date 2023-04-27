package KendiCalismalarim;

import java.util.Scanner;

public class modulussorusu {
    public static void main(String[] args) {

       // Soru 1- Kullanicidan 3 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir pozitif tam sayi giriniz");

        int sayi=scanner.nextInt();

        int birlerbasamagi=sayi%10;//3
        sayi=sayi/10;//12
        int onlarbasamagi=sayi%10;//2
        int yüzlerbasamagi=sayi/10;


        System.out.println("sayinin rakamlar toplami : "+(birlerbasamagi+onlarbasamagi+yüzlerbasamagi));

    }
}
