package quan_li_thu_vien.controller;

import bien_kiem_soat_xe.commons.ExceptionPhuongTien;
import quan_li_thu_vien.commons.DocGhiFile;
import quan_li_thu_vien.commons.ExceptionThuVien;
import quan_li_thu_vien.models.Bao;
import quan_li_thu_vien.models.QuanLiTaiLieu;
import quan_li_thu_vien.models.Sach;
import quan_li_thu_vien.models.TapChi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiChucNang {
    static Scanner scanner=new Scanner(System.in);
    public static void themSach(){
        List<QuanLiTaiLieu> sach=new ArrayList<>();
        System.out.println("Nhập ma tai liệu");
        String maTaiLieu= scanner.nextLine();
        while (!ExceptionThuVien.exMaTaiLieuSach(maTaiLieu)) {
            System.out.println("Chưa đúng định dạng");
            maTaiLieu =scanner.nextLine();

        }
        List<QuanLiTaiLieu> taiLieu=new ArrayList<>();
        taiLieu=DocGhiFile.docFileTaiLieu();
        for (int i = 0; i <taiLieu.size() ; i++) {
            while (taiLieu.get(i).getMaTaiLieu().equals(maTaiLieu)){
                System.out.println("đã tồn tại mã tài liệu");
                maTaiLieu= scanner.nextLine();
            }
        }
        System.out.println("Nhập tên nhà xuất bản");
        String tenNhaSanXuat= scanner.nextLine();
        while (!ExceptionThuVien.exTenNhaXuatBan(tenNhaSanXuat)) {
            System.out.println("Chưa đúng định dạng");
            tenNhaSanXuat =scanner.nextLine();
        }
        System.out.println("Nhập số bản phát hành");
        String soBanPhatHanh= scanner.nextLine();
        while (!ExceptionThuVien.exSoBanPhatHanh(soBanPhatHanh)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            soBanPhatHanh= scanner.nextLine();
        }
        System.out.println("Nhập tên tác giả");
        String tenTacGia= scanner.nextLine();
        while (!ExceptionThuVien.exTenTacGia(tenTacGia)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            tenTacGia= scanner.nextLine();
        }
        System.out.println("Nhập số trang");
        String soTrang= scanner.nextLine();
        while (!ExceptionThuVien.exSoTrang(soTrang)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            soTrang= scanner.nextLine();
        }
        sach.add(new Sach(maTaiLieu,tenNhaSanXuat,soBanPhatHanh,tenTacGia,soTrang));
        DocGhiFile.ghiFile(sach,true);
    }
    public static void themTapChi(){
        List<QuanLiTaiLieu> tapChi=new ArrayList<>();
        System.out.println("Nhập mã tài liệu");
        String maTaiLieu= scanner.nextLine();
        while (!ExceptionThuVien.exMaTaiLieuTapChi(maTaiLieu)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            maTaiLieu= scanner.nextLine();


        }
        List<QuanLiTaiLieu> taiLieu=new ArrayList<>();
        taiLieu=DocGhiFile.docFileTaiLieu();
        for (int i = 0; i <taiLieu.size() ; i++) {
            while (taiLieu.get(i).getMaTaiLieu().equals(maTaiLieu)){
                System.out.println("đã tồn tại mã tài liệu");
                maTaiLieu= scanner.nextLine();
            }
        }
        System.out.println("Nhập tên nhà sản xuất");
        String tenNhaSanXuat= scanner.nextLine();
        while (!ExceptionThuVien.exTenNhaXuatBan(tenNhaSanXuat)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            tenNhaSanXuat= scanner.nextLine();
        }
        System.out.println("Nhập số bản phát hành");
        String soBanPhatHanh= scanner.nextLine();
        while (!ExceptionThuVien.exSoBanPhatHanh(soBanPhatHanh)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            soBanPhatHanh= scanner.nextLine();
        }
        System.out.println("Nhập số phát hành");
        String soPhatHanh= scanner.nextLine();
        while (!ExceptionThuVien.exSoPhatHanh(soPhatHanh)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            soPhatHanh= scanner.nextLine();
        }
        System.out.println("Nhập tháng phát hành");
        String thangPhatHanh= scanner.nextLine();
        while (!ExceptionThuVien.exThangPhatHanh(thangPhatHanh)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            thangPhatHanh= scanner.nextLine();
        }
        tapChi.add(new TapChi(maTaiLieu,tenNhaSanXuat,soBanPhatHanh,soPhatHanh,thangPhatHanh));
        DocGhiFile.ghiFile(tapChi,true);
    }
    public static void themBao(){
        List<QuanLiTaiLieu> bao=new ArrayList<>();
        System.out.println("Nhập mã tài liệu");
        String maTaiLieu= scanner.nextLine();
        while (!ExceptionThuVien.exMaTaiLieuBao(maTaiLieu)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            maTaiLieu= scanner.nextLine();

        }
        List<QuanLiTaiLieu> taiLieu=new ArrayList<>();
        taiLieu=DocGhiFile.docFileTaiLieu();
        for (int i = 0; i <taiLieu.size() ; i++) {
            while (taiLieu.get(i).getMaTaiLieu().equals(maTaiLieu)){
                System.out.println("đã tồn tại mã tài liệu");
                maTaiLieu= scanner.nextLine();
            }
        }
        System.out.println("Nhập tên nhà sản xuất");
        String tenNhaSanXuat= scanner.nextLine();
        while (!ExceptionThuVien.exTenNhaXuatBan(tenNhaSanXuat)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            tenNhaSanXuat= scanner.nextLine();
        }
        System.out.println("Nhập số bản phát hành");
        String soBanPhatHanh= scanner.nextLine();
        while (!ExceptionThuVien.exSoBanPhatHanh(soBanPhatHanh)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            soBanPhatHanh= scanner.nextLine();
        }
        System.out.println("Nhập ngay phát hành");
        String ngayPhatHanh= scanner.nextLine();
        while (!ExceptionThuVien.exNgayPhatHanh(ngayPhatHanh)){
            System.out.println("Mời Bạn nhập đúng định dạng");
            ngayPhatHanh= scanner.nextLine();
        }
        bao.add(new Bao(maTaiLieu,tenNhaSanXuat,soBanPhatHanh,ngayPhatHanh));
        DocGhiFile.ghiFile(bao,true);
    }

   public static void hienThiTaiLieuSach(){
        List<QuanLiTaiLieu>listSach=new ArrayList<>();
        listSach=DocGhiFile.docFileTaiLieu();
       for (int i = 0; i <listSach.size() ; i++) {
           if(listSach.get(i) instanceof Sach){
               System.out.println(listSach.get(i).showInfor());
           }
       }
   }
    public static void hienThiTaiLieuTapChi(){
        List<QuanLiTaiLieu>listBao=new ArrayList<>();
        listBao=DocGhiFile.docFileTaiLieu();
        for (int i = 0; i <listBao.size() ; i++) {
            if(listBao.get(i) instanceof TapChi){
                System.out.println(listBao.get(i).showInfor());
            }
        }
    }
    public static void hienThiTaiLieuBao(){
        List<QuanLiTaiLieu>listBao=new ArrayList<>();
        listBao=DocGhiFile.docFileTaiLieu();
        for (int i = 0; i <listBao.size() ; i++) {
            if(listBao.get(i) instanceof Bao){
                System.out.println(listBao.get(i).showInfor());
            }
        }
    }

    public static void timKiemTaiLieu(){
        List<QuanLiTaiLieu>taiLieu=new ArrayList<>();
        System.out.println("tìm kiếm");
        String input=scanner.nextLine();
        boolean check=false;
        taiLieu=DocGhiFile.docFileTaiLieu();
        for (int i = 0; i <taiLieu.size() ; i++) {
            if(taiLieu.get(i).getMaTaiLieu().contains(input)){
                System.out.println(taiLieu.get(i).showInfor());
                check=true;
            }
        }if(!check){
            System.out.println("Không tìm thấy");
        }
    }

}
