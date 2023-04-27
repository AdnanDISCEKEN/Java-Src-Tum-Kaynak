package Day07_SwitchStatements_StringManipulations;

public class C09_equelsIgnoreCase {
    public static void main(String[] args) {
        String str1 ="Java";

        String str2 ="Java";

        String str3= "java";

        String str4="JAVA";

        String str5 ="JaVa";

        String str6 = new String( "Java");
        System.out.println(str1.equalsIgnoreCase(str3));//true buyuk kucuge takilma ignor et dedik
        System.out.println(str4.equalsIgnoreCase(str5));// true
        System.out.println(str6.equalsIgnoreCase(str2));//true

    }
}
