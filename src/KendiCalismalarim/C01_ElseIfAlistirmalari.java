package KendiCalismalarim;

import java.util.Scanner;

public class C01_ElseIfAlistirmalari {
    public static void main(String[] args) {
//*********************************************************************************************************
        /*Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz," +
                "her giristen sonra entere basiniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }
        else {
            System.out.println("Eskenar ucgen degil");
        }*/
//*****************************************************************************************************

        /*- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin*/

       /* Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not = scanner.nextInt();

        if (not>100 || not<0) System.out.println("Gecersiz not");
        else if (not>=50) System.out.println("Sinifi Gectin");
        else System.out.println("Maalesef kaldin");*/

//***************************************************************************************************
        /*- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();
        if (yas>=65){
            System.out.println("Emekli Olabilirsin");}
        else  if(yas<65)
        { System.out.println("emekliliğe alan sureniz : "+ (65-yas));

        }*/

//***************************************************************************************************

        /*- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        olup olmadigini yazdirin*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");*/










//******************************************************************************************************
       /* Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        olarak yazdirin, yoksa girilen harfi yazdirin*/









//********************************************************************************************************

        /*- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin*/

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Erkek yada Kadin Olarak Giriniz ");
        String erkek =scanner.nextLine();
        String kadin =scanner.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz");
        int yas =scanner.nextInt();

















    }
}
