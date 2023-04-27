package KendiCalismalarim;

import java.util.Arrays;

public class splitornek {
    public static void main(String[] args) {
        String str = "Java yilin bu zamanlarinda bir baska guzel oluyor Java olmadan java ogrenilmez";
     // Kac tane "java" var ?


        String[] kelimeKelime=str.split(" ");
        System.out.println(Arrays.toString(kelimeKelime));
        int sayac =0;
        for (int i = 0; i <kelimeKelime.length ; i++) {
            if (kelimeKelime[i].equalsIgnoreCase("java"))
                sayac++;

        }
        System.out.println("Verilen array "+sayac+" adet java kelimesi iceriyor");

}
}