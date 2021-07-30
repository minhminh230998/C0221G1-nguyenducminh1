package baitap;

import thuchanh.Shape;

public class Circle1 extends Shape {
    private double radius=1.0;

    Circle1(){
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

    public static void main(String[] args) {
        Shape circle1=new Circle1("blue",true,10);
        System.out.println(circle1.toString());
    }
}
