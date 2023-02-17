public class Circle extends Figure{
    double r;
    double Pi;

    public Circle(String name, double r, double pi) {
        super(name);
        this.r = r;
        Pi = pi;
    }

    @Override
    void getPerimeter() {
        System.out.println("Permiter: " + (2 * Pi * r));
    }

    @Override
    void getArea() {
        System.out.println("Area: " + (Pi * r * r));
    }

    @Override
    void showName() {
        System.out.println("Figure is: " + getName());
    }

    @Override
    void coordinate() {

    }
}