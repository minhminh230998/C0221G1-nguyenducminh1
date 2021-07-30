package thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một số");
        int num = sc.nextInt();
        boolean check = true;
        if (num < 2) {
            check = false;
        }else if(num >= 2) {
           if(num == 2) {
               check = true;
           }else {
               for (int i = 2; i < num; i++) {
                   if (num % i == 0) {
                       check = false;
                   }
               }
           }
        }
        if (check) {
            System.out.println("đây là số nguyên tố");
        } else  {
            System.out.println("đây không phải là sô nguyên tố");
        }
    }

}
