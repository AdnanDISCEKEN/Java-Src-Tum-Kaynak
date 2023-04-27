package KendiCalismalarim;

import java.util.Arrays;

public class arrayyy_2 {
    public static void main(String[] args) {
        String[] arr = {"Saida","Isa","Asil","Kubra1","Elif","Yusuf"};

      enuzunveEnKisaKelimeler(arr);

        int[] arr1 = {3,5,7,2,1,9};
        int artisMiktari = 5;

        arr1=tumElemanlariArtir(arr1,artisMiktari);
        System.out.println(Arrays.toString(arr1));

    }

    public  static void  enuzunveEnKisaKelimeler(String[]arr){
        String enKisaKelime=arr[0];
        String enUzunKelime=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }

        }
        System.out.println("arreydeki en uzun kelime : "+enUzunKelime);
        System.out.println("arraydeki en kisa kelime : "+enKisaKelime);
    }



    public static int [] tumElemanlariArtir(int[]arr1, int artisMiktari){
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=arr1[i]+artisMiktari;

        }
        return arr1;
    }
}
