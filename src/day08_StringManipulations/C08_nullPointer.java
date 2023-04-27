package day08_StringManipulations;

public class C08_nullPointer {
    public static void main(String[] args) {
        /*
        null bir deger degildir
        null bir pointer'dir
        non-primitive datalara henuz deger atanmadigini ifade eder
        deger atanmazsa yazdirilamaz fakat esittir null  deger atamadan bos yazdirilir
         ama biz aslinda icinin bos oldugunu biliriz
         */

       /* String str;                   bu sekilde hata verir
        System.out.println(str);
        */

        String str=null;
        System.out.println(str); // hata vermez ici bos olan yere null yazdirir

       // str.concat("Ali"); // hata vermez ama yazdirmaz str null oldugu icin metodlar ile kullanilimaz

       //System.out.println(str.length()); atama olmadigi icin uzunluk olculemez

        String test ="";
        System.out.println(test.length()); //burada test icin atama yapilmis onun icin olcum yapar

        Integer sayi =null;

        // str = null ----- test="";

       // System.out.println(str.isEmpty()); calismaz olmayan sey bos mu diye bakmaz
        System.out.println(test.isEmpty()); // test="" oldugu icin calisir
        /*
        null atamasi yapilan bir veriable hicbir method ile kullanilimaz
        yazdirilabilir veya + ile kullanilabilir
         */

    }
}
