package day05_isElseStatements;

import java.util.Scanner;

public class C08_ifElseStatement {
    public static void main(String[] args) {
        /*girilen karakterin buyuk harf olup ulmadigini yazdirin

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char karakter =scanner.next().charAt(0);

        if ('A' <= karakter && karakter<='z') {
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk degil");
        }

    }
}
