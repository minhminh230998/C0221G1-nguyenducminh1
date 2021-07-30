package quanlitiendien.controller;

import bien_kiem_soat_xe.controller.QuanLyNhapDuLieu;
import quanlitiendien.commons.DocGhiFile;
import quanlitiendien.models.HoaDon;
import quanlitiendien.models.KhachHang;
import quanlitiendien.models.KhachHangNuocNgoai;
import quanlitiendien.models.KhachHangVietNam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiChucNang {
    public static void themKhachHangVietNam() {
        List<KhachHang> list = new ArrayList<>();

        String maKhachHang = QuanLiNhapDuLieu.themMaKhachHangVietNam();
        String hoTen = QuanLiNhapDuLieu.themHoTen();
        String loaiKhachHang = QuanLiNhapDuLieu.loaiKhach();
        String dinhMucTieuThu = QuanLiNhapDuLieu.themDinhMucTieuThu();
        list.add(new KhachHangVietNam(maKhachHang, hoTen, loaiKhachHang, dinhMucTieuThu));
        DocGhiFile.ghiFileKhachHang(list, true);
    }

    public static void themKhachHangNuocNgoai() {
        List<KhachHang> list = new ArrayList<>();

        String maKhachHang = QuanLiNhapDuLieu.themMaKhachHangNuocNgoai();
        String hoTen = QuanLiNhapDuLieu.themHoTen();
        String quocTich = QuanLiNhapDuLieu.themQuocTich();
        list.add(new KhachHangNuocNgoai(maKhachHang, hoTen, quocTich));
        DocGhiFile.ghiFileKhachHang(list, true);
    }

    public static void hienThiKhachHangVietNam() {
        List<KhachHang> list = new ArrayList<>();
        list = DocGhiFile.docFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof KhachHangVietNam) {
                System.out.println(list.get(i).showInfor());
            }
        }
    }

    public static void hienThiKhachHangNuocNgoai() {
        List<KhachHang> list = new ArrayList<>();
        list = DocGhiFile.docFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof KhachHangNuocNgoai) {
                System.out.println(list.get(i).showInfor());
            }
        }
    }

    public static void timKiemKhachhang() {
        List<KhachHang> list = DocGhiFile.docFile();
        boolean check = false;
        String timKiem = QuanLiNhapDuLieu.nhapTimKiemKhachHang();
        for (KhachHang khachHang:list) {
            if (khachHang.getHoTen().contains(timKiem)) {
                System.out.println(khachHang.showInfor());
                check = true;
            }
        }
        if (!check) {
            System.out.println("khong tim thay");
        }
    }

    public static void themHoaDon() {
        List<HoaDon> list=new ArrayList<>();
        String id=QuanLiNhapDuLieu.maHoaDon();
        String maKhachHang=QuanLiNhapDuLieu.chonKhachHang();
        String ngayXuatHoaDon=QuanLiNhapDuLieu.ngayRaDon();
        String soLuong=QuanLiNhapDuLieu.soLuong();
        String donGia=QuanLiNhapDuLieu.donGia();
        String thanhTien=QuanLiNhapDuLieu.thanhTien();
        list.add(new HoaDon(id,maKhachHang,ngayXuatHoaDon,soLuong,donGia,thanhTien));
        DocGhiFile.ghiFileHoaDon(list,true);

    }
    public static void hienThiHoaDon(){
        List<HoaDon> list=new ArrayList<>();
        list=DocGhiFile.docFileHoaDon();
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).toString());
        }
    }
    public static void chinhSuaHoaDon(){
        String chon=null;
        boolean check=false;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            List<HoaDon> list = new ArrayList<>();
            list = DocGhiFile.docFileHoaDon();
            for (int i = 0; i < list.size(); i++) {
                System.out.print((i + 1) + ":");
                System.out.println(list.get(i).toString());
            }
            chon= scanner.nextLine();
            for (int i = 0; i <list.size() ; i++) {
                if(i==Integer.parseInt(chon)-1){
                    System.out.println("nhap hoa don");
                    list.get(i).setDonGia(scanner.nextLine());
                    System.out.println("nhap ngay");
                    list.get(i).setNgayRaHoaDon(scanner.nextLine());
                    System.out.println("nhap so luong");
                    list.get(i).setSoLuong(scanner.nextLine());
                }
            }
            DocGhiFile.ghiFileHoaDon(list,false);
        }



    }

    public static void menuThemKhachHang(){
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm mới khách hàng Viet Nam.\n" +
                    "2. Thêm mới khách hàng nuoc ngoai.\n" +
                    "3. Ve menu chinh\n");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    themKhachHangVietNam();
                    break;
                case "2":
                    themKhachHangNuocNgoai();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nhap sai, nhap lai");
            }

        }
    }
    public static void menuHienThiKhachHang(){
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("1. Hien thi khách hàng Viet Nam.\n" +
                    "2. Hien thi khách hàng nuoc ngoai.\n" +
                    "3. Ve menu chinh\n");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    hienThiKhachHangVietNam();
                    break;
                case "2":
                    hienThiKhachHangNuocNgoai();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nhap sai, nhap lai");
            }

        }
    }



}

