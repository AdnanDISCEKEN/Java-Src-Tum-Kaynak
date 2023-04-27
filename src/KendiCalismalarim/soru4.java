package KendiCalismalarim;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

//Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
//yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kısa ve uzun kenar uzunluklarini giriniz");

        int kenar1=scanner.nextInt();
        int kenar2=scanner.nextInt();

        System.out.println("Dikdortgenin alanı : "+ (kenar1*kenar2));


    }
}
