package thuchanh;

import java.util.Scanner;

public class DienTichVaChuVi {
    public static void main(String[] args) {
        int dai;
        int rong;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào dài");
        dai=sc.nextInt();
        System.out.println("Nhập vào rộng");
        rong=sc.nextInt();
        int s=dai*rong;
        int c=(dai+rong)*2;
        System.out.println("Diện tích là:"+s +"\n Chu vi là:"+c);
    }
}
