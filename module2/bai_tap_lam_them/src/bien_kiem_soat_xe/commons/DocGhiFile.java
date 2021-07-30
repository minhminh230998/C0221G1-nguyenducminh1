package bien_kiem_soat_xe.commons;

import bien_kiem_soat_xe.models.Oto;
import bien_kiem_soat_xe.models.PhuongTienGiaoThong;
import bien_kiem_soat_xe.models.XeMay;
import bien_kiem_soat_xe.models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile<T> {
    public static final String PATH = "E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\bien_kiem_soat_xe\\data\\phuongtien.csv";
    public static final String PATHHSX = "E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\bien_kiem_soat_xe\\data\\hangSanXuat.csv";
    public static void ghiFilePhuongTien(List<PhuongTienGiaoThong> phuongTienGiaoThongList, boolean trangThai) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH);
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTienGiaoThong phuongTienGiaoThong : phuongTienGiaoThongList) {
                bufferedWriter.write(phuongTienGiaoThong.toString());
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

    public static List<PhuongTienGiaoThong> docFilePhuongTien() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<PhuongTienGiaoThong> phuongTienGiaoThongList = new ArrayList<>();
        String line = null;
        String[] strings = null;
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");


                if (strings.length == 6) {
                    PhuongTienGiaoThong oto = new Oto(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5]);
                    phuongTienGiaoThongList.add(oto);
                }
                if (strings[0].contains("C") && strings.length == 5) {
                    PhuongTienGiaoThong xeTai = new XeTai(strings[0], strings[1], strings[2], strings[3], strings[4]);
                    phuongTienGiaoThongList.add(xeTai);
                }else if(strings.length==5) {
                    PhuongTienGiaoThong xeMay = new XeMay(strings[0], strings[1], strings[2], strings[3], strings[4]);
                    phuongTienGiaoThongList.add(xeMay);
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
        return phuongTienGiaoThongList;
    }

    public static List<String> docFileHangSanXuat() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        String line = null;
        try {
            file = new File(PATHHSX);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
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
        return stringList;
    }
}
