package thuchanh;

import java.util.Scanner;

public class NgayTrongThang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tháng");
        int thang=sc.nextInt();
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng có 30 ngày");
                break;
            case 2:
                System.out.println("tháng có 28 hoặc29 ngày");
        }
    }


}
