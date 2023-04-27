package Day07_SwitchStatements_StringManipulations;

public class C06_charAt_lenght {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.charAt(5));//g
        System.out.println(str.charAt(29));//r


        //29 karakterin disina cikinca hata verir

        System.out.println(str.length());// 30

        // son harfi yazdirin
        int uzunluk = str.length();// lenght uzunlugu verir

        System.out.println(str.charAt(uzunluk-1));// son karakteri yazdirir-- ekleme yapsaniz bile son karakteri yazdirir

        // sondan ikinci harfi yazdirin

        System.out.println(str.charAt(uzunluk-2));


        // sondan ucuncu harfi yazdirin

        System.out.println(str.charAt(str.length() - 3));




    }
}
