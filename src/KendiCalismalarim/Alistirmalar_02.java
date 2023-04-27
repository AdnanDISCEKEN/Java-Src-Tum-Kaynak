package KendiCalismalarim;

import java.util.Scanner;

public class Alistirmalar_02 {
    //kullanıcıdan iki tam sayi aliniz ve iki tam sayinin 4 islem sonucunu yazdiriniz


    public static void main(String[] args) {
       /*Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 1. tam sayiyi giriniz");
        int birinciSayi=scan.nextInt();
        System.out.println("Lutfen 2. tam sayiyi giriniz");
        int ikinciSayi=scan.nextInt();

        System.out.println("Iki sayinin toplami : "+(birinciSayi+ikinciSayi)+"\n Ikisayinin farki : "+(birinciSayi-ikinciSayi)
        +"\n Iki sayinin çarpimi : "+birinciSayi*ikinciSayi+"\n Birinci sayinin ikinci sayiya bölümü : "+birinciSayi/ikinciSayi);
*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tane pozitif tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Sayilar toplami : "+(sayi1+sayi2)+"\n" +
                "Sayilarin farki : "+(sayi1-sayi2)+"\n" +
                "Sayilarin carpimi : "+(sayi1*sayi2)+"\n" +
                "Sayilarin bolumu : "+(sayi1/sayi2));*/












        /*  Problem Tanımı
    Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

    Örnek Ekran Çıktısı
    birinci kenar: 12
    ikinci kenar: 5
    hipotenus: 13      */

 /*  Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci dik kenari giriniz");
        double birinciKenar=scan.nextDouble();
        System.out.println("Lutfen ikinci dik kenari giriniz");
        double ikincikenar=scan.nextDouble();
        double hkare=((birinciKenar*birinciKenar)+(ikincikenar*ikincikenar));
        System.out.println("hipotenus : "+Math.sqrt(hkare));//Math.sqrt() parentez icinin kokunu alir
*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci dik kenar olcusunu giriniz");
        double kenar1=scanner.nextDouble();

        System.out.println("Lutfen ikinci dik kenar olusunu giriniz");
        double kenar2 = scanner.nextDouble();

        double hipkare =(kenar1*kenar1)+(kenar2*kenar2);
        System.out.println("Hipotenus : "+Math.sqrt(hipkare));*/

        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    100 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
     Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.

          */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz");
        double mesafe = scanner.nextDouble();
        System.out.println("Lutfen hizinizi giriniz");
        double hiz = scanner.nextDouble();

        System.out.println("Ulasma sureniz : "+(mesafe/hiz)+" saat");*/


        /* Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz");
        double mesafe=scan.nextDouble();
        System.out.println("Lutfen ortalama hiz giriniz");
        double hiz=scan.nextDouble();

        System.out.println("Hedefe varacaginiz ortalama sure : "+(mesafe/hiz)+" saattir");*/



        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci vize notunu giriniz");
        int vize1 = scanner.nextInt();

        System.out.println("Lutfen ikinci vize notunu giriniz");
        int vize2 = scanner.nextInt();

        System.out.println("Lutfen final notunu giriniz");
        int finalNotu = scanner.nextInt();

        int vizeort = (vize2+vize1)/2;

        int gecmenotu = ((vizeort/100)*30)+((finalNotu/100)*70);

        System.out.println("Gecme notunuz : "+gecmenotu);*/



        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen vize1 notunu giriniz");
        int vize1=scan.nextInt();
        System.out.println("Lutfen vize2 notunu giriniz");
        int vize2=scan.nextInt();
        System.out.println("Lutfen final notunu giriniz");
        int finalNotu=scan.nextInt();
        System.out.println("Gecme notunuz : "+((((vize1+vize2)/2)/100*30)+(finalNotu/100*70)));*/



        // c = (f-32)*5/9 kullanicidan fahrenait al dereceye cevir


      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen fahrenhait cinsinden bir sicaklik degeri giriniz");
        double fahrenhait =scanner.nextDouble();
        double derece = (fahrenhait-32)*5/9;
        System.out.println("girdiginiz derecenin fahrenhait olarak karsiligi : "+derece);*/


        /* Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen fahrenait cinsinden bir sicaklik degeri giriniz");

        double fahrenait=scan.nextDouble();
         double derece=(fahrenait-32)*5/9;
        System.out.println("Derece cinsinden degeriniz : "+derece);*/


       /* Scanner scan = new Scanner(System.in);
        System.out.println("lutfen a sayisini giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen b sayisini giriniz");
        int b = scan.nextInt();
        System.out.println("lutfen c sayisini giriniz");
        int c = scan.nextInt();
        System.out.println("Sonuc : " + ((a * a) - (b * b)) / (c * 3));*/


    }
}