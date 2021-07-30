package baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào usd:");
        double usd=sc.nextDouble();
        double vnd=usd*23000;
        System.out.println("Thành tiền:"+vnd+"vnd");
    }
}
