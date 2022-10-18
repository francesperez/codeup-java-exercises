package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        double argCircle = userInput.getDouble();
        Circle radius1 = new Circle(argCircle);
        System.out.println("Circumference: " + radius1.getCircumference());
        System.out.println("Area: " + radius1.getArea());
    }
}
