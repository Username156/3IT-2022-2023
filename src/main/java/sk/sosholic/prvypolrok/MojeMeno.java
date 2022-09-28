package sk.sosholic.prvypolrok;

public class MojeMeno {
        String meno;
        String priezvisko;

        public MojeMeno(String meno, String priezvisko){
            this.meno = meno;
            this.priezvisko = priezvisko;

    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getCeleMeno(){

            return meno + (" " + priezvisko);




    }
}
