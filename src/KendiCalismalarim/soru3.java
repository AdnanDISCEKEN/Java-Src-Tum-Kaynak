package KendiCalismalarim;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz");

        String isim=scanner.nextLine();
        String soyisim=scanner.nextLine();
        int yas=scanner.nextInt();

        System.out.println("Isiminiz : "+isim+"\nSoyisminiz : "+soyisim+"\nYasiniz : "+yas+
                "\nKaydiniz basariyla tamamlanmistir");



    }



    }

