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
import java.util.List;
import java.util.Scanner;

public class TimKiemCanBo implements Regex {
    public static void timKiemCanBo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cán bộ muốn tìm kiếm");
        String x = sc.nextLine();

        List<CanBo> canBoList = new ArrayList<>();
        String[] strings = null;
        try {
            FileReader fr = new FileReader(FILE_TEXT);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                strings = line.split(",");
                if(strings[4].contains("PV")){
                    CanBo nhanVien = new NhanVien(strings[0],strings[1],strings[2],strings[3],strings[4]);
                    canBoList.add(nhanVien);
                }else if (strings[4].contains("/7")){
                    CanBo congNhan = new CongNhan(strings[0],strings[1],strings[2],strings[3],strings[4]);
                    canBoList.add(congNhan);
                }else {
                    CanBo kySu = new KySu(strings[0],strings[1],strings[2],strings[3],strings[4]);
                    canBoList.add(kySu);
                }
//                for (int i = 0; i < canBoList.size(); i++) {
//                    if (canBoList.get(i).contains(x)) {
//                        System.out.println(canBoList.get(i));
//                    }
//                }
        }
            for (int i =0;i <canBoList.size();i++){
                if (canBoList.get(i).getHoTen().contains(x)){
                    System.out.println(canBoList.get(i));
                }
            }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
