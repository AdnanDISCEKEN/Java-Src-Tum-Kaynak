package day05_isElseStatements;

public class C01_basitIfStatement {
    public static void main(String[] args) {


        int a= 20;
        int b=75;

        if (a>b){
            System.out.println("a b'den buyuk");
        }
        if (a%7==0){
            System.out.println("a 7'ye tam olarak bolunur");
        }
        if (b%5==0){
            System.out.println("b 5'e tam bolunur");
        }
        if (a+b >100){
            System.out.println("sayilerin toplami 100'den buyuk");
        }

        // eger if sartından sonra süslü parentez kulanmazsak java ilk ; e kadar olan kısmı if body olarak kabul eder
        //sonraki satirlarla ilgilenmez


        // eger if sartini yazdigimiz parantezden hemen sonra ; yazarsak if statement ; de biter bu sarta bagli hiç
        //kod olma

    }
}
