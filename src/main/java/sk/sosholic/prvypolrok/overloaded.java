package sk.sosholic.prvypolrok;

import java.util.Arrays;
import java.util.List;

public class overloaded {

    List<String> zoznam = Arrays.asList("Janko, Petko, Jurko");


    String get (){
        return zoznam.toString();
    }
    String get(int poradie){
        return zoznam.get(poradie);

    }
}

