package Circle;

import Resizeable.Resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double  getArea(){
        return length*width;
    }
    public double getPeremiter(){
        return length*2+width*2;
    }
    @Override
    public void resize(double percent) {
        setWidth(width*percent);
        setLength(length*percent);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", length = " + length +
                ", Area = " + getArea()+
                ", Perimeter = "+ getPeremiter() +
                '}';
    }
}
