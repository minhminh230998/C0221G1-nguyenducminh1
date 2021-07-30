package bien_kiem_soat_xe.commons;

import java.util.regex.Pattern;

public class ExceptionPhuongTien implements Regex {
    public static boolean bienSoXeMay(String bienSoXeMay) {
        if (Pattern.matches(BIEN_SO_XE_MAY, bienSoXeMay)) {
            return true;
        }
        return false;
    }

    public static boolean bienSoXeOto(String bienSoXeOto) {
        if (Pattern.matches(BIEN_SO_XE_OTO, bienSoXeOto)) {
            return true;
        }
        return false;
    }

    public static boolean bienSoXeTai(String bienSoXeTai) {
        if (Pattern.matches(BIEN_SO_XE_TAI, bienSoXeTai)) {
            return true;
        }
        return false;
    }

    public static boolean namSanXuat(String namSanXuat) {
        if (Pattern.matches(NAM_SAN_XUAT, namSanXuat)) {
            return true;
        }
        return false;
    }

    public static boolean chuSoHuu(String chuSoHuu) {
        if (Pattern.matches(CHU_SO_HUU, chuSoHuu)) {
            return true;
        }
        return false;
    }

    public static boolean kieuXe(String kieuXe) {
        if (Pattern.matches(KIEU_XE, kieuXe)) {
            return true;
        }
        return false;
    }

    public static boolean soChoNgoi(String soChoNgoi) {
        if (Pattern.matches(SO_CHO_NGOI, soChoNgoi)) {
            return true;
        }
        return false;
    }

    public static boolean taiTrong(String taiTrong) {
        if (Pattern.matches(TAI_TRONG, taiTrong)) {
            return true;
        }
        return false;
    }

    public static boolean congXuat(String congXuat) {
        if (Pattern.matches(CONG_XUAT, congXuat)) {
            return true;
        }
        return false;
    }
}
