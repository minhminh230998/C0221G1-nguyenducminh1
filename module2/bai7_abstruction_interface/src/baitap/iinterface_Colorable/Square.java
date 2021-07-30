package baitap.iinterface_Colorable;


public class Square extends Shape1 implements interfaceColorable {
    private int width=10;

    public Square(String color, boolean filled, int width) {
        super(color, filled);
        this.width = width;
    }

    public Square() {
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides");
    }

    public int dienTich() {
        return width*width;
    }


}
