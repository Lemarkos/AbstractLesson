public class Triange extends Figure{
    private int a,b,c;

    public Triange(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void check(){
        if(a+b>c && a+c>b && c+b>a){
            System.out.println("Triangle exists");
        }else
            System.out.println("Triangle not exists");
    }

    @Override
    void getPerimeter() {
        System.out.println("Perimeter: " + (a + b + c));
    }

    @Override
    void getArea() {
        System.out.println("Area: " + (a + b + c)/2);
    }

    @Override
    void showName() {
        System.out.println("Figure is: " + getName());
    }

    @Override
    void coordinate() {

    }
}