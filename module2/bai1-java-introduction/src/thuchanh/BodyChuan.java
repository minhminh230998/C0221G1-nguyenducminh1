package thuchanh;

import java.util.Scanner;

public class BodyChuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào chiều cao (m)");
        float cao=sc.nextFloat();
        System.out.println("Nhập vào cân nặng(kg)");
        float nang=sc.nextFloat();
        float body=nang/(cao*cao);
        if(body<18.5){
            System.out.println("Bạn ốm quá");
        }
        if(body<25){
            System.out.println("Body bạn chuẩn đấy");
        }
        if(body<30){
            System.out.println("Hơi mập rồi đấy");
        }else {
            System.out.println("Con heo");
        }
    }
}
