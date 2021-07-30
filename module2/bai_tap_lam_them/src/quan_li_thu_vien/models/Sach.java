package quan_li_thu_vien.models;

public class Sach extends QuanLiTaiLieu {
    private String tenTacGia;
    private String soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String tenNhaSanXuat, String soBanPhatHanh, String tenTacGia, String soTrang) {
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang=soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + tenTacGia+
                ","+soTrang;
    }

    @Override
    public String showInfor() {
        return "Sách{" +
                "maTaiLieu='" + getMaTaiLieu() + '\'' +
                ", tenNhaSanXuat='" + getTenNhaSanXuat() + '\'' +
                ", soBanPhatHanh='" + getSoBanPhatHanh() + '\'' +
                "tenTacGia='" + tenTacGia + '\'' +
                "soTrang='"+soTrang+ '\'' +
                '}';
    }
}
