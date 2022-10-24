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



        Measurable myShape;
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(4,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}