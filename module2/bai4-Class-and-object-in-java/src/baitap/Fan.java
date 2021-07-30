package baitap;

import java.awt.*;

public class Fan {
    int speed;
    boolean congTat=false;
    double radius;
    Color color;
    public Fan(int speed,double radius,Color color,boolean congTat){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
        this.congTat=congTat;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }
    public String getCongtat(){
        String a="";
        if(congTat==true){
            a="bật";
        }else {
            a="tắt";
        }
        return a;
    }

    public void setCongTat(boolean congTat) {
        this.congTat = congTat;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public String disPlay(){
        return "tốc độ quạt: "+getSpeed()+"\nbán kính quạt: "+getRadius()+"\nmàu của quạt: "+getColor()+"\ntrạng thái: "+getCongtat();
    }


    public static void main(String[] args) {
        Fan fan1=new Fan(3,10,Color.yellow,true);
        Fan fan2=new Fan(2,5,Color.blue,false);
        System.out.println("quạt 1");
        System.out.println(fan1.disPlay());
        System.out.println("quạt 2");
        System.out.println(fan2.disPlay());
    }
}
