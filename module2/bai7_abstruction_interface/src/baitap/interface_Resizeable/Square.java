package baitap.interface_Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square(String color, boolean filled, int width, int length) {
        super(color, filled, width, length);
    }

    @Override
    public void resize(double percent) {
        if(getWidth()==getLength()){
            System.out.println(dienTich()+(percent*dienTich()/100));
        }
    }
}
