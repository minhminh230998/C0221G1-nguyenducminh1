package baitap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    protected float  x=5.0f;
    protected float y=5.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY () {
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y ;
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
