package day10_NestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

          /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;
        *
        * *
        * * *
        * * * *
        * * * * *
     */

           /* int sayi = 4;
            for (int i = 1; i <= sayi; i++) { // outer ==> satirlar
                for (int j = 1; j <= i; j++) { // inner ==> sutunlar
                    System.out.print("* ");
                }
                System.out.println("");
            }*/
   /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;
        *
        * *
        * * *
        * * * *
        * * * * *
     */

       /* int sayi =5;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }*/

        int sayi =5;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
        for (int i = (sayi-1); i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }




        }
    }
