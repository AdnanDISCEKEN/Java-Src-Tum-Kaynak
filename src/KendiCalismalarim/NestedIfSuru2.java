package KendiCalismalarim;

import java.util.Scanner;

public class NestedIfSuru2 {
    public static void main(String[] args) {
        //Kullanicidan yas degerini alın ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
//0 - 4 => bebek
//5 - 12 => cocuk
//13 - 20 => genc
//21 - 30 => yetiskin
//Tanimlanmamis evre

        /*Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if(yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre...");
        }*/

        //Kullanicidan yas degerini alın ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre
     /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yas giriniz");
        int yas = scanner.nextInt();

        if (yas>30||yas<0){
            System.out.println("Tanimlanmamis evre");
        } else if (yas>=0 && yas<=4) {
            System.out.println("Bebek");

        } else if (yas>=5 && yas<=12) {
            System.out.println("Cocuk");

        } else if (yas>=13 && yas<=20) {
            System.out.println("Genc");

        }else System.out.println("yetiskin");*/

        //Kullanicidan yas degerini alın ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen yas giriniz");
        int yas = scanner.nextInt();

        if(yas <=30 && yas >= 0)
            if (yas>=0 && yas<=4){
                System.out.println("Bebek");
            } else if (yas>=5 && yas<=12) {
                System.out.println("Cocuk");

            } else if (yas>=13 && yas <=20) {
                System.out.println("Genc");

            }else System.out.println("Yetiskin");
        else System.out.println("Tanimlanmamis evre");


    }
}
