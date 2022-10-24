package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double width;
    protected double length;

    public abstract void setLength(double length); //these are abstract methods; they do not need a body.

    public abstract void setWidth(double width); //these are abstract methods; they do not need a body.
    public double getLength() {
        return length;
    }

    public double getWidth() {

        return width;
    }




    public Quadrilateral(){}

    public Quadrilateral(double length, double width){
        this.setLength(length);
        this.setWidth(width);
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
    public double getArea(){
        return length * width;
    }


}
