package Point.MoveablePoint;

public class Imp {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint(3, 4, 5, 6);
        System.out.println(moveablePoint.toString());
    }
}
