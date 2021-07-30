package quan_li_thu_vien.models;

import jdk.nashorn.internal.runtime.regexp.joni.ast.QuantifierNode;

public class TapChi extends QuanLiTaiLieu {
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String tenNhaSanXuat, String soBanPhatHanh, String soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + soPhatHanh +
                "," + thangPhatHanh;
    }

    @Override
    public String showInfor() {
        return "tapChi{" +
                "maTaiLieu='" + getMaTaiLieu() + '\'' +
                ", tenNhaSanXuat='" + getTenNhaSanXuat() + '\'' +
                ", soBanPhatHanh='" + getSoBanPhatHanh() + '\'' +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                '}';
    }

}
