package baitap;

import java.util.Scanner;

public class TongDuongCheoLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn Muốn nhập vào mấy hàng");
        int hang = sc.nextInt();
        System.out.println("Bạn Muốn nhập vào mấy cột");
        int cot = sc.nextInt();
        int[][] arr = new int[hang][cot];
        if (hang == cot) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println("nhập phần tự trong mảng");
                    arr[i][j] = sc.nextInt();
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
