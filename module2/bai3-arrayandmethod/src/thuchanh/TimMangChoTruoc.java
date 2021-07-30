package thuchanh;

import java.util.Scanner;

public class TimMangChoTruoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bạn muốn nhập bao nhiêu số");
        int size=sc.nextInt();
        if(size>20){
            System.out.println("size phải nhở hơn 20");
        }else {
            int[] array=new int[size];
            for (int i = 0; i <array.length ; i++) {
                System.out.println("nhập số");
                array[i]+=sc.nextInt();
            }
            int min=array[0];
            for (int i = 0; i <array.length ; i++) {
                if(array[i]<min){
                    min=array[i];
                }
            }
            System.out.println("Phần tử lớn nhất là: "+min);
        }
    }
}
