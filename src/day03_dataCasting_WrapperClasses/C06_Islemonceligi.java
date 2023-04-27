package day03_dataCasting_WrapperClasses;

public class C06_Islemonceligi {
    public static void main(String[] args) {
        System.out.println(8*5+2*(12/4)-19);//27

        System.out.println(35/5);//7
        System.out.println(20/8);//2
        //bolunen iki sayida int olursa sonuc int olur

        double dbl =20;
        System.out.println(dbl/8);//2.5 sonuc double olur

        int sayi1=20;
        int sayi2=8;
        //sayi1/sayi2 ondalikli yazdir

        System.out.println((double) sayi1/sayi2);

    }
}
