package KendiCalismalarim;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen bir ondalikli birde tam sayi giriniz");

        double sayi1=scanner.nextDouble();
        int sayi2=scanner.nextInt();

        System.out.println("sayilar toplami : "+ (sayi1+sayi2));
        System.out.println("sayilar carpimi : "+ (sayi1*sayi2));

    }
}
