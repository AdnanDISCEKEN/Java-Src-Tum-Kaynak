package KendiCalismalarim;

import java.util.Scanner;

public class SORU6ilk3gunson {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap=scanner.nextDouble();
        double pi=3.14;

        System.out.println("Cemberin cevresi : "+(2*pi*yaricap));
        System.out.println("cemberin alani : "+pi*(yaricap*yaricap));
    }
}
