package models;

public class Room extends DichVu {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String dichVuKemTheo, String dichVuMienPhiDiKem) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuKemTheo);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }
    @Override
    public String toString() {
        return super.toString()+
                "," + dichVuMienPhiDiKem ;

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
                "tieuChuanPhong='" + dichVuMienPhiDiKem + '\'' +
                '}';
    }
}
