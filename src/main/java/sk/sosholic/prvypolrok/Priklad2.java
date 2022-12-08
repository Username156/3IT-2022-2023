package sk.sosholic.prvypolrok;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Priklad2 {

    public static void main(String[]args){
        List<String>mojlist = Arrays.asList("Jablko", "Hruska", "Slivka");
        Scanner scanner = new Scanner(System.in);
        System.out.print("zadaj index:");
        int index = scanner.nextInt();
        try{
            System.out.println(mojlist.get(index));
        } catch (Exception ex){
            System.out.println("mame chybu" + ex);
            System.out.println("zadane cislo je mimo liatu");
        }
        mojlist.set(1, "cervena");
        System.out.println(mojlist);
    }

}
