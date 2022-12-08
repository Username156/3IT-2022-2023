package zoo;

public class hmyz extends animal {

    private int pocetnoh;
    public hmyz(String animaltype, double value, int pocetnoh) {
        super(animaltype, value);
        this.pocetnoh = checkpocetnoh(pocetnoh);

    }
    public int getPocetnoh(){
        return pocetnoh;
    }

    public void setPocetnoh(int pocetnoh){
        this.pocetnoh = checkpocetnoh(pocetnoh);

    }
    private int checkpocetnoh(int pocetnoh){
        if(pocetnoh==0 );

    }
}

