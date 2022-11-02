public class Cylinder {
   public static double height;
   public static double radius;
    public double volume;
    public double area;
  public static final double  pi=3.142;
    public double area( double radius , double  height){
        return  2*pi*radius*(height + radius) ;

    }
    public double volume(double radius , double  height ){
        return area( radius,height) * height ;

    }
}
