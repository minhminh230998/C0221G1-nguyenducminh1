package controller;

import common.DocGhiFile;
import common.Regex;
import models.DichVu;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;

public class HienThiDichVu implements Regex {
    public static void hienThiVilla(){
        List<DichVu>dichVuList = new ArrayList<>();
        dichVuList =DocGhiFile.docFile(TEXT_VILLA);
        for(DichVu dichVu:dichVuList){
            if(dichVu instanceof Villa){
                System.out.println(dichVu.showInfor());
            }
        }

    }
   public static void hienThiHouse(){
        List<DichVu> listHouse=new ArrayList<>();
        listHouse=DocGhiFile.docFile(TEXT_HOUSE);
       for (int i = 0; i <listHouse.size() ; i++) {
           if(listHouse.get(i) instanceof House){
               System.out.println(listHouse.get(i).showInfor());
           }
       }
   }
    public static void hienThiRoom(){
        List<DichVu> listRoom=new ArrayList<>();
        listRoom=DocGhiFile.docFile(TEXT_ROOM);
        for (int i = 0; i <listRoom.size() ; i++) {
            if(listRoom.get(i) instanceof Room){
                System.out.println(listRoom.get(i).showInfor());
            }
        }
    }

    public static void main(String[] args) {
       hienThiRoom();
    }
}
