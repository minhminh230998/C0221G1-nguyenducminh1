package quan_li_thu_vien.commons;

import quan_li_thu_vien.models.Bao;
import quan_li_thu_vien.models.QuanLiTaiLieu;
import quan_li_thu_vien.models.Sach;
import quan_li_thu_vien.models.TapChi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static String PATH="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quan_li_thu_vien\\data\\thuVien.csv";

    public static void ghiFile(List<QuanLiTaiLieu> list, boolean trangThai) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH);
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for ( QuanLiTaiLieu quanLiTaiLieu : list) {
                bufferedWriter.write(quanLiTaiLieu.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<QuanLiTaiLieu> docFileTaiLieu() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<QuanLiTaiLieu> quanLiTaiLieuList = new ArrayList<>();
        String line = null;
        String[] strings = null;
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                if (strings.length==5&&strings[0].contains("S")) {
                    QuanLiTaiLieu sach = new Sach(strings[0], strings[1], strings[2], strings[3], strings[4]);
                    quanLiTaiLieuList.add(sach);
                }
                if (strings[0].contains("TC") && strings.length == 5) {
                    QuanLiTaiLieu tapChi = new TapChi(strings[0], strings[1], strings[2], strings[3], strings[4]);
                    quanLiTaiLieuList.add(tapChi);
                }
                if(strings.length==4&& strings[0].contains("B")) {
                    QuanLiTaiLieu bao = new Bao(strings[0], strings[1], strings[2], strings[3]);
                    quanLiTaiLieuList.add(bao);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return quanLiTaiLieuList;
    }
}
