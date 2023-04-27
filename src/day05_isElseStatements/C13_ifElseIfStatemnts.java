package day05_isElseStatements;

import java.util.Scanner;

public class C13_ifElseIfStatemnts {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak girin");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy = scanner.nextDouble();

        double vki = kilo * 10000 / (boy * boy);

        if (vki >= 30) {
            System.out.println("vki degeriniz : " + vki + " Obezsiniz");
        } else if (vki >= 25) {
            System.out.println("vki degeriniz : " + vki + " kilolusunuz");

        } else if (vki >= 20) {
            System.out.println("vki degeriniz : " + vki + " normalsiniz");

        } else {
            System.out.println("vki degeriniz : " + vki + " zayifsiniz"); }



















       /* Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen kg olarak agirliginizi giriniz");
    double agirlik =scanner.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy =scanner.nextDouble();

        double vki =agirlik*10000/(boy*boy);

        if (vki >30){
            System.out.println("vki degeriniz : "+vki+" Maalesef obezsiniz");
        } else if (vki>25) {System.out.println("vki degeriniz : "+vki+" Maalesef kilolusunuz");

        } else if (vki>20) {System.out.println("vki degeriniz : "+vki+" Supersiniz");

        }else System.out.println("Maalesef cok zayifsiniz");*/



    }}
