package Abstraction;

public class Car extends Vehicle {

    public Car() {
    }

    void Start() {
        System.out.println("Starts with Key");
    }

    @Override
    public void numberOfTyres() {
        System.out.println("4");
            }

}



