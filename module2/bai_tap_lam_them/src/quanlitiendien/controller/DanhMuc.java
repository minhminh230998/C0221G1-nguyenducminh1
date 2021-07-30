package quanlitiendien.controller;

import java.util.Scanner;

public class DanhMuc {
    static Scanner scanner=new Scanner(System.in);
    public static void menuChinh() {
        while (true) {
            System.out.println("1. Thêm mới khách hàng.\n" +
                    "2. Hiện thị thông tin khách hàng\n" +
                    "3. Tìm kiếm khách hàng\n" +
                    "4. Thêm mới hóa đơn\n" +
                    "5. Hiện thị thông  tin chi tiết hóa đơn\n" +
                    "6. Chỉnh sửa hóa đơn\n" +
                    "7. Thoát\n");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    QuanLiChucNang.menuThemKhachHang();
                    break;
                case "2":
                    QuanLiChucNang.menuHienThiKhachHang();
                    break;
                case "3":
                    QuanLiChucNang.timKiemKhachhang();
                    break;
                case "4":
                    QuanLiChucNang.themHoaDon();
                    break;
                case "5":
                    QuanLiChucNang.hienThiHoaDon();
                    break;
                case "6":
                    QuanLiChucNang.chinhSuaHoaDon();
                    break;
                case "7":
                    System.exit(0);
            }

        }
    }
}
