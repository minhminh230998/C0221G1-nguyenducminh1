package baitap;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập vào bao nhiêu số");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("nhập");
            array[i] = sc.nextInt();
        }
        System.out.println("nhập vào số bạn muốn thêm");
        int n=sc.nextInt();
        System.out.println("nhập vào vị trí bạn muốn thêm");
        int index=sc.nextInt();
        for (int i = 0; i <array.length+1 ; i++) {
            System.out.println(themPhanTu(array,n,index)[i]);
        }
    }
    public static int[] themPhanTu(int[] arr, int n, int index) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < index-1) {
                arr1[i] = arr[i];
            } else if (i == index-1) {
                arr1[i] = n;
            } else {
                arr1[i] = arr[i-1];
            }
        }
        return arr1;
    }
}
