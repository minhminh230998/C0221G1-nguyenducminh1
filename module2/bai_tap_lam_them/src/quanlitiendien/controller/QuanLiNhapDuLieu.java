package quanlitiendien.controller;

import quanlitiendien.commons.DocGhiFile;
import quanlitiendien.commons.Regex;
import quanlitiendien.models.HoaDon;
import quanlitiendien.models.KhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QuanLiNhapDuLieu implements Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String themMaKhachHangVietNam() {
        System.out.println("Nhap ma khach hang Viet Nam");
        String maKhachHang = scanner.nextLine();
        while (!Pattern.matches(MA_KHACH_HANG_VIET_NAM, maKhachHang)) {
            System.out.println("Nhap dung dinh dang");
            maKhachHang = scanner.nextLine();
        }
        return maKhachHang;
    }

    public static String themMaKhachHangNuocNgoai() {
        System.out.println("Nhap ma khach hang nuoc ngoai");
        String maKhachHang = scanner.nextLine();
        while (!Pattern.matches(MA_KHACH_HANG_NUOC_NGOAI, maKhachHang)) {
            System.out.println("Nhap dung dinh dang");
            maKhachHang = scanner.nextLine();
        }
        return maKhachHang;
    }

    public static String themHoTen() {
        System.out.println("Nhap ho ten khach hang");
        String hoTen = scanner.nextLine();
        while (!Pattern.matches(TEN_KHACH_HANG, hoTen)) {
            System.out.println("Nhap dung dinh dang");
            hoTen = scanner.nextLine();
        }
        return hoTen;
    }

    public static String themDinhMucTieuThu() {
        System.out.println("Nhap dinh muc tieu thu");
        String dinhMucTieuThu = scanner.nextLine();
        while (!Pattern.matches(DINH_MUC_TIEU_THU, dinhMucTieuThu)) {
            System.out.println("Nhap dung dinh dang");
            dinhMucTieuThu = scanner.nextLine();
        }
        return dinhMucTieuThu;
    }

    public static String themQuocTich() {
        System.out.println("Nhap quoc tich");
        String quocTich = scanner.nextLine();
        while (!Pattern.matches(QUOC_TICH, quocTich)) {
            System.out.println("Nhap dung dinh dang");
            quocTich = scanner.nextLine();
        }
        return quocTich;
    }

    public static String loaiKhach() {
        String chon = null;
        boolean kiemTra = false;
        String loaiKhach = null;
        List<String> list = DocGhiFile.docFileLoaiKhach();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ":");
            System.out.println(list.get(i));
        }
        System.out.println("ban la loai khach hang");
        chon = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (i == (Integer.parseInt(chon) - 1)) {
                kiemTra = true;
                loaiKhach = list.get(i).split(",")[1];
            }
        }
        while (!kiemTra) {
            System.out.println("khong tim thay ");
            chon = scanner.nextLine();
        }
        return loaiKhach;
    }

    public static String nhapTimKiemKhachHang() {
        System.out.println("nhap khach hang tim kiem");
        String timKiem = scanner.nextLine();
        return timKiem;
    }

    public static String chonKhachHang() {
        String chon = null;
        boolean kiemTra = false;
        String maKhachHang = null;
        List<KhachHang> list = DocGhiFile.docFile();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ":");
            System.out.println(list.get(i).showInfor());
        }
        System.out.println("ban la loai khach hang");
        chon = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (i == (Integer.parseInt(chon) - 1)) {
                kiemTra = true;
                maKhachHang = list.get(i).toString().split(",")[0];
            }
        }
        while (!kiemTra) {
            System.out.println("khong tim thay ");
            chon = scanner.nextLine();
        }
        return maKhachHang;
    }

    public static String maHoaDon() {
        String maHoaDon = "";
       List<HoaDon> list = new ArrayList<>();
       list=DocGhiFile.docFileHoaDon();
        for (int i = 0; i < (list.size()+1); i++) {
            maHoaDon = "MHD-00" + (i + 1);
        }
        return maHoaDon;


    }
    public static String ngayRaDon(){
        System.out.println("Nhap ngay ra don");
        String ngayRaDon= scanner.nextLine();
        while (!Pattern.matches(NGAY_RA_HOA_DON,ngayRaDon)){
            System.out.println("Nhap dung dinh dang");
            ngayRaDon=scanner.nextLine();
        }
        return ngayRaDon;
    }
    static String soLuong1=null;
    public static String soLuong(){
        System.out.println("Nhap so luong (kW)");
        String soLuong= scanner.nextLine();
        while (!Pattern.matches(SO_LUONG,soLuong)){
            System.out.println("Nhap dung dinh dang");
            soLuong=scanner.nextLine();
        }
        soLuong1=soLuong;
        return soLuong;
    }
    static String gia="";
    public static String donGia(){
        System.out.println("Nhap don gia");
        String donGia= scanner.nextLine();
        while (!Pattern.matches(DON_GIA,donGia)){
            System.out.println("Nhap dung dinh dang");
            donGia=scanner.nextLine();
        }
        gia=donGia;
        return donGia;
    }
    public static String thanhTien(){
        int thanhTien=Integer.parseInt(gia)*Integer.parseInt(soLuong1);

        String thanhTien1=Integer.toString(thanhTien);
        return thanhTien1;
    }

}
