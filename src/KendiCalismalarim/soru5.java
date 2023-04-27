package KendiCalismalarim;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

//Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
//girilen bilgiler : J Doe, 44

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz");

        char isim =scanner.nextLine().charAt(0);
        String soyisim=scanner.nextLine();
        int yas=scanner.nextInt();

        System.out.println("Girilen bilgiler : "+isim +" "+soyisim+", "+yas);

    }
}
