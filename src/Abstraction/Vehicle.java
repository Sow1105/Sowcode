package Abstraction;

public abstract class Vehicle {

    public Vehicle() {
    }

    abstract void Start();


    abstract void numberOfTyres();

    static double seatCount;

    public double getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(double seatCount) {
        Vehicle.seatCount = seatCount;
    }
    public static void fuelType(){

    }
}



