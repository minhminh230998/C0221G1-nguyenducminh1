package quan_li_danh_ba.commons;

import java.util.regex.Pattern;

public class Exception implements Regex {
    public static boolean soDienThoai(String soDienThoai) {
        if (Pattern.matches(SO_DIEN_THOAI, soDienThoai)) {
            return true;
        }
        return false;
    }
    public static boolean nhom(String nhom) {
        if (Pattern.matches(NHOM, nhom)) {
            return true;
        }
        return false;
    }
    public static boolean hoTen(String hoTen) {
        if (Pattern.matches(HO_TEN, hoTen)) {
            return true;
        }
        return false;
    }
    public static boolean gioiTinh(String gioiTinh) {
        if (Pattern.matches(GIOI_TINH, gioiTinh)) {
            return true;
        }
        return false;
    }
    public static boolean diaChi(String diaChi) {
        if (Pattern.matches(DIA_CHI, diaChi)) {
            return true;
        }
        return false;
    }
    public static boolean ngaySinh(String ngaySinh) {
        if (Pattern.matches(NGAY_SINH, ngaySinh)) {
            return true;
        }
        return false;
    }
    public static boolean email(String email) {
        if (Pattern.matches(EMAIL, email)) {
            return true;
        }
        return false;
    }

}
