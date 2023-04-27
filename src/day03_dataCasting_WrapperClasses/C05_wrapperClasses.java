package day03_dataCasting_WrapperClasses;

public class C05_wrapperClasses {
    public static void main(String[] args) {

        int sayi = 10;

        Integer sayWrap = 10;
        /* Byt
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean

         */
        sayWrap =sayi;
        sayi = sayWrap;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String str1 ="34";
        String str2 ="45";

        System.out.println(str1+str2);
        System.out.println( Integer.parseInt(str1)+Integer.parseInt(str2));

        char chr ='m';

        //chr buyuk yaz

        System.out.println(Character.toUpperCase(chr));

        System.out.println(Character.isAlphabetic((chr)));
    }
}
