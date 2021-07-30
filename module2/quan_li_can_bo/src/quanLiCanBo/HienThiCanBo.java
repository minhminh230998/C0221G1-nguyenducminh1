package quanLiCanBo;

import object.CanBo;
import object.CongNhan;
import object.KySu;
import object.NhanVien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HienThiCanBo implements Regex {
    public static void hienThiCanBo(String x) {
        List<CanBo> canBoList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(FILE_TEXT);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] a = null;
            while ((line = br.readLine()) != null) {
                a = line.split(",");
                if (a[4].contains(x)) {
                    if (x=="PV") {
                        CanBo nhanVien = new NhanVien(a[0], a[1], a[2], a[3], a[4]);
                        canBoList.add(nhanVien);
                        canBoList.sort(Comparator.comparing(CanBo::getHoTen));
                        System.out.println(canBoList);
                    } else if (x=="/7") {
                        CanBo congNhan = new CongNhan(a[0], a[1], a[2], a[3], a[4]);
                        canBoList.add(congNhan);
                        canBoList.sort(Comparator.comparing(CanBo::getHoTen));
                        System.out.println(canBoList);
                    } else if(x=="Ngành"){
                        CanBo kySu = new KySu(a[0], a[1], a[2], a[3], a[4]);
                        canBoList.add(kySu);
                        canBoList.sort(Comparator.comparing(CanBo::getHoTen));
                        System.out.println(canBoList);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
