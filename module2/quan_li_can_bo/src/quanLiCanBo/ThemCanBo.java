package quanLiCanBo;

import object.CanBo;
import object.CongNhan;
import object.KySu;
import object.NhanVien;
import org.omg.PortableInterceptor.HOLDING;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ThemCanBo implements Regex {
    public static void themCongNhan() {
        List<CongNhan> congNhanList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        String hoTen = sc.nextLine();
        while (!Pattern.matches(HO_TEN, hoTen)) {
            System.out.println("Vui lòng nhập đúng họ tên");
            hoTen = sc.nextLine();
        }

        System.out.println("Nhập năm Sinh");
        String namSinh = sc.nextLine();
        while (!Pattern.matches(NAM_SINH, namSinh)) {
            System.out.println("Vui lòng nhập đúng năm sinh");
            namSinh = sc.nextLine();
        }

        System.out.println("Nhập giới tính");
        String gioiTinh = sc.nextLine();
        while (!Pattern.matches(GIOI_TINH, gioiTinh)) {
            System.out.println("Vui lòng nhập đúng giới tính");
            gioiTinh = sc.nextLine();
        }
        System.out.println("Nhập địa chỉ(tỉnh/thành phố)");
        String diaChi = sc.nextLine();
        while (!Pattern.matches(DIA_CHI, diaChi)) {
            System.out.println("Vui lòng nhập đúng địa chỉ");
            diaChi = sc.nextLine();
        }
        System.out.println("Nhập cấp bật");
        String capBat = sc.nextLine();
        while (!Pattern.matches(BAC, capBat)) {
            System.out.println("Vui lòng nhập đúng cấp bật");
            capBat = sc.nextLine();
        }
        congNhanList.add(new CongNhan(hoTen, namSinh, gioiTinh, diaChi, capBat));
        try {
            FileWriter fw = new FileWriter(FILE_TEXT, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < congNhanList.size(); i++) {
                bw.write(congNhanList.get(i).toString());
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void themKySu() {
        List<KySu> kySuList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        String hoTen = sc.nextLine();
        while (!Pattern.matches(HO_TEN, hoTen)) {
            System.out.println("Vui lòng nhập đúng họ tên");
            hoTen = sc.nextLine();
        }

        System.out.println("Nhập năm Sinh");
        String namSinh = sc.nextLine();
        while (!Pattern.matches(NAM_SINH, namSinh)) {
            System.out.println("Vui lòng nhập đúng năm sinh");
            namSinh = sc.nextLine();
        }

        System.out.println("Nhập giới tính");
        String gioiTinh = sc.nextLine();
        while (!Pattern.matches(GIOI_TINH, gioiTinh)) {
            System.out.println("Vui lòng nhập đúng giới tính");
            gioiTinh = sc.nextLine();
        }
        System.out.println("Nhập địa chỉ(tỉnh/thành phố)");
        String diaChi = sc.nextLine();
        while (!Pattern.matches(DIA_CHI, diaChi)) {
            System.out.println("Vui lòng nhập đúng địa chỉ");
            diaChi = sc.nextLine();
        }
        System.out.println("Nhập ngành");
        try {
            FileReader fr = new FileReader("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\quan_li_can_bo\\src\\quanLiCanBo\\nganh.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
//            String[] a=null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String nganh = sc.nextLine();
        String chonNganh=null;
        switch (nganh){
            case "N1":
                chonNganh="N1-Ngành Điện";
                break;
            case "N2":
                chonNganh="N2-Ngành CNTT";
                break;
            case "N3":
                chonNganh="N3-Ngành Hóa-Cơ";
                break;

        }
        kySuList.add(new KySu(hoTen, namSinh, gioiTinh, diaChi, chonNganh));

        try {
            FileWriter fw = new FileWriter(FILE_TEXT, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < kySuList.size(); i++) {
                bw.write(kySuList.get(i).toString());
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void themNhanVien() {
        List<NhanVien> nhanVienList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        String hoTen = sc.nextLine();
        while (!Pattern.matches(HO_TEN, hoTen)) {
            System.out.println("Vui lòng nhập đúng họ tên");
            hoTen = sc.nextLine();
        }

        System.out.println("Nhập năm Sinh");
        String namSinh = sc.nextLine();
        while (!Pattern.matches(NAM_SINH, namSinh)) {
            System.out.println("Vui lòng nhập đúng năm sinh");
            namSinh = sc.nextLine();
        }

        System.out.println("Nhập giới tính");
        String gioiTinh = sc.nextLine();
        while (!Pattern.matches(GIOI_TINH, gioiTinh)) {
            System.out.println("Vui lòng nhập đúng giới tính");
            gioiTinh = sc.nextLine();
        }
        System.out.println("Nhập địa chỉ(tỉnh/thành phố)");
        String diaChi = sc.nextLine();
        while (!Pattern.matches(DIA_CHI, diaChi)) {
            System.out.println("Vui lòng nhập đúng địa chỉ");
            diaChi = sc.nextLine();
        }
        System.out.println("Nhập công việc");
        String congViec  = sc.nextLine();
        while (!Pattern.matches(CONG_VIEC, congViec)) {
            System.out.println("Vui lòng nhập đúng công việc");
            congViec = sc.nextLine();
        }
        nhanVienList.add(new NhanVien(hoTen, namSinh, gioiTinh, diaChi, congViec));
        try {
            FileWriter fw = new FileWriter(FILE_TEXT, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < nhanVienList.size(); i++) {
                bw.write(nhanVienList.get(i).toString());
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
