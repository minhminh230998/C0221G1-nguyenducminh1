package baitap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,0};
        int[] arr3=new int[arr1.length+arr2.length];
        int index=arr1.length;
        for (int i = 0; i <arr1.length ; i++) {
                   arr3[i]=arr1[i];
        }

        for (int i = index; i <arr3.length ; i++) {
            arr3[i]=arr2[i-index];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
