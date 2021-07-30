package baitap;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 5.0f;

    public Point3D() {
    }

    public Point3D(float x, float y) {
        super(x, y);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public void setXYZ(float z) {
        getXY();
        this.z = z;
    }


    @Override
    public String toString() {
        return "Point3D " +
                super.toString() +
                " z=" + z;
    }

    public static void main(String[] args) {
        Point3D point2D1=new Point3D();
        System.out.println(Arrays.toString(point2D1.getXYZ()));
    }
}
