package shapes;

public class Rectangle {
    protected double length; //can be accessed anywhere with inherited classes
    protected double width;

    public Rectangle(){} //no-arg constructor

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("This is the superclass");
        return length * width;

    }

    public double getPerimeter(){
        System.out.println("This is the superclass");
        return  2 * (length + width);
    }


}
