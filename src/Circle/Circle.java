package Circle;
import Resizeable.Resizeable;
public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public void resize(double percent) {
        System.out.println("radius before resize is: " + radius);
        System.out.println("radius after resize is"+radius*radius);
    }
}
