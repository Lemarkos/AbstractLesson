public class Triange extends Figure{
    private int a,b,c;

    public Triange(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean  check(){
        if(a+b>c && a+c>b && c+b>a){
            return true;
        }else
            return false;
    }

    @Override
    void getPerimeter() {
        if (check() == true)
        System.out.println("Perimeter: " + (a + b + c));
        else System.out.println("Can't calculate perimeter!!!");
    }

    @Override
    void getArea() {
        if (check()==true)
        System.out.println("Area: " + (a + b + c)/2);
        else System.out.println("Can't calculate are!!!");
    }

    @Override
    void showName() {
        System.out.println("Figure is: " + getName());
    }

    @Override
    void coordinate() {

    }
}