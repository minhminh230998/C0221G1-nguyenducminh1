package models;

public class KhachHang {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String soDienThoai;
    private String email;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String email, String diaChi, String s) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public String showInfor() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return
                hoTen + '\'' +
                "," + ngaySinh +
                "," + gioiTinh +
                "," + soCMND +
                "," + soDienThoai +
                "," + email +
                "," + diaChi;
    }
}
