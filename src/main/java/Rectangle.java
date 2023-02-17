public class Rectangle extends Figure{
    private int a,b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    void getPerimeter() {
        System.out.println("Perimeter: " + 2 * (a + b));
    }

    @Override
    void getArea() {
        System.out.println("Area: " + a * b);
    }

    @Override
    void showName() {
        System.out.println("Figure is: " + getName());
    }

    @Override
    void coordinate() {

    }
}