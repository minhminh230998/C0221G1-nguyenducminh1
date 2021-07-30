package thuchanh;

import java.util.Scanner;

public class Tienlai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tiền bạn vay");
        int tienGoc=sc.nextInt();
        System.out.println("nhập số tháng muốn trả");
        int thang=sc.nextInt();
        System.out.println("nhập số phần trăm lãi xuất(số nguyên)");
        int lai=sc.nextInt();
        int totalInterset=0;
        for(int i = 0; i < thang; i++){
            totalInterset += tienGoc*lai/100;
        }
        System.out.println(totalInterset);
    }
}
