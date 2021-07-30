package common;

import models.*;

import java.awt.event.TextEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class DocGhiFile<E> {
    private static String FILE_KHACH_HANG = "E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\case_study\\src\\data\\khachHang.csv";
private static String FILE_TEXT="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\case_study\\src\\data\\dichVu.csv";
    public static <E> void ghiFile(List<E> list, boolean appent) {
        try {
            FileWriter fw = new FileWriter(FILE_TEXT, appent);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).toString());
                bw.append("\n");

            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static List<DichVu> docFile(String nameFile) {
        List<DichVu> dichVuList = new ArrayList<>();
        File file = new File(nameFile);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            DichVu dichVu = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 10) {
                    DichVu villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], temp[10]);
                    dichVuList.add(villa);
                } else if (temp.length == 9) {
                    DichVu house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                    dichVuList.add(house);
                } else {
                    DichVu room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                    dichVuList.add(room);
                }
            }
        } catch (IOException e) {
            System.err.println("error reading...");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dichVuList;
    }
    public static void ghiFileKhachHang(List<KhachHang> list,boolean a){
        FileWriter fileWrite=null;
        BufferedWriter bufferedWriter=null;
        try{
            fileWrite=new FileWriter(FILE_KHACH_HANG,a);
            bufferedWriter=new BufferedWriter(fileWrite);
            for (int i = 0; i <list.size() ; i++) {
                bufferedWriter.write(list.get(i).toString());
                bufferedWriter.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<KhachHang> docFileKhachHang() {
        List<KhachHang> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        String[] arr = null;
        try {
            fileReader = new FileReader(FILE_KHACH_HANG);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                list.add(new KhachHang(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}



