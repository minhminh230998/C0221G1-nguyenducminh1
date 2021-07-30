package bien_kiem_soat_xe.models;

public class XeMay extends PhuongTienGiaoThong{
    private String congXuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public String getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(String congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + congXuat ;
    }

    @Override
    public String showInfor() {
        return "PhuongTienGiaoThong{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat='" + getNamSanXuat() + '\'' +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", congXuat='" + congXuat + '\'' +
                '}';
    }
}
