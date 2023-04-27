package day06_nestedIfElseStatements_TernaryOperator;

public class C05_ternaryOperators {
    public static void main(String[] args) {
        int sayi =14;

        //sayinin tek veya cift oldugunu yazdirin

        if (sayi%2==0){
            System.out.println("Verilen sayi cift sayi");
        }
        else {
            System.out.println("Verilen sayi tek sayidir");
        }

        // ternary operatorleri basit if else cumleleri daha kisa yazabilmekicindir


        System.out.println(sayi % 2 == 0 ? "Verilen sayi cift sayi" : "Verilen sayi tek sayidir");


    }
}
