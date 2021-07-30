package thuchanh;

import java.util.Scanner;

public class HinhChuNhat {
    int dai;
    int rong;
    public HinhChuNhat(int dai,int rong){
        this.dai=dai;
        this.rong=rong;
    }

    public int getDai() {
        return dai;
    }

    public int getRong() {
        return rong;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }
    public String display() {
        return "Rectangle{" + "width=" + getDai() + ", height=" + getRong() + "}";
    }
    public int dienTich(){
        return getDai()*getRong();
    }
    public int chuVi(){
        return (dai+rong)*2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chiều dài:");
        int dai=sc.nextInt();
        System.out.println("nhập chiều rộng:");
        int rong=sc.nextInt();
        HinhChuNhat HCN1=new HinhChuNhat(dai,rong);
        System.out.println(HCN1.display());
        System.out.println("Dện tích hình chữ nhật là:"+HCN1.dienTich());
        System.out.println("Chu vi hình chữ nhật là:"+HCN1.chuVi());
    }
}
