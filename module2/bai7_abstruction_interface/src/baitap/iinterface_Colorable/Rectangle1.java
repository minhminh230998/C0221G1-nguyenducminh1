package baitap.iinterface_Colorable;

import baitap.interface_Resizeable.Shape;

public class Rectangle1 extends Shape1  {
    private int width=10;
    private int length=15;

    public Rectangle1() {

    }

    public Rectangle1(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle1(String color, boolean filled, int width, int length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int dienTich(){
        int s=length*width;
        return s;
    }
    public int chuVi(){
        int s=(length+width)*2;
        return s;
    }

    @Override
    public String toString() {
        return "Rectangle1" +
                " width=" + width +
                ", length=" + length +", "+
                super.toString() +
                ", diện tích="+dienTich()
                +
                ", chu vi="+chuVi();
    }



}
