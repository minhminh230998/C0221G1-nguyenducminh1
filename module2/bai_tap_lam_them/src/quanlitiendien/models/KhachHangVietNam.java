package quanlitiendien.models;

public class KhachHangVietNam extends KhachHang {
    private String loaiKhachHang;
    private String dinhMucTieuThu;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String maKhachHang, String hoTen, String loaiKhachHang, String dinhMucTieuThu) {
        super(maKhachHang, hoTen);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(String dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + loaiKhachHang +
                "," + dinhMucTieuThu ;
    }

    @Override
    public String showInfor() {
        return "KhachHangVietNam{" +
                "maKhachHang='" + getMaKhachHang()+ '\'' +
                ", hoTen='" + getHoTen() + '\'' +
                "loaiKhachHang='" + loaiKhachHang + '\'' +
                ", dinhMucTieuThu='" + dinhMucTieuThu + '\'' +
                '}';
    }
}
