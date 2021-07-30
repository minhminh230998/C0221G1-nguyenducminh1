package baitap.interface_Resizeable;

public  class Rectangle1 extends Rectangle implements Resizeable {
    public Rectangle1() {

    }

    public Rectangle1(String color, boolean filled, int width, int length) {
        super(color, filled, width, length);
    }
    @Override
    public void resize(double percent){
        System.out.println(dienTich()+(percent*dienTich()/100));
    }

    public static void main(String[] args) {
        double percent=10;
        Rectangle rectangle1=new Rectangle1();
        ((Rectangle1)rectangle1).resize(percent);
    }
}
