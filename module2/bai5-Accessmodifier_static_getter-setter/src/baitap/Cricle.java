package baitap;

public class Cricle {
    float radius;
    String color;
    public static int id = 0;

    public static void id() {

    }

    public Cricle() {
    }

    Cricle(float radius, String color) {
        this.radius = radius;
        this.color = color;
        id++;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "id=" + id +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
