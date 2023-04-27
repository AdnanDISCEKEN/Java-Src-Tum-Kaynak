package day08_StringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {


        String str ="Java en iyisi";

        System.out.println(str.indexOf("e")); //5
        System.out.println(str.indexOf("a"));// 1  --soldan baslayacagi icin ilk buldugunu getirir

        System.out.println(str.indexOf("en"));// 5  -- bes ile basladigi icin parcanin baslangic indexini verir.
                                                    // parcayi butun alir ve arar basladigi yerin indexini yazar


        System.out.println(str.indexOf("yi"));// 9
        System.out.println(str.indexOf("iyisi"));// 8

        System.out.println(str.indexOf("o"));// olmayani -1 yazdirir

        System.out.println(str.indexOf("en güzeli")); // -1

        System.out.println(str.indexOf("a",1)); // 1 verir. Cunku 1 dan baslar ilk buldugu indexi yazdirir
        System.out.println(str.indexOf("a", 2));// 3 verir.

        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("i", 5));//8
        System.out.println(str.indexOf("i", 6));//8
        System.out.println(str.indexOf("i", 9));//10
        System.out.println(str.indexOf("i", 11));//12








        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis
        // Java en iyisi icerisinde "en" kelimesi icin

        if (str.indexOf("en")==-1){
            System.out.println("Cumle aradiginiz kelimeyi icermiyor");
        }
        else {
            int birincikelime = str.indexOf("en");

            if (str.indexOf("en", birincikelime + 1) == -1) {
            System.out.println("bu cumlede aradiginiz kelime bir tane var");

            }else{
                System.out.println("bu cumlede aradiginiz kelime birden cok var");
            }


    }
}}
