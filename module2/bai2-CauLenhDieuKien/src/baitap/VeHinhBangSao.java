package baitap;

import java.util.Scanner;

public class VeHinhBangSao {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("nhập vào chiều dài");
        int dai=sc.nextInt();
        System.out.println("nhập vào chiều rộng");
        int rong=sc.nextInt();
        for(int i=0;i<dai;i++){
            for (int j = 0; j <rong ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
