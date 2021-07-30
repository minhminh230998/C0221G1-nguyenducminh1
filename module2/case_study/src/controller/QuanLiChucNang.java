package controller;

import common.DocGhiFile;
import models.KhachHang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLiChucNang {
    public static void themMoiKhachHang(){
        String hoTen=HamNhapDuLieu.nhapHoTen();
        String ngaySinh=HamNhapDuLieu.nhapNgaySinh();
        String gioiTinh=HamNhapDuLieu.nhapGioiTinh();
        String soCMNd=HamNhapDuLieu.nhapSoCMND();
        String soDT=HamNhapDuLieu.nhapSDT();
        String email=HamNhapDuLieu.nhapEmail();
        String loaiKhachHang=HamNhapDuLieu.nhapLoaiKhach();
        String diaChi=HamNhapDuLieu.nhapDiaChi();
        List<KhachHang> khachHangList=new ArrayList<>();
        khachHangList.add(new KhachHang(hoTen,ngaySinh,gioiTinh,soCMNd,soDT,email,loaiKhachHang,diaChi));
        DocGhiFile.ghiFileKhachHang(khachHangList,true);
    }
    public static void showKhachHang(){
        List<KhachHang> khachHangList=DocGhiFile.docFileKhachHang();
        for (int i = 0; i < khachHangList.size(); i++) {
            System.out.println(khachHangList.get(i).showInfor());
        }

    }
    public static void showInformationCustomer(){
        List<KhachHang> khachHangList=DocGhiFile.docFileKhachHang();
        khachHangList.sort(Comparator.comparing(KhachHang::getHoTen).thenComparing(KhachHang::getNgaySinh));
        for (int i = 0; i < khachHangList.size(); i++) {
            System.out.print((i+1)+" .");
            System.out.println(khachHangList.get(i).showInfor());
        }
    }
    public static void dacichVu(){
        List<KhachHang> khachHangList=DocGhiFile.docFileKhachHang();
        khachHangList.sort(Comparator.comparing(KhachHang::getHoTen).thenComparing(KhachHang::getNgaySinh));
        for (int i = 0; i < khachHangList.size(); i++) {
            System.out.print((i+1)+" .");
            System.out.println(khachHangList.get(i).showInfor());
        }

    }
}
