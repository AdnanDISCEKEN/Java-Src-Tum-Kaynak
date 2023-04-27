package day06_nestedIfElseStatements_TernaryOperator;

import java.util.Scanner;

public class C01_SayiKontrolu {
    public static void main(String[] args) {
        /* kullanıcidan bir sifre girmesini isteyin
        sayi asagidaki 4 sarti sagliyorsa "Mukemmel sayi" yazdirin
        saglanmayan sartlarin tamamini kullaniciya soyleyin
        1-sayi4 basamakli olmalidir
        2-sayi 3 ile bolunebilmelidir
        3-sayi 5 ile bolunememelidir
        4-sayinin birler basamagi tek sayi olmalidir
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi =scanner.nextInt();
        boolean sifrebasarilimi=true;

        if (sayi<1000 || sayi>9999){
            System.out.println("Sayi 4 basamakli olmalidir");
            sifrebasarilimi=false;
        }
        if (sayi%3 !=0){
            System.out.println("sayi 3 ile bolunebilmelidir");
            sifrebasarilimi=false;
        }

        if (sayi%5==0){
            System.out.println("sayi 5 ile bolunememelidir");
            sifrebasarilimi=false;
        }
        if((sayi%10)%2==0){
            System.out.println("sayinin birler basamagi tek sayi olmalidir");
            sifrebasarilimi=false;}

        if (sifrebasarilimi){
            System.out.println("Mukemmel sayi");}





        /*
          /* kullanıcidan bir sayi girmesini isteyin
        sayi asagidaki 4 sarti sagliyorsa "Mukemmel sayi" yazdirin
        saglanmayan sartlarin tamamini kullaniciya soyleyin
        1-sayi4 basamakli olmalidir
        2-sayi 3 ile bolunebilmelidir
        3-sayi 5 ile bolunememelidir
        4-sayinin birler basamagi tek sayi olmalidir
         */

       Scanner scanner1= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi1= scanner1.nextInt();
        boolean sayiBasariliMi = true;


        if (sayi1<1000 && sayi1>9999){
            System.out.println("sayi 4 basamakli olmalidir");
            sayiBasariliMi = false;
        }
        if (sayi1%3!=0){
            System.out.println("Sayi 3 ile bolunabilmelidir");
            sifrebasarilimi=false;
        }
        if (sayi1%5==0){
            System.out.println("Sayi 5 ile bolunamemelidir");
            sifrebasarilimi=false;
        }
        if ((sayi1%10)%2==0){
            System.out.println("Sayinin birler basamagi tek sayi olmalidir");
            sifrebasarilimi=false;
        }
        if (sayiBasariliMi){
            System.out.println("Mukemmel sayi");}










    }
}
