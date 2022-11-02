package inheritance;

public class Circle extends Shape {
    private double radius;
    private static double pi = 3.142f;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getArea(double radius) {
         area = pi * radius * radius;
        return area;

    }

    public double getPerimeter(double radius) {
         perimeter = 2 * pi * radius;
        return perimeter;
    }


}
