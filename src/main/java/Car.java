public class Car {
    int numSeats;
    Boolean haveComputer;
    Boolean haveGPS;

    String engine;

    public Car(){
        numSeats = 0;
        haveComputer = false;
        haveGPS = false;
        engine="";
    }
    @Override
    public String toString(){
        String Computer=((haveComputer)?"si":"no");
        String GPS=((haveGPS)?"si":"no");
        return "el auto tiene las siguientes características :" +
                "\n-"+numSeats+" asientos" +
                "\n-"+Computer+" tiene computador" +
                "\n-"+GPS+" tiene gps" +
                "\n-motor de tipo "+engine;
    }
}
