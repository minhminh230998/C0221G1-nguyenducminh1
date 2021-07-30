package quan_li_danh_ba.models;

public class DanhBa {
    private String hoTen;
    private String soDienThoai;
    private String diaChi;
    private String email;
    private String nhom;
    private String gioiTinh;
    private String ngaySinh;


    public DanhBa() {
    }

    public DanhBa(String soDienThoai, String nhom, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        this.nhom = nhom;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String showInfor() {
        return "DanhBa{" +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", nhom='" + nhom + '\'' +
                "hoTen='" + hoTen + '\'' +
                ", gioTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return
                soDienThoai +
                        "," + nhom +
                        "," + hoTen +
                        "," + gioiTinh +
                        "," + diaChi +
                        "," + ngaySinh +
                        "," + email;
    }
}
