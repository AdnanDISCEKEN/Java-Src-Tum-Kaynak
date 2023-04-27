package day09_StringManipulation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {


        // kullanicidan iki sayi alin ve bu sayilar dahil olarak
        // aralarindaki 3 ile bolunebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tamsayi girin");
        int ilkSayi= scanner.nextInt();
        int ikinciSayi = scanner.nextInt();
        if (ilkSayi>ikinciSayi){
            System.out.println("Ilk sayi daha kucuk olmalidir");
        }else {
            for (int i = ilkSayi; i <= ikinciSayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                    System.out.println("");// sonraki cözumu alta gecirmesi icin koyduk
                }
            }
        }

        // kullanicidan iki sayi alin ve bu sayilar dahil olarak
        // aralarindaki 3 ile bolunebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin

    Scanner scanner1= new Scanner(System.in);
        System.out.println("Lutfen iki pozitif tam sayi giriniz");
        int sayi1 = scanner1.nextInt();
        int sayi2 = scanner1.nextInt();

        if (sayi1>sayi2) {
            System.out.println("Ilk sayi daha kucuk olmalidir");
        }else {
            for (int i = sayi1; i <=sayi2 ; i++) {
                if (i %3 == 0)
                    System.out.print(i + " ");
            }

        }
*/

        // kullanicidan iki sayi alin ve bu sayilar dahil olarak
        // aralarindaki 3 ile bolunebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen iki pozitif tam sayi giriniz");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        if (sayi1>sayi2){
            System.out.println("Birinci sayi ikinci sayidan kucuk olmalidir");
        }else {
            for (int i = sayi1; i <=sayi2 ; i++) {
                if (i%3==0)
                    System.out.println(i+" ");
                }


            }
        }



    }
