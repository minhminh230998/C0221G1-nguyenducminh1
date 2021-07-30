package bien_kiem_soat_xe.controller;

import bien_kiem_soat_xe.commons.DocGhiFile;
import bien_kiem_soat_xe.commons.ExceptionPhuongTien;
import bien_kiem_soat_xe.models.Oto;
import bien_kiem_soat_xe.models.PhuongTienGiaoThong;
import bien_kiem_soat_xe.models.XeMay;
import bien_kiem_soat_xe.models.XeTai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner sc = new Scanner(System.in);

    public static void menuThemMoiPhuongTien() {
        while (true) {
            System.out.println("1. Thêm mới xe tải.\n" +
                    "2. Thêm mới xe oto\n" +
                    "3. Thêm mới xe máy\n" +
                    "4. Quay về menu quản lí\n");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    themXeTai();
                    break;
                case "2":
                    themOto();
                    break;
                case "3":
                    themXeMay();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Không đúng định dạng, mời bạn nhập lại!!");
            }
        }
    }

    public static void themOto() {
        //bienKiemSoat, String tenHangSanXuat, String namSanXuat,
        // String chuSoHuu, String soChoNgoi, String kieuXe
        String bienKS = QuanLyNhapDuLieu.nhapBienKiemSoatOto();
        String hangSx = QuanLyNhapDuLieu.nhapHangSanXuat();
        String namSX = QuanLyNhapDuLieu.nhapNamSanXuat();
        String chuSH = QuanLyNhapDuLieu.nhapChuSoHuu();
        String soChoNgoi = QuanLyNhapDuLieu.nhapSOChoNgoi();
        String kieuXe = null;
        if (bienKS.contains("A")) {
            kieuXe = "Du Lịch";
        } else if (bienKS.contains("B")) {
            kieuXe = "Xe Khách";
        }

        List<PhuongTienGiaoThong> phuongTienGiaoThongList = new ArrayList<>();
        PhuongTienGiaoThong oto = new Oto(bienKS, hangSx, namSX, chuSH, soChoNgoi, kieuXe);
        phuongTienGiaoThongList.add(oto);
        DocGhiFile.ghiFilePhuongTien(phuongTienGiaoThongList, true);

    }

    public static void themXeMay() {
        String bienKS = QuanLyNhapDuLieu.nhapBienKiemSoatXeMay();
        String hangSx = QuanLyNhapDuLieu.nhapHangSanXuat();
        String namSX = QuanLyNhapDuLieu.nhapNamSanXuat();
        String chuSH = QuanLyNhapDuLieu.nhapChuSoHuu();
        String congSuat = QuanLyNhapDuLieu.nhapCongSuat();

        List<PhuongTienGiaoThong> phuongTienGiaoThongList = new ArrayList<>();
        PhuongTienGiaoThong xeMay = new XeMay(bienKS, hangSx, namSX, chuSH, congSuat);
        phuongTienGiaoThongList.add(xeMay);
        DocGhiFile.ghiFilePhuongTien(phuongTienGiaoThongList, true);
    }

    public static void themXeTai() {
        String bienKS = QuanLyNhapDuLieu.nhapBienKiemSoatXeTai();
        String hangSx = QuanLyNhapDuLieu.nhapHangSanXuat();
        String namSX = QuanLyNhapDuLieu.nhapNamSanXuat();
        String chuSH = QuanLyNhapDuLieu.nhapChuSoHuu();
        String taiTrong = QuanLyNhapDuLieu.nhapTrongTai();

        List<PhuongTienGiaoThong> phuongTienGiaoThongList = new ArrayList<>();
        PhuongTienGiaoThong xeTai = new XeTai(bienKS, hangSx, namSX, chuSH, taiTrong);
        phuongTienGiaoThongList.add(xeTai);
        DocGhiFile.ghiFilePhuongTien(phuongTienGiaoThongList, true);
    }

    public static void menuHienThiPhuongTien() {
        while (true) {
            System.out.println("1. Hiển thị xe tải.\n" +
                    "2. Hiển thị xe oto\n" +
                    "3. Hiển thị xe máy\n" +
                    "4. Quay về menu quản lí\n");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    hienThiXeTai();
                    break;
                case "2":
                    hienThiOto();
                    break;
                case "3":
                    hienThiXeMay();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Không đúng định dạng, mời bạn nhập lại!!");
            }
        }
    }

    public static void hienThiOto() {
        List<PhuongTienGiaoThong> phuongTienGiaoThongList = DocGhiFile.docFilePhuongTien();
        for (int i = 0; i <phuongTienGiaoThongList.size() ; i++) {
            if(phuongTienGiaoThongList.get(i) instanceof Oto){
                System.out.println(phuongTienGiaoThongList.get(i));
            }
        }
    }

    public static void hienThiXeMay() {
        List<PhuongTienGiaoThong> phuongTienGiaoThongList = DocGhiFile.docFilePhuongTien();
        for (int i = 0; i <phuongTienGiaoThongList.size() ; i++) {
            if(phuongTienGiaoThongList.get(i) instanceof XeMay){
                System.out.println(phuongTienGiaoThongList.get(i));
            }
        }
    }

    public static void hienThiXeTai() {
        List<PhuongTienGiaoThong> phuongTienGiaoThongList = DocGhiFile.docFilePhuongTien();
        for (int i = 0; i <phuongTienGiaoThongList.size() ; i++) {
            if(phuongTienGiaoThongList.get(i) instanceof XeTai){
                System.out.println(phuongTienGiaoThongList.get(i));
            }
        }
    }

    public static void menuXoaPhuongTien() {
        boolean kiemTra = false;
        String chon = null;
        String bienKS = null;
        while (true){
            System.out.println("nhap bien kiem soat can xoa");
            bienKS = sc.nextLine();
            List<PhuongTienGiaoThong> phuongTienGiaoThongList = DocGhiFile.docFilePhuongTien();
            for (PhuongTienGiaoThong phuongTienGiaoThong : phuongTienGiaoThongList) {
                if (phuongTienGiaoThong.getBienKiemSoat().equals(bienKS)) {

                    System.out.println("1.Co\n" +
                            "2.Khong");
                    System.out.println(" chon ");
                    chon = sc.nextLine();
                    switch (chon) {
                        case "1":
                            phuongTienGiaoThongList.remove(phuongTienGiaoThong);
                            DocGhiFile.ghiFilePhuongTien(phuongTienGiaoThongList, false);
                            System.out.println("da xoa thanh cong");
                            kiemTra = true;

                        case "2":
                            return;
                        default:
                            System.out.println("chon 1 hoac 2");
                            break;
                    }


                }
            }
            if(kiemTra){
                break;
            }
        }
    }
}