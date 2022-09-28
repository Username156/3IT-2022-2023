package sk.sosholic.prvypolrok;

import java.util.Scanner;

public class scanner {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int exit = 1;
        while (exit!=0){
            //toto je moj prvy program

            System.out.println("ak chces scitat stlač 1");
            exit = scanner.nextInt();
            System.out.println("ak chces odcitat stlac 2");
            //Pocitani cisel
            System.out.println("ak chces nasobit stlac 3");
            System.out.println("ak chces delit stlac 4");
            int matematickaOperacia = scanner.nextInt();
            switch (matematickaOperacia){

                case 1:
                    System.out.print("zadaj prve cislo a slac enter:");
                    int scitac1 = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int scitanec2 = scanner.nextInt();
                    System.out.print("vysledok scitania" + (scitanec2+ scitac1));
                    break;

                case 2:
                    System.out.print("zadaj prve cislo a slac enter:");
                    int odcitanec = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int odcitanec2 = scanner.nextInt();
                    System.out.print("vysledok odcitania" + (odcitanec2-odcitanec));
                    break;
                case 3:
                    System.out.print("zadaj prve cislo a slac enter:");
                    int delenec = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int delenec2 = scanner.nextInt();
                    System.out.print("vysledok delenia , vysledok bude neplatny ak delis nulou" + (delenec/delenec2));
                    break;
                case 4:
                    System.out.print("zadaj prve cislo a slac enter:");
                    int krat = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int krat2 = scanner.nextInt();
                    System.out.print("vysledok nasobenia" + (krat*krat2));
                    break;
                default:
                    System.out.print("zly vyber zadaj znova!!");
                    continue;


            }
            System.out.print("ukoncenie programu stlac 0 a enter. Pre pokracovanie stlac 1");
            exit = scanner.nextInt();

        }

        System.out.println("zadaj hocico a stlac enter");
        String ulozenyriadok = scanner.nextLine();
        int ulozeniriadok1 = scanner.nextInt();
        scanner.next();
        scanner.nextBoolean();
        System.out.println(ulozenyriadok);
    }
}
