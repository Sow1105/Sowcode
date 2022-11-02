package inheritance;

public class Area {

    public static void main(String[] args) {

        //Area of circle
//        Circle c = new Circle();
//        c.setRadius(5);
//        double area = c.getArea(c.getRadius());
//        System.out.println(area);

        //Area of rectangle
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        double area1 = r.getArea(r.getLength(), r.getWidth());
        System.out.println(area1);

        //Volume of Cuboid
        Cuboid c1 = new Cuboid();
        c1.setThickness(10);
        double volume = c1.getVolume(r.getLength(), r.getWidth(), c1.getThickness());
        System.out.println(volume);

    }
}

