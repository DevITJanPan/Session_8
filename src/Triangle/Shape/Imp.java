package Triangle.Shape;

public class Imp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.toString());
        Shape shape = new Shape(5, 6, 7, "blue");
        System.out.println(shape.toString());
    }
}
