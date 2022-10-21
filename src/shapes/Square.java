package shapes;

public class Square extends Rectangle {

    protected double side;


    public Square(double side){
        super(side,side);
    }
    public double getArea() {
        System.out.println("I was overridden!");
        side = super.length;
        super.width = side;
        return side * 2;
    }


    public double getPerimeter() {
        System.out.println("I was overridden!");
        side = super.length;
        super.width = side;
        return side * 4;
    }




}
