package KendiCalismalarim;

public class miniHesapMakinesi {
    // kullanicinin verdigi iki sayi ve
    // sececegi isleme gore
    // sonucu double olarak bize donduren bir method olusturun
    // ornek sayilar 3, 5,   islem * oldugunda method 15 dondurmeli
    public static void main(String[] args) {
        hesapMakinesi(5,4,'+');
        System.out.println(hesapMakinesi(5, 4, '+'));


    }
    public  static  double hesapMakinesi(int sayi1,int sayi2,char islemSembolu) {

        double sonuc = 0;
        switch (islemSembolu) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = (double) sayi1 / sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis");

        }
        return sonuc;

    }
}
