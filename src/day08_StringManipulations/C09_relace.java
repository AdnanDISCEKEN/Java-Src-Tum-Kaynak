package day08_StringManipulations;

public class C09_relace {
    public static void main(String[] args) {

        String str ="Javasiz olmaz";
        System.out.println(str.replace('J', 'H'));

        System.out.println(str.replace("a", ""));

        System.out.println(str.replace("Javasiz", "X"));

        System.out.println(str.replace("v", "yayayaya"));

        System.out.println(str.replace("va", "lalalala"));

        System.out.println(str);// ilk deger cünkü atama yapmadik tek sefer gorulup gittiler


        // str1 icindeki bosluklari yok edin
        String str1 ="Java ile hayat Cok dahaguzel";

        System.out.println(str1.replace(" ", ""));
        System.out.println("str1 = "+str1);
        str1 = str1.replace(" ","");
        System.out.println("str1 = "+str1);

        String str2="Java hayattir";
        System.out.println(str2.replaceFirst("a", "x"));


    }
}
