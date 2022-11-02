package inheritance;

public class Cuboid extends Rectangle {

    private double thickness;
    private double areaCuboid;
    private double volCuboid;

    public double getThickness() {
        return thickness;
    }
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getArea(double length, double width) {
        areaCuboid = 2 * ((length * width) + (width * thickness) + (thickness * length));
        return areaCuboid;
    }
public double getVolume(double length, double width, double thickness){
        volCuboid=length *width * thickness;
        return volCuboid;
}
}

