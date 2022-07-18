public class Manual {

    int numSeats;

    Boolean haveComputer;

    Boolean haveGPS;

    String engine;

    public Manual() {
        numSeats = 0;
        haveComputer = false;
        haveGPS = false;
        engine = "";
    }

    @Override
    public String toString() {
        String Computer = ((haveComputer) ? "si" : "no");
        String GPS = ((haveGPS) ? "si" : "no");
        return "el manual tiene las instrucciones para un auto con las siguientes características :" +
                "\n-" + numSeats + " asientos" +
                "\n-" + Computer + " tiene computador" +
                "\n-" + GPS + " tiene gps" +
                "\n-motor de tipo " + engine;
    }

}
