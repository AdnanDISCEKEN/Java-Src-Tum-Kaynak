package KendiCalismalarim;

public class arrayyy {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,1,3,7,5,9};

        int sayac =0;
        for (int i = 0; i <arr.length ; i++) {
            if (!(arr[i]%2==0)){
                sayac++;
            }

        }
        System.out.println("Array deki tek sayi adedi : "+sayac);




        sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%3==0){
                sayac++;
            }

        }
        System.out.println("arraydeki üc ile tam bolunebilen sayi adedi : "+sayac);



        sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=4 && arr[i]<=8){
                sayac++;
            }

        }
        System.out.println("Arraydeki 4 ile 8 arasındaki sayi adedi : "+sayac);


        System.out.println("Array deki en buyuk sayi : "+enBuyukSayi(arr));


    }
    public  static int enBuyukSayi(int[]arr){
        int enBuyuksayi=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>enBuyuksayi){
                enBuyuksayi=arr[i];
            }

        }
        return enBuyuksayi;
    }
}
