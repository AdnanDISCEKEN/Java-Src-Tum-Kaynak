package KendiCalismalarim;

import java.util.Scanner;

public class nestedIfSorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini girmesini isteyin, girilen gun hafta ici bir gun ise
“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
zamani” yazdirin.*/



      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz: ");
        String gun = scanner.next();

        if (gun.equalsIgnoreCase("pazartesi") ||
                gun.equalsIgnoreCase("salı")
                || gun.equalsIgnoreCase("çarşamba") ||
                gun.equalsIgnoreCase("perşembe") ||
                gun.equalsIgnoreCase("cuma")) {


            if (gun.equalsIgnoreCase("pazartesi")) {
                System.out.println("Simdi calisma zamani. Tatile 5 gün var.");
            } else if (gun.equalsIgnoreCase("salı")) {
                System.out.println("Simdi calisma zamani. Tatile 4 gün var.");
            } else if (gun.equalsIgnoreCase("çarşamba")) {
                System.out.println("Simdi calisma zamani. Tatile 3 gün var.");
            } else if (gun.equalsIgnoreCase("perşembe")) {
                System.out.println("Simdi calisma zamani. Tatile 2 gün var.");
            } else {
                System.out.println("Simdi calisma zamani. Tatile 1 gün var");
            }

        } else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("Simdi dinlenme zamani.");

        } else {
            System.out.println("Geçerli bir gün ismi giriniz.");
        }*/

        /*Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun = scanner.nextLine();

        if (gun.equalsIgnoreCase("pazartesi")||
           gun.equalsIgnoreCase("sali")||
           gun.equalsIgnoreCase("carsamba")||
           gun.equalsIgnoreCase("persembe")||
           gun.equalsIgnoreCase("cuma"))
        {
            if (gun.equalsIgnoreCase("pazartesi")){
            System.out.println("Simdi calisma zamani tatile 5 gun var");
            }else if (gun.equalsIgnoreCase("sali")){
            System.out.println("Simdi calisma zamani tatile 4 gun var");
            } else if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("Simdi calisma zamani tatile 3 gun var");

            } else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("Simdi calisma zamani tatile 2 gun var");

            } else {
            System.out.println("Simdi calisma zamani tatile 1 gun var");
        }
        }else if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")){
            System.out.println("Simdi tatil zamani");
        }else System.out.println("Hatali giris yaptınız");

*/

        /*Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun =scanner.nextLine();

        if (gun.equalsIgnoreCase("pazartesi")||
        gun.equalsIgnoreCase("sali")||
        gun.equalsIgnoreCase("carsamba")||
        gun.equalsIgnoreCase("persembe")||
        gun.equalsIgnoreCase("cuma")) {
            if (gun.equalsIgnoreCase("pazartesi")) {
                System.out.println("Simdi calisma zamani tatile 5 gun var");
            } else if (gun.equalsIgnoreCase("sali")) {
                System.out.println("Simdi calisma zamani tatile 4 gun var");

            } else if (gun.equalsIgnoreCase("carsamba")) {
                System.out.println("Simdi calisma zamani tatile 3 gun var");

            } else if (gun.equalsIgnoreCase("persembe")) {
                System.out.println("Simdi calisma zamani tatile 2 gun var");

            } else {
                System.out.println("Simdi calisma zamani tatile 1 gun var");
            }
        }else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")); {
            System.out.println("Simdi tati zamani");

        }else {
            System.out.println("Hatali giris yaptiniz");
        }*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun =scanner.nextLine();

        if (gun.equalsIgnoreCase("pazartesi")||
        gun.equalsIgnoreCase("sali")||
        gun.equalsIgnoreCase("carsamba")||
        gun.equalsIgnoreCase("persembe")||
        gun.equalsIgnoreCase("cuma"))
            if (gun.equalsIgnoreCase("pazartesi")){
                System.out.println("Simdi calisma zamani tatile 5 gun var");
            } else if (gun.equalsIgnoreCase("sali")) {
                System.out.println("Simdi calisma zamani tatile 4 gun var");

            } else if (gun.equalsIgnoreCase("carsamba")) {
                System.out.println("Simdi calisma zamani tatile 3 gun var");

            } else if (gun.equalsIgnoreCase("persembe")) {
                System.out.println("Simdi calisma zamani tatile 2 gun var");

            }else {
                System.out.println("Simdi calisma zamani tatile 1 gun var");
            }

        else if (gun.equalsIgnoreCase("cumartesi")|| gun.equalsIgnoreCase("pazar")) {
            System.out.println("Simdi tatil zamani");

        }else {
            System.out.println("Hatali giris yaptiniz");
        }*/



       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun =scanner.nextLine();

        if (gun.equalsIgnoreCase("pazartesi")||
        gun.equalsIgnoreCase("sali")||
        gun.equalsIgnoreCase("carsamba")||
        gun.equalsIgnoreCase("persembe")||
        gun.equalsIgnoreCase("cuma"))
            if (gun.equalsIgnoreCase("pazartesi")){
                System.out.println("Simdi calisma zamani tatile 5 gun var");
            } else if (gun.equalsIgnoreCase("sali")) {
                System.out.println("Simdi calisma zamani tatile 4 gun var");

            } else if (gun.equalsIgnoreCase("carsamba")) {
                System.out.println("Simdi calisma zamani tatile 3 gun var");

            } else if (gun.equalsIgnoreCase("persembe")) {
                System.out.println("Simdi calisma zamani tatile 2 gun var");

            }else {
                System.out.println("Simdi calisma zamani tatile 1 gun var");
            }
        else if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")) {
            System.out.println("Simdi tatil zamani");
        }
        else {
            System.out.println("Hatali giris yaptiniz");
        }*/

    /*
        Kullanicidan gun ismini girmesini isteyin, girilen gun hafta ici bir gun ise
“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
zamani” yazdirin.*/


    Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun = scanner.nextLine();

       if (gun.equalsIgnoreCase("Pazartesi")||
           gun.equalsIgnoreCase("Sali")||
               gun.equalsIgnoreCase("Carsamba")||
        gun.equalsIgnoreCase("Persembe")||
                gun.equalsIgnoreCase("Cuma")
       )
           if (gun.equalsIgnoreCase("pazartesi")){
               System.out.println("Simdi calisma zamani tatile 5 gun var");
           } else if (gun.equalsIgnoreCase("sali")) {
               System.out.println("Simdi calisma zamani tatile 4 gun var");

           } else if (gun.equalsIgnoreCase("carsamba")) {
               System.out.println("Simdi calisma zamani tatile 3 gun var");

           } else if (gun.equalsIgnoreCase("persembe")) {
               System.out.println("Simdi calisma zamani tatile 2 gun var");

           }else System.out.println("Simdi calisma zamani tatile 1 gun var");
       else if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")) {
           System.out.println("Simdi tatil zamani");

       }else System.out.println("Hatali giris yaptiniz");


    }
}
