package Day07_SwitchStatements_StringManipulations;

public class C07_Contains {
    public static void main(String[] args) {
        String str = "Java ogren offer al";

        // str da a harfi var mi?


        System.out.println(str.contains("a"));//a var mi True

        System.out.println(str.contains("x")); //x var mi false

        System.out.println(str.contains("Offer")); // cumlemizde offer kucuk harfle basladigi icin false
        System.out.println(str.contains("offer")); // cumlemizde offer kucuk harfle basladigi icin true

       // System.out.println(str.contains('e'));// chari dogrudan aratamayiz--char sequence(dizisi) ister


    }
}
