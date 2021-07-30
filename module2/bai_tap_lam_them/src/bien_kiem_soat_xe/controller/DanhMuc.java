package bien_kiem_soat_xe.controller;

import java.util.Scanner;

public class DanhMuc {
    static Scanner sc = new Scanner(System.in);

    public static void menuQuanLiPhuongTien() {
        while (true) {
            System.out.println("1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    QuanLyChucNang.menuThemMoiPhuongTien();
                    break;
                case "2":
                    QuanLyChucNang.menuHienThiPhuongTien();
                    break;
                case "3":
                    QuanLyChucNang.menuXoaPhuongTien();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không đúng định dạng, mời bạn nhập lại!!");
            }
        }
    }






}
