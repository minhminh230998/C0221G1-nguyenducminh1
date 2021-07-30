package baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bạn muốn nhập mấy phần tử");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhập phần tử");
             arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất là"+min);
    }
}
