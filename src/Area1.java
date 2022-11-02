public class Area1 {


    public static void main(String[] args) {
        Cylinder Cyl= new Cylinder();
double area = Cyl.area(10, 15);
double volume = Cyl.volume(10,15);
printArea(area);
printVolume(volume);
    }

    public static void printArea(double area){
    System.out.println("Area of cylinder is " + area);
    }
    public static void printVolume(double volume){
        System.out.println("Volume of cylinder is " + volume);

    }
}
