public class CarBuilder implements Builder{

    private Car car;

    public CarBuilder(){
        this.reset();
    }

    @Override
    public void reset(){
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.numSeats = seats;
    }

    @Override
    public void setEngine() {

    }

    @Override
    public void setTripComputer(Boolean bool) {
        this.car.haveComputer = bool;
    }

    @Override
    public void setGPS(Boolean bool) {
        this.car.haveGPS = bool;
    }

    public Car getResult(){
        return this.car;
    }
}
