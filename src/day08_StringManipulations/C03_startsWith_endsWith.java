package day08_StringManipulations;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {

        /*
        bir yazi parcasinin bir yazi parcasi ile baslayip baslamadigini true yada false olarak dondurur
        hicbisey diye sorarsak hersey hicbisey ile baslar
         */
        String str = "Java cok eglenceli";
        System.out.println(str.startsWith("java"));//false
        System.out.println(str.startsWith("Java"));// true
        System.out.println(str.startsWith(str));// true //her yazi kendisi ile baslar
        System.out.println(str.startsWith(""));// true //hersey hiclik ile baslar

//*****************************************************************************

/*
endsWith metodu bir yazinin belli bir yazi parcasi ile bitip bitmedigini olcer
 */
        System.out.println(str.endsWith("a")); //false (ne ile biter diye bakiyor)
        System.out.println(str.endsWith("eglenceli")); //true
        System.out.println(str.endsWith("celi")); //true
        System.out.println(str.endsWith("Java cok eglenceli")); //true
        System.out.println(str.length());//18


        System.out.println(str.substring(str.length() - 3));//eli hep son ucunu alir
        System.out.println(str.endsWith(str.substring(str.length()-3)));//true





    }
}
