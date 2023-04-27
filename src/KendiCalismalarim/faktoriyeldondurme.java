package KendiCalismalarim;

public class faktoriyeldondurme {
    // Verilen sayinin faktoryel degerini hesaplayip
    // sonucu donduren bir method olusturun
    public static void main(String[] args) {

        System.out.println(foktoryeldondur(8));
    }
    public  static int foktoryeldondur(int sayi){
      int faktoriyel = 1;
        for (int i = sayi; i >=1 ; i--) {
           faktoriyel *=i;

        }
        return faktoriyel;
    }
}
