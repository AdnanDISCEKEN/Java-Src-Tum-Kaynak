package day09_StringManipulation_forLoop;

public class C09_ForLoop {
    public static void main(String[] args) {


        // verilen bir metin'deki
        // buyuk harf , kucuk harf ve space sayilarini bulun
        // space sayisini gozonune alarak kac kelime oldugunu,
        // kac tane kucuk ve buyuk harf oldugunu yazdirin.
      /*  String str = "Java OgReneN isi kapaR";
        int buyukHarfSayisi=0;
        int kucukHarfSayisi=0;
        int spaceSayisi=0;
        for (int index = 0; index < str.length() ; index++) {
            char karakter= str.charAt(index);
            if (karakter>='a' && karakter<='z'){
                kucukHarfSayisi++;
            } else if (karakter>='A' && karakter<='Z') {
                buyukHarfSayisi++;
            } else if (karakter == ' ') {
                spaceSayisi++;
            }
        }
        System.out.println("Metindeki kelime sayisi : " + (spaceSayisi+1) +
                "\nkucuk harf sayisi : " + kucukHarfSayisi+
                "\nBUYUK harf sayisi : " + buyukHarfSayisi);*/




        // verilen bir metin'deki
        // buyuk harf , kucuk harf ve space sayilarini bulun
        // space sayisini gozonune alarak kac kelime oldugunu,
        // kac tane kucuk ve buyuk harf oldugunu yazdirin.
        String str = "Java OgReneN isi kapaR";

        int buyukHarf =0;
        int kucukharf =0;
        int space =0;

        for (int i = 0; i <str.length() ; i++) {
            char karakter =str.charAt(i);
            if (karakter>='a' && karakter<='z'){
                kucukharf++;
            } else if (karakter>='A' && karakter<='Z') {
                buyukHarf++;
                
            } else if (karakter==' ') {
                space++;
                
            }
        }

        System.out.println("Metindeki kelime sayisi : "+(space+1)+
                "\n Kucuk harf sayisi : "+kucukharf+
                "\n Buyuk harf sayisi : "+buyukHarf);



    }
    }

