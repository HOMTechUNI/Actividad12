public class Client {
    public  static void main (String[]args){
        Director director=new Director();
        CarBuilder builder=new CarBuilder();
        director.makeSport(builder);
        Car car=builder.getResult();
        System.out.println(car);
        director.makeSUV(builder);
        car=builder.getResult();
        System.out.println("-----------");
        System.out.println(car);



    }


}
