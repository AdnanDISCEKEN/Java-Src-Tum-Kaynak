package day08_StringManipulations;

public class C06_lastIndexof {
    public static void main(String[] args) {

        String str ="Java cok faydali";
        System.out.println(str.lastIndexOf("a"));// 13 aramayi sondan baslatir ama indexi bastan yazdirir (adres ayni)

        System.out.println(str.lastIndexOf("a", 10));//10 ondan baslar ilk a 10 da zaten

        System.out.println(str.lastIndexOf("a", 12));//10 oniki den baslar ilk a yine 10 da







        System.out.println(str.indexOf('k')); // 7   --char olarakta aranabilir ama tek karakter aranabilir
        System.out.println(str.lastIndexOf('k')); //7



        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        String str1 ="Java cok kolay";
        String str2="cok";

        int bastanIndex =str1.indexOf(str2);
        int sondanIndex = str1.lastIndexOf(str2);
        if (bastanIndex==-1){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (bastanIndex==sondanIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");

        }else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }


    }
}
