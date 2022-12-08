package zoo;

import java.util.ArrayList;
import java.util.List;

public class zookeeper {

    private List<animal> zoo = new ArrayList<>();
    private String menopriezvisko;

    public zookeeper(String menopriezvisko){
        this.menopriezvisko = menopriezvisko;

    }

    public void pridatzviera(animal animal){
        zoo.add(animal);

    }

    public animal zistinajdrahsiezviera(){
        for (animal animal : zoo){
            animal.getAnimaltype() =
        }

    }
}
