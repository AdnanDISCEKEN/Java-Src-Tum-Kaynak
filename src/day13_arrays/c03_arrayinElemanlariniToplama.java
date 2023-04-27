package day13_arrays;

public class c03_arrayinElemanlariniToplama {
    public static void main(String[] args) {
        // verilen int[]'in tum elementlerini toplayip
        // sonucu yazdiran bir method olusturun
        int[] arr = {2,4,6,8,1,3,8,2,3,5,6};
        elemanlarinToplaminiYazdir(arr);

        int[] betul={5,6,7};
        toplamBetul(betul);


        carpimbetul(betul);
    }
    public static void elemanlarinToplaminiYazdir(int[] arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println("Array'deki elementlerin toplami : " + toplam);
    }



    public static void toplamBetul(int[]betul){
        int toplamBetul=0;
        for (int i = 0; i <=betul.length-1 ; i++) {
            toplamBetul+=betul[i];}
        {

            System.out.println("betul arrayindeki sayilarin toplami : "+toplamBetul);
        }
    }

    public static void carpimbetul(int[]betul){
        int carpimbetul =1;
        for (int i = 0; i <=betul.length-1 ; i++) {
            carpimbetul*=betul[i];


        }
        System.out.println("betul arrayi carpimlari : "+carpimbetul);
    }

}
