package Circle;

public class TestCircle {
    public static void main(String[] args) {
        double percent =  Math.random()*100;
        Circle circle = new Circle();
        circle = new Circle(5);
        circle.resize(percent);
        Rectangle rectangle = new Rectangle(2,4);
        rectangle.resize(percent);
        System.out.println("percent: " + percent);
        System.out.println(rectangle);
        Square square = new Square();
        square.resize(percent);
        System.out.println(square);
    }
}
