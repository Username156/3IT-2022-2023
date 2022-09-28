package sk.sosholic.prvypolrok;

public class git {

    public static void main(String[]args){
        MojeMeno mojeMeno= new MojeMeno("Lukas","Helesi");
        for (int i = 0; i < 10; i++) {
            //System.out.println("Lukas Helesi" + i);
            if(i%2==0)
            System.out.println(mojeMeno.getCeleMeno() + i);


        }

    }
}
