package quan_li_danh_ba.commons;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exception implements Regex {
    public static boolean soDienThoai(String soDienThoai) {
        if (Pattern.matches(SO_DIEN_THOAI, soDienThoai)) {
            return true;
        }
        return false;
    }

    public static boolean nhom(String nhom) {
        if (Pattern.matches(NHOM, nhom)) {
            return true;
        }
        return false;
    }

    public static boolean hoTen(String hoTen) {
        if (Pattern.matches(HO_TEN, hoTen)) {
            return true;
        }
        return false;
    }

    public static boolean gioiTinh(String gioiTinh) {
        if (Pattern.matches(GIOI_TINH, gioiTinh)) {
            return true;
        }
        return false;
    }

    public static boolean diaChi(String diaChi) {
        if (Pattern.matches(DIA_CHI, diaChi)) {
            return true;
        }
        return false;
    }

    public static boolean ngaySinh(String ngaySinh) {
        if (Pattern.matches(NGAY_SINH, ngaySinh)) {
            return true;
        }
        return false;
    }

    public static boolean email(String email) {
        if (Pattern.matches(EMAIL, email)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


int m=0;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {

                System.out.print(k+m + " ");

            }
            m++;
            System.out.println("");


        }
//        int num;
//        System.out.print("Nhập số dòng của hình: ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        for (int r = 1; r <= num; r++) {
//            for (int sp = 1; sp <= num - r; sp++) {
//                System.out.print("  ");
//            }
//            for (int c = 1; c <= 2 * r - 1; c++) {
//                System.out.print(" " + c);
//            }
//            System.out.println();
//        }
//
//
//    }
    }
}
