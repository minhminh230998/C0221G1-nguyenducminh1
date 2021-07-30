package bien_kiem_soat_xe.controller;

import bien_kiem_soat_xe.commons.DocGhiFile;
import bien_kiem_soat_xe.commons.ExceptionPhuongTien;

import java.util.List;
import java.util.Scanner;

public class QuanLyNhapDuLieu {
    static Scanner sc = new Scanner(System.in);

    public static String nhapBienKiemSoatOto() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        while (!ExceptionPhuongTien.bienSoXeOto(bienKiemSoat)) {
            System.out.println("Chưa đúng định dạng");
            bienKiemSoat = sc.nextLine();
        }
        return  bienKiemSoat;
    }
    public static String nhapBienKiemSoatXeMay() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        while (!ExceptionPhuongTien.bienSoXeMay(bienKiemSoat)) {
            System.out.println("Chưa đúng định dạng");
            bienKiemSoat = sc.nextLine();
        }
        return  bienKiemSoat;
    }
    public static String nhapBienKiemSoatXeTai() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        while (!ExceptionPhuongTien.bienSoXeTai(bienKiemSoat)) {
            System.out.println("Chưa đúng định dạng");
            bienKiemSoat = sc.nextLine();
        }
        return  bienKiemSoat;
    }
    public static String nhapHangSanXuat(){
        boolean kiemTra = false;
        String hangSX = null;
        String chon = null;
        while (true){
            List<String> stringList = DocGhiFile.docFileHangSanXuat();
            for (int i =0 ;i<stringList.size();i++){
                System.out.println((i+1)+" : "+stringList.get(i));
            }
            System.out.println("chọn theo danh sách");
            chon=sc.nextLine();
            for (int i =0;i<stringList.size();i++){
                if (i == Integer.parseInt(chon)-1){
                    hangSX = stringList.get(i).split(",")[1];
                    kiemTra = true;
                    break;
                }
            }
            if (kiemTra){
                break;
            }else {
                System.out.println("vui long theo danh sach");
            }
        }
        return hangSX;
    }
    public static String nhapNamSanXuat(){
        System.out.println("Nhập năm sản xuất");
        String namSanXuat = sc.nextLine();
        while (!ExceptionPhuongTien.namSanXuat(namSanXuat)) {
            System.out.println("Chưa đúng định dạng");
            namSanXuat =sc.nextLine();
        }
        return namSanXuat;
    }
    public static String nhapChuSoHuu(){
        System.out.println("Nhập chủ sở hữu");
        String chuSoHuu= sc.nextLine();
        while (!ExceptionPhuongTien.chuSoHuu(chuSoHuu)) {
            System.out.println("Chưa đúng định dạng");
            chuSoHuu=sc.nextLine();
        }
        return chuSoHuu;
    }
    public static String nhapSOChoNgoi(){
        System.out.println("Nhập số chổ ngồi");
        String soChoNgoi= sc.nextLine();
        while (!ExceptionPhuongTien.soChoNgoi(soChoNgoi)) {
            System.out.println("Chưa đúng định dạng");
            soChoNgoi =sc.nextLine();
        }
        return soChoNgoi;
    }
    public static String nhapCongSuat(){
        System.out.println("Nhập công xuất");
        String congXuat= sc.nextLine();
        while (!ExceptionPhuongTien.congXuat(congXuat)) {
            System.out.println("Chưa đúng định dạng");
            congXuat =sc.nextLine();
        }
        return congXuat;
    }
    public static String nhapTrongTai(){
        System.out.println("Nhập tải trọng");
        String taiTrong= sc.nextLine();
        while (!ExceptionPhuongTien.taiTrong(taiTrong)) {
            System.out.println("Chưa đúng định dạng");
            taiTrong =sc.nextLine();
        }
        return taiTrong;
    }

}