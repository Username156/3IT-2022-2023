package sk.sosholic.prvypolrok;

public class Spustacia {

    public static void main(String[]args){

        overloaded neco = new overloaded();
        System.out.println(neco.get());
        System.out.println(neco.get());

        convertToCentimaters(140);
        convertTocentimeter(14,200);
    }

        //1 inch = 2.54cm
        static double convertToCentimaters(int inches){
            return inches * 2.54;

        }

        // 1 feet = 12 inches
        static double convertTocentimeter(int feet, int inches){
            double feetsToinches = feet * 12;
            double totalinches = feetsToinches + inches;
            return totalinches * 2.54;

            static String getdurationString(int seconds){
                int minutycele = seconds/60;
                int zostatoksecund = seconds % 60;
                int hours = minutycele /60;
                int reminderMinutes = minutycele %60;
                return hours + "Hod" + reminderMinutes + "min" + zostatoksecund + "Sec";
            }

                static String getDurationString(seconds + seconds1)




    }
}
