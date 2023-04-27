package Day02_dataturleri_scanner;

import java.util.Scanner;

public class C09_SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz");
        double sayi1 = scanner.nextDouble();

        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2 = scanner.nextDouble();

        double temp =0;

        temp = sayi2;

        sayi2=sayi1;

        sayi1 =temp;

        System.out.println("sayilarin yerini degistirdim");

    }
}
