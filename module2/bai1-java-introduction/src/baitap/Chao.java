package baitap;

import java.util.Scanner;

public class Chao {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,4,1,5,1};
         int max=0;
        for (int i=0; i<arr.length;i++){
            int count=0;
            int a=arr[i];
            for (int j=0; j<arr.length; j++){
                if(a==arr[j]){
                    count++;

                }
            }
            if(count>=max){
                max=count;
            }

        }
        System.out.println(max);


    }
}
