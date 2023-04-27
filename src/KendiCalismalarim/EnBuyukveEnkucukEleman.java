package KendiCalismalarim;

import java.util.Arrays;

public class EnBuyukveEnkucukEleman {
    public static void main(String[] args) {
       /*
        Bir arrayin en buyuk ve en kucuk elemanini yazdirin
         */
        int []  arr = {3,6,8,5,4,3,4,6,7,5,3,2,6,8,9,3};

enBuyukveEnkucukEleman(arr);



    }
    public static void enBuyukveEnkucukEleman (int[]arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Arreydeki en kucuk eleman : "+arr[0]);

        System.out.println("Arreydeki en uzun eleman : "+arr[arr.length-1]);
    }

}
