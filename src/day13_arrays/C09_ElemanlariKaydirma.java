package day13_arrays;

import java.util.Arrays;

public class C09_ElemanlariKaydirma {
    public static void main(String[] args) {
        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.

        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        int [] arr = {4,5,6,7};
        elementleriKaydirma(arr);

    }


    public static int [] elementleriKaydirma(int[] arr){
        int temps = arr[arr.length-1]; // son indeksi temps e atadik

        for (int i = 0; i <arr.length-1 ; i++) {

            arr[arr.length-1-i] = arr[arr.length-2-i];// 3. indekse 2. indeksi ata
            //2. indekse 1. indeksi ata
            // 1. indekse 0. indeksi ata

        }
        arr[0] = temps; //temps e atadigimiz son indeksi 0. i indekse atadik
        System.out.println(Arrays.toString(arr));// yazdirdik
        return arr; // yapilan islem sonucunda dondurmesini istedigimiz kod blogu/cevap
    }



  /*  public static void main(String[] args) {
        // Soru 3-  Verilen bir array’deki tum elementleri bir saga kaydirip,
        //          sondaki elementi de basa tasiyacak bir method olusturun,
        //          array’i yeni haliyle kaydedin.
        //      Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]
        //1) sondaki elemanı gecici bir yere kaydet
        //2) elemanlari saga kaydir
        //3) son elemani basa koy
        int[] input = {4, 5, 6, 7};
        System.out.println(Arrays.toString(input));
        input = elemanlariSagaKaydir(input); // methodu kullanmak çağırdık
        System.out.println(Arrays.toString(input));
    }
    // methodun (makinenin) kendisi
    public static int[] elemanlariSagaKaydir(int[] input) {
        //[4,5,6,7]
        // 1) array'in son elemaninin kaydet. Length kullanarak dinamip yapi
        int gecici = input[input.length - 1];  // son eleman index length-1
        // 2) dinamik olarak elemanlari saga kaydir
        for (int i = input.length - 2; i >= 0; i--) {
            input[i + 1] = input[i];
        }
        // 3) kaydedilen gecici elemani basa koy
        input[0] = gecici;
        return input; // updated ( değiştirilen) array methodun cagirildigi yere dondurulur
    }*/


}
