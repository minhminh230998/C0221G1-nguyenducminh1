package thuchanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Nhập vào năm:");
        int nam = cs.nextInt();
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            System.out.println("Đây là năm nhuận nha");
        } else {
            System.out.println("Đây không phải là năm nhuận bà con ơi");
        }
    }
}
