package quan_li_danh_ba.controller;

import quan_li_danh_ba.commons.DocGhiFile;
import quan_li_danh_ba.commons.Exception;
import quan_li_danh_ba.commons.Regex;
import quan_li_danh_ba.models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiChucNang implements Regex {
    static List<DanhBa> danhBaList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void themDanhBa() {

        System.out.println("Nhập số điện thoại");
        String soDienThoai = scanner.nextLine();
        while (!Exception.soDienThoai(soDienThoai)) {
            System.out.println("Chưa đúng định dạng");
            soDienThoai = scanner.nextLine();

        }
        System.out.println("Nhập nhóm danh bạ");
        String nhomDanhBa = scanner.nextLine();
        while (!Exception.nhom(nhomDanhBa)) {
            System.out.println("Chưa đúng định dạng");
            nhomDanhBa = scanner.nextLine();
        }
        System.out.println("Nhập họ và tên");
        String hoTen = scanner.nextLine();
        while (!Exception.hoTen(hoTen)) {
            System.out.println("Chưa đúng định dạng");
            hoTen = scanner.nextLine();
        }
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        while (!Exception.gioiTinh(gioiTinh)) {
            System.out.println("Chưa đúng định dạng");
            gioiTinh = scanner.nextLine();
        }
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        while (!Exception.diaChi(diaChi)) {
            System.out.println("Chưa đúng định dạng");
            diaChi = scanner.nextLine();
        }
        System.out.println("Nhập ngày tháng năm sinh");
        String ngaySinh = scanner.nextLine();
        while (!Exception.ngaySinh(ngaySinh)) {
            System.out.println("Chưa đúng định dạng");
            ngaySinh = scanner.nextLine();
        }
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        while (!Exception.email(email)) {
            System.out.println("Chưa đúng định dạng");
            email = scanner.nextLine();
        }
        danhBaList.add(new DanhBa(soDienThoai, nhomDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email));
        DocGhiFile.ghiFile(danhBaList, true);
    }

    public static void hienThiDanhBa() {
        danhBaList = DocGhiFile.docFile();
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i) instanceof DanhBa) {
                System.out.println(danhBaList.get(i).showInfor());
            }

        }
    }

    public static void timKiemDanhBa() {
        boolean check = false;
        System.out.println("Mời bạn nhập số điện thoại cần tìm kiếm");
        String input = scanner.nextLine();
        danhBaList = DocGhiFile.docFile();
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai().contains(input)) {
                System.out.println(danhBaList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy số điện thoại");
        }
    }

    public static void suaDanhBa() {
        boolean check = false;

        System.out.println("Mời bạn nhập số điện thoại cần sửa");
        String input = scanner.nextLine();
        danhBaList = DocGhiFile.docFile();
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai().equals(input)) {
                System.out.println("Nhập nhóm danh bạ");
                String nhomDanhBa = scanner.nextLine();
                while (!Exception.nhom(nhomDanhBa)) {
                    System.out.println("Chưa đúng định dạng");
                    nhomDanhBa = scanner.nextLine();
                }
                danhBaList.get(i).setNhom(nhomDanhBa);
                System.out.println("Nhập họ và tên");
                String hoTen = scanner.nextLine();
                while (!Exception.hoTen(hoTen)) {
                    System.out.println("Chưa đúng định dạng");
                    hoTen = scanner.nextLine();
                }
                danhBaList.get(i).setHoTen(hoTen);
                System.out.println("Nhập giới tính");
                String gioiTinh = scanner.nextLine();
                while (!Exception.gioiTinh(gioiTinh)) {
                    System.out.println("Chưa đúng định dạng");
                    gioiTinh = scanner.nextLine();
                }
                danhBaList.get(i).setGioiTinh(gioiTinh);
                System.out.println("Nhập địa chỉ");
                String diaChi = scanner.nextLine();
                while (!Exception.diaChi(diaChi)) {
                    System.out.println("Chưa đúng định dạng");
                    diaChi = scanner.nextLine();
                }
                System.out.println("Nhập ngày tháng năm sinh");
                String ngaySinh = scanner.nextLine();
                while (!Exception.ngaySinh(ngaySinh)) {
                    System.out.println("Chưa đúng định dạng");
                    ngaySinh = scanner.nextLine();
                }
                danhBaList.get(i).setNhom(ngaySinh);
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                while (!Exception.email(email)) {
                    System.out.println("Chưa đúng định dạng");
                    email = scanner.nextLine();
                }
                danhBaList.get(i).setEmail(email);
                check = true;
            }
        }
        DocGhiFile.ghiFile(danhBaList, false);
        if (!check) {
            System.out.println("không tìm thấy số điện thoại");
        }

    }


    public static void xoaDanhBa() {
        boolean kiemTra = false;
        String chon = null;
        String soDienThoai = null;
            System.out.println("Nhập số điện thoại cần xóa");
            soDienThoai = scanner.nextLine();
            danhBaList = DocGhiFile.docFile();
            for (DanhBa danhBa : danhBaList) {
                if (danhBa.getSoDienThoai().equals(soDienThoai)) {

                    System.out.println("1.Co\n" +
                            "2.Khong");
                    System.out.println(" chon ");
                    chon = scanner.nextLine();
                    switch (chon) {
                        case "1":
                            danhBaList.remove(danhBa);
                            DocGhiFile.ghiFile(danhBaList, false);
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
            if (!kiemTra) {
                System.out.println("Không tìm thấy");
            }

    }

    public static void docDanhBa() {

        String chon = null;
        String soDienThoai = null;
        while (true) {
            danhBaList = DocGhiFile.docFile();
            for (DanhBa danhBa : danhBaList) {
                System.out.println("1.Co\n" +
                        "2.Khong");
                System.out.println(" chon ");
                chon = scanner.nextLine();
                switch (chon) {
                    case "1":
                        danhBaList.remove(danhBa);
                        DocGhiFile.ghiFile(danhBaList, false);
                        System.out.println("đã cập nhật thành công");

                    case "2":
                        return;
                    default:
                        System.out.println("chon 1 hoac 2");
                        break;
                }
            }


        }
    }

    public static void ghiFileDanhBa() {
        DocGhiFile.ghiFile(danhBaList, true);
    }
}
