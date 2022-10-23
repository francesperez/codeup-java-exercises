package shapes;

import java.awt.font.LineBreakMeasurer;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);

//        System.out.printf("Your perimeter is: %.0f%n",box1.getPerimeter());
//        System.out.printf("Your area is: %.0f%n", box1.getArea());
//
//        System.out.printf("Your perimeter is: %.0f%n", box2.getPerimeter());
//        System.out.printf("Your area is: %.0f%n", box2.getArea());

        Quadrilateral rectangle = new Rectangle(5,8);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Quadrilateral square = new Square(7);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}