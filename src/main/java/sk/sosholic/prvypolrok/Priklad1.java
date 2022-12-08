package sk.sosholic.prvypolrok;

public class Priklad1 {
    public static void main(String[]args) throws Exception{

        try {
            System.out.println("nejaky beh programu");
            throw new Exception("toto je nejaka chyba!");
        }

       catch (Exception ex){
            System.out.println("toto nastane ked je chyba a bezi kod v case ");
       }
            finally {
            System.out.println("tento kod sa vykona vzdy nezavisle a hyby");
        }
    }
}
