package baitap;

import thuchanh.Circle;

public class Cylinder extends Circle1 {
    private int h = 5;

    public Cylinder() {
    }

    public Cylinder(String color, boolean filled, int radius) {
        super(color, filled, radius);
    }

    public Cylinder(String color, boolean filled, int radius, int h) {
        super(color, filled, radius);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double thetich() {

        return getArea()*h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +
                super.toString()+
                ", thể tích"+thetich()+
                '}';
    }

    public static void main(String[] args) {
Circle1 cylinder=new Cylinder();
        System.out.println(cylinder.toString());
    }
}
