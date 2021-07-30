package controller;

import common.Regex;
import models.DichVu;
import models.Villa;

import java.util.List;
import java.util.regex.Pattern;

public class Exception implements Regex {
    public static boolean exceptionMaDichVuVilla(String maDichVu){
        if(Pattern.matches(MA_DICH_VU_VILLA,maDichVu)){
            return true;
        }
        return false;
    }
    public static boolean exceptionMaDichVuHouse(String maDichVu){
        if(Pattern.matches(MA_DICH_VU_HOUSE,maDichVu)){
            return true;
        }
        return false;
    }
    public static boolean exceptionMaDichVuRoom(String maDichVu){
        if(Pattern.matches(MA_DICH_VU_ROOM,maDichVu)){
            return true;
        }
        return false;
    }
    public static boolean exception(String maDichVu){
        if(Pattern.matches(MA_DICH_VU_HOUSE,maDichVu)){
            return true;
        }
        return false;
    }
    public static boolean tenDichVu(String tenDichVu){
        if(Pattern.matches(TEN_DICH_VU,tenDichVu)){
            return true;
        }
        return false;
    }
    public static boolean dienTichSuDung(String dienTichSuDung){
        if(Pattern.matches(DIEN_TICH_SU_DUNG,dienTichSuDung)){
            return true;
        }
        return false;
    }
    public static boolean chiPhiThue(String chiPhiThue){
        if(Pattern.matches(CHI_PHI_THUE,chiPhiThue)){
            return true;
        }
        return false;
    }
    public static boolean soLuongNguoiToiDa(String soLuongNguoiToida){
        if(Pattern.matches(SO_NGUOI_TOI_DA,soLuongNguoiToida)){
            return true;
        }
        return false;
    }
    public static boolean kieuThue(String kieuThue){
        if(Pattern.matches(KIEU_THUE,kieuThue)){
            return true;
        }
        return false;
    }
    public static boolean tieuChuanPhong(String tieuChuanPhong){
        if(Pattern.matches(TIEU_CHUAN_PHONG,tieuChuanPhong)){
            return true;
        }
        return false;
    }
    public static boolean tienNghiKhac(String tienNghiKhac){
        if(Pattern.matches(TIEN_NGHI,tienNghiKhac)){
            return true;
        }
        return false;
    }
    public static boolean dienTichHoBoi(String dienTichHoBoi){
        if(Pattern.matches(DIEN_TICH_HO_BOI,dienTichHoBoi)){
            return true;
        }
        return false;
    }
    public static boolean soTang(String soTang){
        if(Pattern.matches(SO_TANG,soTang)){
            return true;

        }
        return false;
    }
    public static boolean dichVuMienPhiDiKem(String dichVuMienPhiDiKem){
        if(Pattern.matches(DICH_VU_FREE_DI_KEM,dichVuMienPhiDiKem)){
            return true;
        }
        return false;
    }
    public static boolean dichVuDiKem(String dichVuDiKem){
        if(Pattern.matches(DICH_VU_DI_KEM,dichVuDiKem)){
            return true;
        }
        return false;
    }

}
