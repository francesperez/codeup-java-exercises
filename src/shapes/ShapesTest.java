package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(5);

        System.out.printf("Your perimeter is: %.0f%n",box1.getPerimeter());
        System.out.printf("Your area is: %.0f%n", box1.getArea());

        System.out.printf("Your perimeter is: %.0f%n", box2.getPerimeter());
        System.out.printf("Your area is: %.0f%n", box2.getArea());
    }

}
