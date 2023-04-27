package day08_StringManipulations;

import java.util.Scanner;

public class C04_StrinManipulationsSorusu {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String email =scanner.next();

       /* if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }
        if (!email.contains("@gmail.com")){
            System.out.println("Mail gmail olmali");
        }
        if (!email.endsWith("@gmail.com")){
            System.out.println("Mailde yazim hatasi var");
        }
        else System.out.println("kayit basarili");*/



        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }
/*
ayni soruyu else ifle yaparsak ilki yanlissa digerleri calismaz dene!!!
 */


    }
}
