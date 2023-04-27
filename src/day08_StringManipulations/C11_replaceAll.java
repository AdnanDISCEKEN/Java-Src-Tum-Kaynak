package day08_StringManipulations;

public class C11_replaceAll {
    public static void main(String[] args) {
        // str icindeki tum sayilari method ile temizleyim
        String str = "      J23a3345+%v^+%4+%353a 23%&4C%&3543/(45a3()456n345d/(i&/r^+          ";

        str =str.replaceAll("\\d","");
        System.out.println(str);

    }
}
