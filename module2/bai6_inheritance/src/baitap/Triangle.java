package baitap;

import thuchanh.Shape;

public class Triangle extends Shape {
    public double  side1=1.0;
    public double  side2=1.0;
    public double  side3=1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }
    public double getArea(){
       double p=getPerimeter()/2;
       return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }  

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", chu vi="+getPerimeter()+
                ", diện tích="+getArea()+
                '}';
    }

    public static void main(String[] args) {
        Shape triangle1=new Triangle();
        System.out.println(triangle1.toString());
    }
}
