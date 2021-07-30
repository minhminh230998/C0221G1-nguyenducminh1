package quan_li_thu_vien.models;

public abstract class QuanLiTaiLieu {
    private String maTaiLieu;
    private String tenNhaSanXuat;
    private String soBanPhatHanh;

    public QuanLiTaiLieu() {
    }

    public QuanLiTaiLieu(String maTaiLieu, String tenNhaSanXuat, String soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return
                 maTaiLieu +
                "," + tenNhaSanXuat +
                "," + soBanPhatHanh;
    }

    public abstract String showInfor();
}
