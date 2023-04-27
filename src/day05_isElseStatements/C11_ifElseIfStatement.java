package day05_isElseStatements;

import java.util.Scanner;

public class C11_ifElseIfStatement {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
//         sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi",
//         5 ile bolunebiliyorsa "Bes ile bolunebilen sayi" yazdirin.
//         Hem 3, hem 5'e bolunuyorsa SUPER yazdirin
/*
çoklu if else blokları else ile biterse tum durumlari kapsiyor demektir ve her durumda bir if bodysi calisir
ancak else ile bitmiyorsa bu durumda bazi degerler icin kod calisir
ama hiçbir if bodysi calismayabilir
 */
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

        }


    }
}
