package baitap.iinterface_Colorable;

import thuchanh.interface_comparable.Shape;

public class text {
    public static void main(String[] args) {
        Shape1[] array = new Shape1[3];
        array[0] = new Square("blue", true, 15);
        array[1] = new Rectangle1("red", true, 11, 22);
        array[2] = new Circle1("blue", true, 15);
        Shape1 square1 = new Square();
        if (square1 instanceof interfaceColorable) {
            ((Square) square1).howToColor();
        }
    }
}





