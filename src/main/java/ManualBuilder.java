public class ManualBuilder implements Builder{

    private Manual manual;

    public ManualBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.numSeats = seats;
    }

    @Override
    public void setEngine() {

    }

    @Override
    public void setTripComputer(Boolean bool) {
        this.manual.haveComputer = bool;
    }

    @Override
    public void setGPS(Boolean bool) {
        this.manual.haveGPS = bool;
    }

    public Manual getResult(){
        return this.manual;
    }
}
