package inheritance;

public class Cylinder extends Circle {
    private double height;
    private double areaCyl;
    private double volumeCYl;


    public double getArea(double height, double radius) {
        areaCyl = getArea(10) * height * 2;
        return areaCyl;
    }

    public double getVolume(double height, double radius) {
        volumeCYl = getArea(10) * height;
        return volumeCYl;

    }
}
