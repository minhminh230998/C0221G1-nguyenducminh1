package baitap;

import java.util.Scanner;

public class TimSoLonNhatCuaMaTran {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bạn muốn nhập mấy hàng");
        int m=sc.nextInt();
        System.out.println("bạn muốn nhập mấy kí tự trong 1 hàng");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("nhap");
                arr[i][j]=sc.nextInt();
            }

        }
        int max=arr[0][0];
        int index1=0;
        int index2=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.println("số lớn nhất trong mảng là "+max+", vị trí là hang "+index1+", cột "+index2);
    }
}
