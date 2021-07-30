package quan_li_danh_ba.controller;

import java.util.Scanner;

public class DanhMuc {
    static Scanner sc = new Scanner(System.in);

    public static void menuQuanLi() {
        while (true) {
            System.out.println("Chọn chức năng");
            System.out.println("1. Xem Danh Sách \n" +
                    "2. Thêm Mới \n" +
                    "3. Cập Nhật\n" +
                    "4. Xóa\n" +
                    "5. Tìm Kiếm\n" +
                    "6. Đọc Từ File\n" +
                    "7. Ghi vào File\n" +
                    "8. Thoát\n");
            System.out.print("Bạn muốn chọn chức năng");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    QuanLiChucNang.hienThiDanhBa();
                    break;
                case "2":
                    QuanLiChucNang.themDanhBa();
                    break;
                case "3":
                    QuanLiChucNang.suaDanhBa();
                    break;
                case "4":
                    QuanLiChucNang.xoaDanhBa();
                    break;
                case "5":
                    QuanLiChucNang.timKiemDanhBa();
                    break;
                case "6":
                    QuanLiChucNang.docDanhBa();
                    break;
                case "7":
                    QuanLiChucNang.ghiFileDanhBa();
                    break;
                case "8":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không đúng định dạng, mời bạn nhập lại!!");
            }
        }
    }

}
