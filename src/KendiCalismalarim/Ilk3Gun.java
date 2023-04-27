package KendiCalismalarim;

import java.util.Scanner;

public class Ilk3Gun {
    public static void main(String[] args) {
        //- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Adinizi,Soyadinizin Ilk Harfini,Yasinizi Giriniz");

        String isim= scanner.nextLine();

        char ilkharf=scanner.nextLine().charAt(0);

        int yas=scanner.nextInt();

        System.out.println("adiniz : " + isim+" "+ "\nsoydinizin ilk harfi : "+ilkharf+" "+"\nyasiniz : " +yas);




    }
}
