package KendiCalismalarim;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanAldigimizDegeriArrayeEkleme {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};  // bu array'a 5 ekleyiniz >>> [2,4,6,8,5]

      /*  int [] yeniArr= new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];


        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arraye eklenecek degeri giriniz");
        int eklenecekDeger=scanner.nextInt();
        yeniArr[yeniArr.length-1]=eklenecekDeger;
        System.out.println(Arrays.toString(yeniArr));
*/

        int [] yeniArr = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];


        }

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen yeni eklenecek array degerini giriniz");
        int eklenecekDeger=scanner.nextInt();
        yeniArr[yeniArr.length-1]=eklenecekDeger;
        System.out.println(Arrays.toString(yeniArr));




    }
}
