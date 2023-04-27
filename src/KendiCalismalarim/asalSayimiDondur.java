package KendiCalismalarim;

public class asalSayimiDondur {
    // verilen bir sayinin asal sayi olup olmadigini
    // true/ false olarak donduren bir method olusturun
    public static void main(String[] args) {

        System.out.println(asalMi(23));

    }

    public static boolean asalMi(int sayi) {
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }
        return asalMi;
    }
}