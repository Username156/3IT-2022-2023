package zoo;

    public class animal {



   private String animaltype;
   private double value;

   public animal(String animaltype, double value){
       if (value<=0){
        this.value = 0;
       }else{
           this.value = value;
       }
        if(animaltype.equals("")){
            this.animaltype = "student 3TPI";
        }else{
            this.animaltype = animaltype;
        }

       this.animaltype = checkName(animaltype);
       this.value = value;

       }

        public String getAnimaltype(){
            return animaltype;
        }

        public void setAnimaltype(String animaltype){

        }
    }
