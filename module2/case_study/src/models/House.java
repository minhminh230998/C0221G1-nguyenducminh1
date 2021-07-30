package models;

public class House extends DichVu {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private String soTang;

    public House() {
    }

    public House(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String dichVuKemTheo, String tieuChuanPhong, String moTaTienNghi, String soTang) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuKemTheo);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;

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
                ", soTang='" + soTang + '\'' +
                '}';
    }
}
