package KendiCalismalarim;

public class arreydeElemanArama {
    public static void main(String[] args) {
        String[] sinifListesi= {"Saida","Isa","Asil","Kubra","Elif","Yusuf","isa"};
        String arananIsim="Isa";

arreydekiElemaniBul(sinifListesi,arananIsim);
    }



    public static void arreydekiElemaniBul(String[]arr,String aranan){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equalsIgnoreCase(aranan)){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aradiginiz isim listede yok");
        }else {
            System.out.println("Aradiginiz isim listede "+sayac+" adet bulunuyor");
        }
    }
}
