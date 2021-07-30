package thuchanh;

public class Rectangle extends Shape {
    public int width=10;
    public int length=15;

    public Rectangle() {

    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, int width, int length) {
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
        return length*width;

    }
    public int chuVi(){
        int s=(length+width)*2;
        return s;
    }

    @Override
    public String toString() {
        return "Rectangle" +
                " width=" + width +
                ", length=" + length +", "+
                super.toString() +
                ", diện tích="+dienTich()
                +
                ", chu vi="+chuVi();
    }


}
