public abstract class Figure {
    private String name;
    private float x;
    private float y;

    public Figure(String name) {
        this.name = name;
    }

        abstract void getPerimeter();
        abstract void getArea();
        abstract void showName();
        abstract void coordinate();

    public String getName() {
        return name;
    }
}
