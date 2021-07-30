package bien_kiem_soat_xe.commons;

public interface Regex {
    String XE_TAI_TEXT="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\bien_kiem_soat_xe\\data\\xeTai.csv";
    String XE_OTO_TEXT="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\bien_kiem_soat_xe\\data\\oto.csv";
    String XE_MAY_TEXT="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\bien_kiem_soat_xe\\data\\xeMay.csv";
    String BIEN_SO_XE_MAY="^[0-9]{2}\\-[A-Z][A-Z0-9]\\-[0-9]{3}\\.[0-9]{2}";
    String BIEN_SO_XE_OTO="^[0-9]{2}[AB]{1}\\-[0-9]{3}\\.[0-9]{2}";
    String BIEN_SO_XE_TAI="^[0-9]{2}C\\-[0-9]{2}\\.[0-9]{3}";
    String NAM_SAN_XUAT="^[0-9]{4}$";
    String CHU_SO_HUU="^[A-Z]{1}[a-z]{1,}$";
    String TAI_TRONG="^[0-9]{1,2}$";
    String KIEU_XE="^[A-Z]{1}[a-z]{1,}$";
    String SO_CHO_NGOI="[0-9]{1,2}";
    String CONG_XUAT="[0-9]{2,3}";
    String HANG_SAN_XUAT="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\bien_kiem_soat_xe\\data\\hangSanXuat.csv";
}
