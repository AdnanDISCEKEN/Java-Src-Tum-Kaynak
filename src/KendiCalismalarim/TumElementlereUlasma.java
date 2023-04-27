package KendiCalismalarim;

public class TumElementlereUlasma {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {3, 4}, {2, 8, 1, 2}, {10}};
        // tum elementleri aralarinda bir bosluk birakarak yanyana yazdiralim


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }

        }
        System.out.println("");
        // tum elementlerin toplamini yazdirin

        int toplam =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];

            }

        }
        System.out.println("Tum elemanlarin toplami : "+toplam);


        System.out.println("");
        // MDA'deki en buyuk elementi yazdirin

        int enbuyukElement=arr[0][0];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>enbuyukElement){
                    enbuyukElement=arr[i][j];
                }

            }


        }
        System.out.println("En buyuk element : "+enbuyukElement);


        System.out.println("");
        // MDA'daki cift sayilari yanyana yazdirin

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }

            }

        }


    }
}
