package quan_li_danh_ba.commons;

import quan_li_danh_ba.models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static String PATH="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\thi_module2\\src\\quan_li_danh_ba\\data\\danhBa.csv";

    public static void ghiFile(List<DanhBa> list, boolean trangThai) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            fileWriter = new FileWriter(PATH, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for ( DanhBa danhBa : list) {
                bufferedWriter.write(danhBa.toString());
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
    public static List<DanhBa> docFile() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DanhBa> danhBaList = new ArrayList<>();
        String line = null;
        String[] strings = null;
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                    DanhBa danhBa = new DanhBa(strings[0], strings[1], strings[2], strings[3], strings[4],strings[5],strings[6]);
                    danhBaList.add(danhBa);
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
        return danhBaList;
    }

}
