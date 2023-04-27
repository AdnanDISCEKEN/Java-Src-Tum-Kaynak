package day04_Increment_Concenation;

public class C05_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=20;
       /* System.out.println(a = b); // b yi a ya atar ve yazdirir
        System.out.println(a); //20
        System.out.println(b); //20

        */


        System.out.println(a==b); // a b ye esit mi esitse true degilse false FALSE
        System.out.println(2*a==b); //TRUE
        System.out.println(a==b/2); // TRUE

        // a ile b nin esit olmadigigni kontrol edin

        System.out.println(a != b); //TRUE

        System.out.println(a != b/2); //FALSE

        System.out.println(a<b); //TRUE

        System.out.println(a<b/2); //FALSE


        // a b den kucuk degil sartini yazin
        System.out.println( !(a<b) ); //FALSE

        // a b den kucuk veya esit mi
        System.out.println(a<=b); // TRUE

        System.out.println(2*a<=b); // TRUE

        //a b den buyuk mu
        System.out.println(a>b); //FALSE

        System.out.println(5*a>2*b); // TRUE

        boolean c =2 * a >=b; //20>=20 TRUE old icin c nin degeri TRUE olur

        // a nin 3 katinin b den buyuk olmadigi sartini kontrol edin
        System.out.println(!(a*3 >b));  //30>20 TRUE oldugu icin degili FALSE olur



    }
}
