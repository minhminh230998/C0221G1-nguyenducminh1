package bien_kiem_soat_xe.models;

import java.util.regex.Pattern;

public class XeTai extends PhuongTienGiaoThong {
    private String trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + trongTai;
    }

    @Override
    public String showInfor() {
        return  "xeTai{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat='" + getNamSanXuat() + '\'' +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", trongTai='" + trongTai + '\'' +
                '}';
    }
}
