package day09_StringManipulation_forLoop;

public class C12_ForLoopRakamlarToplami {
    public static void main(String[] args) {

        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
       /* int sayi= 1453;
        int basamaksayisi= (""+sayi).length();
        int rakam= 0;
        int rakamlarToplami=0;
        for (int i = 1; i <=basamaksayisi ; i++) {
            rakam = sayi%10;
            rakamlarToplami += rakam;
            sayi /= 10;
        }
        System.out.println("Verilen sayinin rakamlari toplami : " + rakamlarToplami);*/


      /*  int sayi =543;
        int basamaksayisi=(""+sayi).length();
        int rakam =0;
        int rakamlartoplami=0;
        for (int i = 1 ; i <= basamaksayisi; i++) {
            rakam=sayi%10;
            rakamlartoplami+=rakam;
            sayi/=10;

        }
        System.out.println("Verilen sayinin rakamlar toplami : "+ rakamlartoplami);
        */


       /* int sayi =987;
        int basamaksayisi =(""+sayi).length();
        int rakam =0;
        int rakamlartoplami =0;

        for (int i =1 ; i <=basamaksayisi ; i++) {
            rakam=sayi%10;
            rakamlartoplami+=rakam;
            sayi/=10;

        }
        System.out.println("Verilen sayinin rakamlar toplami : "+rakamlartoplami);
*/


        int sayi=258;
        int basamaksayisi=(""+sayi).length();
        int rakam=0;
        int rakamlartoplami=0;
        for (int i = 1; i <=basamaksayisi ; i++) {
            rakam=sayi%10;
            rakamlartoplami+=rakam;
            sayi/=10;

        }
        System.out.println("verilen sayinin rakamlar toplami : "+rakamlartoplami);

    }
}
