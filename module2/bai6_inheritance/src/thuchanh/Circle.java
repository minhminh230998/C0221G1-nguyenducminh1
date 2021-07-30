package thuchanh;

public class Circle extends Shape {
    private double radius=1.0;

    Circle(){
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString()+
                '}';
    }

    public static void main(String[] args) {
        Shape circle1=new Circle("blue",true,10);
        System.out.println(circle1.toString());
    }
}
