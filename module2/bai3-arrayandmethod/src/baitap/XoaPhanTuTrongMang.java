package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
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
            System.out.println("bạn muốn tìm số?");
            int nhap=sc.nextInt();
            int[] array1=new int[array.length-1];
            for (int i = 0; i <array.length ; i++) {
                if(nhap==array[i]){
                    int index=i;
                    for (int j = index; j < array.length-1; j++) {
                        array[j]=array[j+1];
                    }
                }
            }
            for (int i = 0; i <array.length-1 ; i++) {
                array1[i]=array[i];
            }
            System.out.println(""+ Arrays.toString(array1));
        }
    }
}
