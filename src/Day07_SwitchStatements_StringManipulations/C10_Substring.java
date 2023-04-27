package Day07_SwitchStatements_StringManipulations;

public class C10_Substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        // sadece Candir kismini yazdiralim

        System.out.println(str.substring(5)); //Candir
        System.out.println(str.substring(2));//va Candir
        System.out.println(str.substring(10));//r
        System.out.println(str.substring(11));// bos satir
        //System.out.println(str.substring(12)); indeksin disina ciktigi icin hata verir

        // Sadece Java kismini yazdirin
        System.out.println(str.substring(0,4));
        // javada baslangic ve bitis indeksi verildiginde
        // genellikle baslangic indeksi dahil (inclusive)
        // bitis indeksi haric (exlusive) olur


        System.out.println(str.substring(3,4));//a
        System.out.println(str.substring(1,2));//a

        // eger bir harf almak isterseniz substring(harfinindeksi, harfinindeksi+1)

        System.out.println(str.substring(5,5));// hiclik

        //System.out.println(str.substring(8,5));// 8 den basla 5 e kadar git dedik
        // ama geriye gidemeyecegi icin hata verir


        String str2 = "eSRa";
        // ilk harfi buyuk gerisi kucuk olacak sekilde duzenle
        str2 =str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(str2);
    }
}
