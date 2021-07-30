package controller;

import common.DocGhiFile;
import common.Regex;
import models.House;
import models.Room;
import models.Villa;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class GhiDichVu implements Regex {
    public static void ghiVilla(){
        List<Villa> villaList=ThemDichVu.themVilla();
        DocGhiFile.ghiFile(villaList,true);
    }

   public static void ghiHouse(){
        List<House> houseList=ThemDichVu.themHouse();

       DocGhiFile.ghiFile(houseList,true);
   }
    public static void ghiRoom(){
        List<Room> roomList=ThemDichVu.themRoom();

        DocGhiFile.ghiFile(roomList,true);
    }


}
