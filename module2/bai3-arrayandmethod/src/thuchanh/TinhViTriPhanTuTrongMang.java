package thuchanh;

import java.util.Scanner;

public class TinhViTriPhanTuTrongMang {
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

            for (int i = 0; i <array.length ; i++) {
                if(nhap==array[i]){
                    System.out.println("Vị trí của số "+nhap+"l à "+(i+1));
                }
            }
        }
    }
}
