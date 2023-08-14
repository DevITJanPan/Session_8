package Circle.Cylinder;

public class Imp {
    public static void main(String[] args) {
        Circle circle = new Circle(6.0, "blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5.0, "yellow", 7.0);
        System.out.println(cylinder.toString());
    }
}
