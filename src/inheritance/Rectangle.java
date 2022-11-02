package inheritance;

public class Rectangle extends Shape {
    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(double length, double width) {
        area = length * width;
        return area;

    }

    public double getPerimeter(double length, double width) {
        perimeter = 2 * (length + width);
        return perimeter;
    }
// @Override
     public void getAge(){
        int a=0;

     }


    }

