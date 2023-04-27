package day08_StringManipulations;

public class c10_replaceAll {
    public static void main(String[] args) {

        // str icindeki tum sayilari method ile temizleyim
        String str = "J23a3345v4353a 234C354345a3456n345dir";

        /*
        replaceAll method u elementlerin ortak ozelliklerini kullanarak
        genel islem yapmak icin kullanilir
         */

        System.out.println(str.replaceAll("\\d", ""));

    }
}
