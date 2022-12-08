package sk.sosholic.prvypolrok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nevim {



        static List<ziak> ziakList = new ArrayList<>();
        private static boolean exit = true;
        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moja databaza spoluziakov");
            while(!exit) ;
            {
                int exits = 1;
                while (exits!=0){
                    System.out.println("ak chces vytvorit zaznam stlac 1 a enter");
                    System.out.println("ak chces zmazat zaznam stlac 2 a enter");
                    System.out.println("ak chces zobrazit zaznam stlac 3 a enter");
                    System.out.println("ak chces zobrazit CELY zaznam stlac 4 a enter");
                    System.out.println("ukoncenie programu stlac 0 a enter: ");
                    exits= scanner.nextInt();
                    int menu = scanner.nextInt();
                    switch (menu){
                        case 0:
                            exit = true;
                            System.out.println("Aplikacia sa vypina");
                            break;
                        case 1:
                            System.out.println("Vloz Meno: ");
                            String Meno = scanner.next();
                            System.out.println("Vloz Priezvisko: ");
                            String Priezvisko = scanner.next();
                            System.out.println("Vloz vek: ");
                            int vek = Integer.parseInt(scanner.next());
                            ziak ziak = new ziak(Meno,Priezvisko,vek);
                            ziakList.add(ziak);
                            break;

                        case 2:
                            String menonazmazanie = scanner.next();

                        case 3:
                            System.out.print("Zadaj ziaka na zobrazenie");
                            int cislo = scanner.nextInt();
                            if ((cislo<=0) &(cislo<ziakList.size())){

                        }
                            ziak ziakNazobrazenie = ziakList.get(cislo - 1);
                            System.out.print(ziakList.toString());
                        case 4:
                            System.out.print(ziakList.toString());
                    }
                }
            }

        }
    }

