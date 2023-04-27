package day04_Increment_Concenation;

public class C06_LogicalOperator {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=15;

        // ucunun birbirine esit oldugunu kontrol edin
        System.out.println(a==b && b==c); // false

        //a sayisinin pozitif ve 2 ile tam bolunebilir old kontrol edin
        System.out.println(a>0 && a%2==0); // true

        // b sayisinin 10 ile 50 arasinda old kontrol edin
        System.out.println(b>10 && b<50); // true

       //b sayisinin 10 ile 50 arasinda olmadigini kontrol edin
        System.out.println(b<10 || 50<b); // false



    }
}
