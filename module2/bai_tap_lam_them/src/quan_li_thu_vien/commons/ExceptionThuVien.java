package quan_li_thu_vien.commons;

import java.util.regex.Pattern;

public class ExceptionThuVien  implements Regex{
    public static boolean exMaTaiLieuSach(String mtl) {
        if (Pattern.matches(MA_TAI_LIEU_SACH, mtl)) {
            return true;
        }
        return false;
    }
    public static boolean exMaTaiLieuTapChi(String mtl){
        if(Pattern.matches(MA_TAI_LIEU_TAP_CHI,mtl)){
            return true;
        }
        return false;
    }
    public static boolean exMaTaiLieuBao(String mtl){
        if(Pattern.matches(MA_TAI_LIEU_BAO,mtl)){
            return true;
        }
        return false;
    }
    public static boolean exTenNhaXuatBan(String tnxb){
        if (Pattern.matches(TEN_NHA_SAN_XUAT, tnxb)) {
            return true;
        }
        return false;
    }
    public static boolean exSoBanPhatHanh(String bph){
        if (Pattern.matches(SO_BAN_PHAT_HANH, bph)) {
            return true;
        }
        return false;
    }
    public static boolean exTenTacGia(String ttg){
        if(Pattern.matches(TEN_TAC_GIA,ttg)){
            return true;
        }
        return false;
    }
    public static boolean exSoTrang(String st){
        if(Pattern.matches(SO_TRANG,st)){
            return true;
        }
        return false;
    }
    public static boolean exSoPhatHanh(String sph){
        if(Pattern.matches(SO_PHAT_HANH,sph)){
            return true;
        }
        return false;
    }
    public static boolean exThangPhatHanh(String tph){
        if(Pattern.matches(THANG_PHAT_HANH,tph)){
            return true;
        }
        return false;
    }
    public static boolean exNgayPhatHanh(String nph){
        if(Pattern.matches(NGAY_PHAT_HANH,nph)){
            return true;
        }
        return false;
    }
}
