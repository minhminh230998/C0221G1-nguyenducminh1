package controller;

import common.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HamNhapDuLieu implements Regex {
    static Scanner sc=new Scanner(System.in);
    public static String nhapHoTen(){
        System.out.println("Nhap ho va ten");
        String hoTen=sc.nextLine();
        while (!Pattern.matches(HO_TEN,hoTen)){
            System.out.println("sai dinh dang,moi nhap lai");
            hoTen=sc.nextLine();
        }
        return hoTen;

    }
    public static String nhapNgaySinh(){
        System.out.println("Nhap ngay thang nam sinh");
        String ngaySinh=sc.nextLine();
        while (!Pattern.matches(NAM_SINH,ngaySinh)){
            System.out.println("sai dinh dang,moi nhap lai");
            ngaySinh=sc.nextLine();
        }
        return ngaySinh;

    }
    public static String nhapGioiTinh(){
        System.out.println("Nhap gioi tinh");
        String gioiTinh=sc.nextLine();
        while (!Pattern.matches(GIOI_TINH,gioiTinh)){
            System.out.println("sai dinh dang,moi nhap lai");
            gioiTinh=sc.nextLine();
        }
        return gioiTinh;

    }
    public static String nhapSoCMND(){
        System.out.println("Nhap so CMND");
        String soCMND=sc.nextLine();
        while (!Pattern.matches(SO_CMND,soCMND)){
            System.out.println("sai dinh dang,moi nhap lai");
            soCMND=sc.nextLine();
        }
        return soCMND;
    }
    public static String nhapSDT(){
        System.out.println("Nhap SDT");
        String sDT=sc.nextLine();
        while (!Pattern.matches(SDT,sDT)){
            System.out.println("sai dinh dang,moi nhap lai");
            sDT=sc.nextLine();
        }
        return sDT;

    }
    public static String nhapEmail(){
        System.out.println("Nhap email");
        String email=sc.nextLine();
        while (!Pattern.matches(EMAIL,email)){
            System.out.println("sai dinh dang,moi nhap lai");
            email=sc.nextLine();
        }
        return email;

    }
    public static String nhapLoaiKhach(){
        System.out.println("Nhap loai khach hang");
        String loaiKhachHang=sc.nextLine();
        while (!Pattern.matches(LOAI_KHACH_HANG,loaiKhachHang)){
            System.out.println("sai dinh dang,moi nhap lai");
            loaiKhachHang=sc.nextLine();
        }
        return loaiKhachHang;
    }
    public static String nhapDiaChi(){
        System.out.println("Nhap dia chi");
        String diaChi=sc.nextLine();
        while (!Pattern.matches(DIA_CHI,diaChi)){
            System.out.println("sai dinh dang,moi nhap lai");
            diaChi=sc.nextLine();
        }
        return diaChi;

    }
}
