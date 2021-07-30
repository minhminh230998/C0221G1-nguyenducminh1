package baitap.interface_Resizeable;

public class Circle extends Circle1 implements Resizeable {

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {

        System.out.println(getArea()+(getArea() * (percent / 100)));
    }

    public static void main(String[] args) {
       double percent=Math.random()*100;
       Circle1 circle2=new Circle();
       ((Circle) circle2).resize(percent);




    }
}
