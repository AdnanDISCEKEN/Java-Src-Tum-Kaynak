package KendiCalismalarim;

import java.util.Arrays;

public class arrayBinary {
    public static void main(String[] args) {
        String str = "Java gercekten cok guzel";

        String[] herHarf=str.split("");


        System.out.println(Arrays.toString(herHarf));
        int sayac =0;

        for (int i = 0; i < herHarf.length ; i++) {
            if (herHarf[i].equalsIgnoreCase("e"))
                sayac++;

        }
        System.out.println("e harfinden "+sayac+" adet var");
    }
}
