public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triange("Triangle", 5,7,9);
        Figure rectangle = new Rectangle("Rectangle", 10,15);
        Figure square = new Square("Square", 5,5);
        Figure circle = new Circle("Circle", 8, 3.14);
        ((Triange)triangle).check();
        triangle.showName();
        triangle.getPerimeter();
        triangle.getArea();

        rectangle.showName();
        rectangle.getPerimeter();
        rectangle.getArea();

        square.showName();
        square.getPerimeter();
        square.getArea();

        circle.showName();
        circle.getPerimeter();
        circle.getArea();
    }
}
