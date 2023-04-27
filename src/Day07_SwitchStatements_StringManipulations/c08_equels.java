package Day07_SwitchStatements_StringManipulations;

public class c08_equels {
    public static void main(String[] args) {

        String str1 ="Java";

        String str2 ="Java";

        String str3= "java";

        String str4="JAVA";

        String str5 ="JaVa";

        String str6 = new String( "Java");

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false
        System.out.println(str4.equals(str5));//false
        System.out.println(str2.equals(str6));//true

        /*
        equals verilen iki String metinin  ayni olup olmadigina bakar
        case sensitive dir yani buyuk kucuk harf onemlidir
         */

        // simdilik == kullanmayalim
        System.out.println(str1==str2);// true

        System.out.println(str1==str3);// false

        System.out.println(str1==str6);// true



        /*
        equels metodu sadece degerlere bakar metin ayni ise sonuc true farkli ise sonuc false olur

        == ise hem metin hem referans degerine bakar
        ileride anlatacagimiz uzere java bazen ayni referanslari farkli objelere de verir
        bu konuyu ilerde detaylandiracagiz

        SİMDİLİK
        iki Stringin metin olarak ayni oldugunu kontrol etmek icin equels metodu kullanmalisiniz

         */


    }
}
