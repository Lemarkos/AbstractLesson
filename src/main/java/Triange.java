public class Triange extends Figure {
    int a,b,c;

//    public Triange(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    @Override
    void getPerimeter() {

    }

    @Override
    void getArea() {

    }

    @Override
    void showName() {

    }

    @Override
    void coordinate() {

    }

    void checkTr(int a, int b, int c){
        if(a+b>c && a+c>b && c+b>a){
            System.out.println("sushectvuet");
        }else
        System.out.println("ne sushestvuet");
    }
}
