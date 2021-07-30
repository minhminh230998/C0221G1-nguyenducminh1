package quan_li_thu_vien.models;

public class Bao extends QuanLiTaiLieu {
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String tenNhaSanXuat, String soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {

        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + ngayPhatHanh;
    }

    @Override
    public String showInfor() {
        return "bao{" +
                "maTaiLieu='" + getMaTaiLieu() + '\'' +
                ", tenNhaSanXuat='" + getTenNhaSanXuat() + '\'' +
                ", soBanPhatHanh='" + getSoBanPhatHanh() + '\'' +
                "ngayPhatHanh='" + ngayPhatHanh+ '\'' +
                '}';
    }
}
