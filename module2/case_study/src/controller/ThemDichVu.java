package controller;

import common.DocGhiFile;
import common.Regex;
import models.DichVu;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ThemDichVu implements Regex {
    static Scanner sc=new Scanner(System.in);
   public static List<Villa> themVilla(){
       List<Villa> villaList=new ArrayList<>();
       System.out.println("Them ten dich vu:");
       String tenDichVu=sc.nextLine();
       while (!Exception.tenDichVu(tenDichVu)){
           tenDichVu=sc.nextLine();
       }

       System.out.println("Them dien tich su dung:");
       String dienTichSuDung=sc.nextLine();
       while (!Exception.dienTichSuDung(dienTichSuDung)){
           dienTichSuDung=sc.nextLine();
       }

       System.out.println("Nhap chi phi thue:");
       String chiPhiThue=sc.nextLine();
       while(!Exception.chiPhiThue(chiPhiThue)){
           chiPhiThue=sc.nextLine();
       }

       System.out.println("Nhap so luong nguoi:");
       String soLuongNguoi=sc.nextLine();
       while (!Exception.soLuongNguoiToiDa(soLuongNguoi)){
           soLuongNguoi=sc.nextLine();
       }

       System.out.println("Nhap kieu thue");
       String kieuThue=sc.nextLine();
       while (!Exception.kieuThue(kieuThue)){
           kieuThue=sc.nextLine();
       }


       System.out.println("Nhap Id");
       String id=sc.nextLine();
       while (!Exception.exceptionMaDichVuVilla(id)){
           id=sc.nextLine();
       }
       System.out.println("Nhap tieu chuan phong:");
       String tieuChuanPhong=sc.nextLine();
       while (!Exception.tieuChuanPhong(tieuChuanPhong)){
           tieuChuanPhong=sc.nextLine();
       }
       System.out.println("Nhap tien nghi khac:");
       String tienNghiKhac=sc.nextLine();
       while (!Exception.tienNghiKhac(tienNghiKhac)){
           tienNghiKhac=sc.nextLine();
       }
       System.out.println("Nhap dien tich ho boi:");
       String dienTichHoBoi=sc.nextLine();
       while (!Exception.dienTichHoBoi(dienTichHoBoi)){
           dienTichHoBoi=sc.nextLine();
       }
       System.out.println("Nhap so tang:");
       String soTang=sc.nextLine();
       while (!Exception.soTang(soTang)){
           soTang=sc.nextLine();
       }
       System.out.println("Nhap dich vu di kem:");
       String dichVuDiKem=sc.nextLine();
       while (!Exception.dichVuDiKem(dichVuDiKem)){
           dichVuDiKem=sc.nextLine();
       }
villaList.add(new Villa(id,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,tieuChuanPhong,tienNghiKhac,dienTichHoBoi,soTang,dichVuDiKem));
       return villaList;
   }
    public static List<House> themHouse(){
        List<House> houseList=new ArrayList<>();
        System.out.println("Them ten dich vu:");
        String tenDichVu=sc.nextLine();
        while (!Exception.tenDichVu(tenDichVu)){
            tenDichVu=sc.nextLine();
        }

        System.out.println("Them dien tich su dung:");
        String dienTichSuDung=sc.nextLine();
        while (!Exception.dienTichSuDung(dienTichSuDung)){
            dienTichSuDung=sc.nextLine();
        }

        System.out.println("Nhap chi phi thue:");
        String chiPhiThue=sc.nextLine();
        while(!Exception.chiPhiThue(chiPhiThue)){
            chiPhiThue=sc.nextLine();
        }

        System.out.println("Nhap so luong nguoi:");
        String soLuongNguoi=sc.nextLine();
        while (!Exception.soLuongNguoiToiDa(soLuongNguoi)){
            soLuongNguoi=sc.nextLine();
        }

        System.out.println("Nhap kieu thue");
        String kieuThue=sc.nextLine();
        while (!Exception.kieuThue(kieuThue)){
            kieuThue=sc.nextLine();
        }


        System.out.println("Nhap Id");
        String id=sc.nextLine();
        while (!Exception.exceptionMaDichVuHouse(id)){
            id=sc.nextLine();
        }
        System.out.println("Nhap tieu chuan phong:");
        String tieuChuanPhong=sc.nextLine();
        while (!Exception.tieuChuanPhong(tieuChuanPhong)){
            tieuChuanPhong=sc.nextLine();
        }
        System.out.println("Nhap tien nghi khac:");
        String tienNghiKhac=sc.nextLine();
        while (!Exception.tienNghiKhac(tienNghiKhac)){
            tienNghiKhac=sc.nextLine();
        }

        System.out.println("Nhap so tang:");
        String soTang=sc.nextLine();
        while (!Exception.soTang(soTang)){
            soTang=sc.nextLine();
        }
        System.out.println("Nhap dich vu di kem:");
        String dichVuDiKem=sc.nextLine();
        while (!Exception.dichVuDiKem(dichVuDiKem)){
            dichVuDiKem=sc.nextLine();
        }
        houseList.add(new House(id,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,tieuChuanPhong,tienNghiKhac,soTang,dichVuDiKem));
        return houseList;
    }
    public static List<Room> themRoom(){
        List<Room> roomList=new ArrayList<>();
        System.out.println("Them ten dich vu:");
        String tenDichVu=sc.nextLine();
        while (!Exception.tenDichVu(tenDichVu)){
            tenDichVu=sc.nextLine();
        }

        System.out.println("Them dien tich su dung:");
        String dienTichSuDung=sc.nextLine();
        while (!Exception.dienTichSuDung(dienTichSuDung)){
            dienTichSuDung=sc.nextLine();
        }

        System.out.println("Nhap chi phi thue:");
        String chiPhiThue=sc.nextLine();
        while(!Exception.chiPhiThue(chiPhiThue)){
            chiPhiThue=sc.nextLine();
        }

        System.out.println("Nhap so luong nguoi:");
        String soLuongNguoi=sc.nextLine();
        while (!Exception.soLuongNguoiToiDa(soLuongNguoi)){
            soLuongNguoi=sc.nextLine();
        }

        System.out.println("Nhap kieu thue");
        String kieuThue=sc.nextLine();
        while (!Exception.kieuThue(kieuThue)){
            kieuThue=sc.nextLine();
        }


        System.out.println("Nhap Id");
        String id=sc.nextLine();
        while (!Exception.exceptionMaDichVuRoom(id)){
            id=sc.nextLine();
        }

        System.out.println("Nhap dich vu mien phi di kem:");
        String dichVufreeDiKem=sc.nextLine();
        while (!Exception.dichVuMienPhiDiKem(dichVufreeDiKem)){
            dichVufreeDiKem=sc.nextLine();
        }

        System.out.println("Nhap dich vu di kem:");
        String dichVuDiKem=sc.nextLine();
        while (!Exception.dichVuDiKem(dichVuDiKem)){
            dichVuDiKem=sc.nextLine();
        }
        roomList.add(new Room(id,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,dichVufreeDiKem,dichVuDiKem));
        return roomList;
    }
}
