package thuchanh;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width < length){
            this.width = width;
        }
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {
        if(length<width) {
            this.length = length;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int width=sc.nextInt();
        int length=sc.nextInt();
        Rectangle rectangle1=new Rectangle(width,length);
        System.out.println(rectangle1.toString());
    }
}
