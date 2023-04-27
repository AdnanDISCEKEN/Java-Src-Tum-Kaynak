package day08_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        /* contains metodu bir yazi parcaciginin baska yazida olup olmadigini kontrol eder
        iceriyorsa trye icermiyorsa false olarak dondurur
         */


        String str ="Java ile hersey cok kolay";
        System.out.println(str.contains("java"));//kucuk harf oldugu icin false
        System.out.println(str.contains("Java"));//true

        String aranankelime = "cok";

        System.out.println(str.contains(aranankelime));//true

        String olmayankelime ="Deniz";
        System.out.println(str.contains(aranankelime));//false ?????

        System.out.println(str.contains("a"));//true


    }
}
