package Circle;

import Resizeable.Resizeable;

public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getAre(){
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }

    @Override
    public void resize(double percent) {
        setSide(percent*side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "Are=" + getAre()+
                "Peremiter= " +getPerimeter() +
                '}';
    }
}
