package quanlitiendien.commons;

import quanlitiendien.models.HoaDon;
import quanlitiendien.models.KhachHang;
import quanlitiendien.models.KhachHangNuocNgoai;
import quanlitiendien.models.KhachHangVietNam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static final String PATH="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quanlitiendien\\data\\khachHang.csv";
    private static final String PATH_LOAI_KHACH="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quanlitiendien\\data\\loaiKhach.csv";
private static final String PATH_HOA_DON="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quanlitiendien\\data\\hoaDon.csv";

    public static void ghiFileKhachHang(List<KhachHang> list,boolean a){

        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            fileWriter=new FileWriter(PATH,a);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).toString());
                bufferedWriter.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<KhachHang> docFile(){
        List<KhachHang> list=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        String[] temp=null;
        try {
            fileReader=new FileReader(PATH);
            bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(",");
                if(temp.length==4){
                    KhachHang vietNam=new KhachHangVietNam(temp[0],temp[1],temp[2],temp[3]);
                    list.add(vietNam);
                }
                if(temp.length==3){
                    KhachHang nuocNgoai=new KhachHangNuocNgoai(temp[0],temp[1],temp[2]);
                    list.add(nuocNgoai);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
    public static List<String> docFileLoaiKhach(){
        List<String> list=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        try{
            fileReader=new FileReader(PATH_LOAI_KHACH);
            bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                list.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public static void ghiFileHoaDon(List<HoaDon> list,boolean a){

        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            fileWriter=new FileWriter(PATH_HOA_DON,a);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).toString());
                bufferedWriter.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<HoaDon> docFileHoaDon(){
        List<HoaDon> list=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        String[] temp=null;

        try{
            fileReader=new FileReader(PATH_HOA_DON);
            bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(",");
                list.add(new HoaDon(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }



}
