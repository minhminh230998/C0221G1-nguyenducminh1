package baitap;

import java.awt.*;

public class person {
    private Color colorHair;
    private double height;
    private int age;
    person(Color colorHair, double height, int age) {
        this.colorHair = colorHair;
        this.height = height;
        this.age = age;
    }

    public Color getColorHair() {
        return colorHair;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setColorHair(Color colorHair) {
        this.colorHair = colorHair;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void displayInformation() {
        System.out.println(getHeight() + " " + getColorHair());
    }

    public static void main(String[] args) {
        person person1 = new person(Color.black, 160.5, 20);
        person1.displayInformation();
    }

}


