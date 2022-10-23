package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double width;
    protected double length;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
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
