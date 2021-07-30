package thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("ax+b=0");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số a");
        double a=sc.nextInt();
        if(a==0){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Nhập vào số b");
            double b=sc.nextInt();
            double c=-b / a;
            System.out.println("x ="+c);
        }
    }
}
