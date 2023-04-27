package Day07_SwitchStatements_StringManipulations;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str = "Java Candir";
        // tumunu buyuk yazdirin
        System.out.println(str.toUpperCase());//JAVA CANDİR
        System.out.println(str);//Java Candir

        str =str.toUpperCase();
        System.out.println(str);//JAVA CANDİR

        System.out.println(str.toLowerCase());//java candir

        str =str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);// java candır - i yi ı ya cevirdi


        String str2 = "Kimse beni aramıyor.";
        // turkce karakterlere uygun olarak buyuk haliyle yazdirin

        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));//KİMSE BENİ ARAMIYOR


    }
}
