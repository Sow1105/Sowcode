package Abstraction;

public class Start {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.Start();
        C1.numberOfTyres();
        C1.setSeatCount(7);
        double seat = C1.getSeatCount();
        System.out.println(seat);
//        Vehicle v=new Vehicle() ;
    }


}
