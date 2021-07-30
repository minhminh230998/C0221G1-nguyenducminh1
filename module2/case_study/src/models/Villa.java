package models;

public class Villa extends DichVu{
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String dichVuKemTheo, String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, String soTang) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuKemTheo);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + tieuChuanPhong +
                "," + moTaTienNghi +
                "," + dienTichHoBoi +
                "," + soTang;
    }

    @Override
    public String showInfor() {
       return  "DichVu{" +
                "id='" + getId() + '\'' +
                ", tenDichVu='" + getTenDichVu() + '\'' +
              ", dienTichSuDung='" + getDienTichSuDung() + '\'' +
                ", chiPhiThue='" + getChiPhiThue() + '\'' +
                ", soLuongNguoiToiDa='" + getSoLuongNguoiToiDa() + '\'' +
                ", kieuThue='" + getKieuThue() + '\'' +
                ", dichVuKemTheo='" + getDichVuKemTheo() + '\'' +
               "tieuChuanPhong='" + tieuChuanPhong + '\'' +
               ", moTaTienNghi='" + moTaTienNghi + '\'' +
               ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
               ", soTang='" + soTang + '\'' +
                '}';
    }


}
