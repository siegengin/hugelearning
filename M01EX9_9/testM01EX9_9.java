
public class testM01EX9_9 {
    // main() method
    public static void main(String[] args) {
// default constructor
        RegularPolygon p1 = new RegularPolygon();
// print perimeter
        System.out.println("Polygon 1 perimeter:" + p1.getPerimeter());
// print area
        System.out.println("Polygon 1 area:" + p1.getArea());
// parameterized constructor
        RegularPolygon p2 = new RegularPolygon(6,4);
// print perimeter
        System.out.println("Polygon 2 perimeter:" + p2.getPerimeter());
// print area
        System.out.println("Polygon 2 area:" + p2.getArea());
// parameterized constructor
        RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
// print perimeter
        System.out.println("Polygon 3 perimeter:" + p3.getPerimeter());
// print area
        System.out.println("Polygon 3 area:" + p3.getArea());

    }

}
