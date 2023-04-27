package day10_NestedForLoop_MethodOlusturma;

public class C09_FaktoriyelDegeriYazdirma {



    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryel degerini yazdiran
        // bir method olusturun

//faktoriyelDegeriYazdir(5);


faktoriyelDegeriYazdir(7);
    }


/*    public  static void faktoriyelDegeriYazdir(int sayi){
        int faktoriyel = 1;
        for (int i = sayi; i >=1 ; i--) {
        faktoriyel*=i;
        }
        System.out.println(sayi+"! = "+faktoriyel);
    }*/

    public static void faktoriyelDegeriYazdir(int sayi){
        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
          faktoryel*=i;
        }
        System.out.println(sayi+"! = "+faktoryel);
    }

}
