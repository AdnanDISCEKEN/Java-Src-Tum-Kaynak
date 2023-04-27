package KendiCalismalarim;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciTarafindanOlusturulanArray {
    public static void main(String[] args) {

        // 1) kullaniciden array boyutu al
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int arrayBoyut =scanner.nextInt();

        int [] arr = new int[arrayBoyut];
        int arrayElementi=0;

        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println("Lutfen arreyın"+i+"ci elemanini giriniz");
            arrayElementi=scanner.nextInt();
            arr[i]=arrayElementi;


        }
        System.out.println(Arrays.toString(arr));




    }
}
