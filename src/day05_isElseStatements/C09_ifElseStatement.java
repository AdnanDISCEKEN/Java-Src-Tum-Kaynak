package day05_isElseStatements;

import java.util.Scanner;

public class C09_ifElseStatement {
    public static void main(String[] args) {
        //girilen karakter kucuk harf ise buyuk yazdirin yoksa aynen yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char karakter =scanner.next().charAt(0);

        if ('a'<= karakter && karakter<='z'){
            System.out.println("Girilen kucuk harfin yeni hali : "+Character.toUpperCase(karakter));
        }else {
            System.out.println("Girilen karakter : "+karakter);
        }
    }
}
