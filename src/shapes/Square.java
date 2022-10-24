package shapes;

public class Square extends Quadrilateral {

    @Override
    public void setLength(double side) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double side) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter(){
        return 4 * length;
    }



    public Square(double side){
        super.length = side;
        super.width = side;
    }
}
