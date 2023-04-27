package day05_isElseStatements;

import java.util.Scanner;

public class C12_ifElseIfStatements {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
//         sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi",
//         5 ile bolunebiliyorsa "Bes ile bolunebilen sayi" yazdirin.
//         Hem 3, hem 5'e bolunuyorsa SUPER yazdirin
        // ikisinede bolunemeyen sayilar icin yazik yazdirin

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        int girilensayi = scanner.nextInt();

        if (girilensayi%3==0 && girilensayi%5==0){
            System.out.println("Super");
        }
        else if (girilensayi %3 == 0){
            System.out.println("uc ile bolunebilen sayi");
        } else if (girilensayi % 5 ==0) {
            System.out.println("bes ile bolunebilen sayi");

        }else System.out.println("Yazik");


    }
}
