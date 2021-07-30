package thuchanh;

public class SinhVien {
    private int stt;
    private String name;
    private static String center = "AYE";

    static void center() {
        center = "CODEGYM";
    }


    public SinhVien(int stt, String name) {
        this.stt = stt;
        this.name = name;
    }

    public int getStt() {
        return stt;
    }

    public String getName() {
        return name;
    }

    public static String getCenter() {
        return center;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCenter(String center) {
        SinhVien.center = center;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "stt=" + stt +
                ", name='" + name + '\'' +
                ", center=" + center +
                '}';
    }

    public static void main(String[] args) {
        SinhVien.center();
        SinhVien sinhVien1 = new SinhVien(111, "minh");
        System.out.println(sinhVien1.toString());


    }
}
