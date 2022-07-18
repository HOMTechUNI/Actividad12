public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void makeSUV(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine();
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void makeSport(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine();
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
