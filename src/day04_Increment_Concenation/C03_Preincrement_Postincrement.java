package day04_Increment_Concenation;

public class C03_Preincrement_Postincrement {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a++); // 10 yazdirir 11 e çıkarır


        System.out.println(a);// 11

        System.out.println(++a);// 12

        System.out.println(a);// 12

        int b= a++;

        System.out.println("a : "+a+ ", b :"+b);// a:13 , b:12

        a=--b;

        System.out.println("a : "+a+ ", b :"+b);// a:11 , b:11

        int c = a++ + ++b ;

        System.out.println("a : "+a+ ", b :"+b + ", c : "+ c);







    }
}
