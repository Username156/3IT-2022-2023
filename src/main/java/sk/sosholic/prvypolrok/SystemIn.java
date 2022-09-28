package sk.sosholic.prvypolrok;

import java.util.Scanner;

public class SystemIn {
    public static void
    main(String[]args){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("zadaj volaco a stlac enter");
        String meno = scanner.nextLine();

        MojeMeno mojeMeno= new MojeMeno(meno, "Helesi");

        for (int x=1; x<=10; x++){
            if(x%2==0)
                System.out.println(mojeMeno.getCeleMeno()+ " " +x);
            MojeMeno mojeMeno1 = new MojeMeno(meno,"Lukas");

        }
    }
}
