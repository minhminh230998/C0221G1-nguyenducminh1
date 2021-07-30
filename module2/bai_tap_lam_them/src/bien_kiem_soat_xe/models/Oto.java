package bien_kiem_soat_xe.models;

public class Oto extends PhuongTienGiaoThong {
    private String soChoNgoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                soChoNgoi +
                ",'" + kieuXe;
    }

    @Override
    public String showInfor() {
        return "Oto{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat='" + getNamSanXuat() + '\'' +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", soChoNgoi='" + soChoNgoi + '\'' +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }

}
