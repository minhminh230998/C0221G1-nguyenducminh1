package models;

public class HeThongQuanLi {
    private String hoTen;
    private String ngaySinh;
    private String soCMND;
    private String soDT;
    private String email;
    private String trinhDo;
    private String viTri;
    private String luong;
    private String boPhanLamViec;

    public HeThongQuanLi() {
    }

    public HeThongQuanLi(String hoTen, String ngaySinh, String soCMND, String soDT, String email, String trinhDo, String viTri, String luong, String boPhanLamViec) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
        this.boPhanLamViec=boPhanLamViec;
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

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    @Override
    public String toString() {
        return
                 hoTen + '\'' +
                "," + ngaySinh +
                "," + soCMND +
                "," + soDT +
                "," + email +
                "," + trinhDo +
                "," + viTri +
                "," + luong +
                "," + boPhanLamViec;
    }
}
