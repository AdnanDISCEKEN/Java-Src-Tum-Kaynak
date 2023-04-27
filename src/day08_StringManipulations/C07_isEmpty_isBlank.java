package day08_StringManipulations;

public class C07_isEmpty_isBlank {
    public static void main(String[] args) {
        String str ="Java candir";
        System.out.println(str.isEmpty()); // false bos birakilip birakilmadigini kontrol eder true bos, false dolu

        System.out.println(str.isBlank());  // sadece bosluklardan olusup olusmadigini komtrol eder
                                            // sadece bosluksa true degilse false


        str = "           ";
        System.out.println(str.isEmpty());//F ici bos mu false
        System.out.println(str.isBlank());//T ici bosluk mu true


        str="";

        System.out.println(str.isEmpty());//T
        System.out.println(str.isBlank());//T
        System.out.println(str.length());//0

    }
}
