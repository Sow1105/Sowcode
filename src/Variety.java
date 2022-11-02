public class Variety {
   public String name;
   public String model;
    String color;
   public static String company="onePlus";


    public static void main(String[] args) {
        Variety v= new Variety();
        v.name="Oneplus Nord";
        v.model="Basic";
        v.color="Black";
        System.out.println(v.name);
        System.out.println(v.model);
        System.out.println(v.color);
        System.out.println(company);

        Variety v2= new Variety ();
        v2.name="One plus 7T";
        v2.model="c2";
        v2.color="Blue";
        Variety.company="oneplus";

        System.out.println(v2.name);
        System.out.println(v2.model);
        System.out.println(v2.color);
        System.out.println(company);



    }
}
