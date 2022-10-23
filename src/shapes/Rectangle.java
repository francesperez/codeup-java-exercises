package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public Rectangle(){}

    public Rectangle(double length, double width){
        super (length, width);
    }
}



