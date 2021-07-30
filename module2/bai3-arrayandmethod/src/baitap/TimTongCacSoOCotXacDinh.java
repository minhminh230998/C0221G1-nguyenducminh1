package baitap;

import java.util.Scanner;

public class TimTongCacSoOCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bạn muốn nhập mấy hàng");
        int m = sc.nextInt();
        System.out.println("bạn muốn nhập mấy kí tự trong 1 hàng");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("nhap");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("bạn muốn tính tổng dòng nào(0>m)");
        int Cot = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(Cot==j) {
                        sum += arr[i][j];
                    }
                }
        }
        System.out.println(sum);
    }
}
