package day06_nestedIfElseStatements_TernaryOperator;

public class C06_tenery {
    public static void main(String[] args) {
        //verilen sayi pozitif ise degerini iki katina cikarin
        //pozitif degilse degerini 10 artirin
        int sayi = 10;

        sayi= sayi >0 ? 2*sayi : sayi+10;


        //ternery bize sonuc verir, bu sonucu  ya yazdirmaliyiz yada veriablea atamaliyiz



        // sayi cift ise 2 katini yazdirin, tek ise sayi tek yazdirin


        sayi++;//yukaridaki sayiyi teke cevirdim
        System.out.println(sayi % 2 == 0 ? 2*sayi : "tek sayi" );


        /*Eger sartin saglanmasi veya saglanmamasi durumunda calisacak kodlar
        farkli data turlrinde ise
        o zaman atama yapamayiz, cunku sonuc tek bir data turunde degil
        turneryi sadece yazdirabiliriz

         */


    }
}
