package zoo;

public class fish extends animal {

    String typvody;
    public fish(String animaltype, double value,String typvody) {
        super(animaltype, value);
        this.typvody = typvody;
    }

    public String getTypvody(){
        return  typvody;
    }

        public void setTypvody(String typvody){
        this.typvody = typvody;
        }

    @Override
    public String toString() {
        return "fish{" +
                "typvody='" + typvody + '\'' +
                '}';
    }
}

