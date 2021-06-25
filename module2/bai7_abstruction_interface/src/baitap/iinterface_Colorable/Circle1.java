package baitap.iinterface_Colorable;


import thuchanh.interface_comparable.Shape;

public class Circle1 extends Shape1  {
    private double radius=1.0;

    public Circle1() {
    }

    Circle1(double radius, String color, boolean filled){
    }

    public Circle1(int radius) {
        this.radius = radius;
    }

    public Circle1(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return
                "radius=" + radius +
                super.toString();
    }


}
