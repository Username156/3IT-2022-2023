package sk.sosholic.prvypolrok;

import java.util.Random;
import java.util.Scanner;

class hadaniecisla {


    public static void main(String[]args){

        Random r = new Random();
        int low = 1;
        int high =10001;
        int cisloktoresatrebauhadnut = r.nextInt(high - low) + low;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Toto je hra na hadanie čísla od 1 do 10000");
            System.out.print("Maš 10 pokusov");
            while (true){
                System.out.print("zadaj cislo");
                int cislo = scanner.nextInt();
                System.out.print("zadane cislo je" + cislo);
                boolean neco = cislo< cisloktoresatrebauhadnut;
                if (cislo>cisloktoresatrebauhadnut){
                    System.out.print("zadane cislo" + cislo + "je vedsie");
                }else if (cislo<cisloktoresatrebauhadnut){
                        System.out.print("zadame cislo" + cislo + "je mensie");
                    }else{
                        System.out.print("zadane cislo" +cislo + "sa rovna");
                }
            }
    }
    private int nahodnecislo (int high){
        Random r = new Random();
        int low = 1;
        return r.nextInt(high );
    }
}
