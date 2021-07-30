package controller;

import model.bean.DanhMuc;
import model.bean.SanPham;
import model.service.IDanhMucService;
import model.service.ISanPhamService;
import model.service.impl.DanhMucServiceImpl;
import model.service.impl.SanPhamServiceIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = {"", "/sanPham"})
public class Servlet extends HttpServlet {
    ISanPhamService iSanPhamService = new SanPhamServiceIpml();
    IDanhMucService iDanhMucService = new DanhMucServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                break;
        }
    }


    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iSanPhamService.delete(id);
        try {
            response.sendRedirect("/sanPham");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        String gia = request.getParameter("gia");
        String soLuong = request.getParameter("soLuong");
        String mauSac = request.getParameter("mauSac");
        int idDanhMuc = Integer.parseInt(request.getParameter("danhMuc"));
        DanhMuc danhMuc = iDanhMucService.findById(idDanhMuc);
        List<DanhMuc> danhMucList = iDanhMucService.findAll();

        SanPham sanPham = new SanPham(id, ten, gia, soLuong, mauSac, danhMuc);
        String[] msgArr = iSanPhamService.edit(sanPham);
        RequestDispatcher requestDispatcher = null;
        if (msgArr.length == 0) {
            request.setAttribute("message", "update successful");
            request.setAttribute("sanPham", sanPham);
            request.setAttribute("danhMucList", danhMucList);
            requestDispatcher = request.getRequestDispatcher("/view/edit.jsp");
        } else {

            request.setAttribute("msgTen", msgArr[0]);
            request.setAttribute("msgGia", msgArr[1]);
            request.setAttribute("msgSoLuong", msgArr[2]);
            request.setAttribute("msgMauSac", msgArr[3]);
            request.setAttribute("sanPham", sanPham);
            request.setAttribute("danhMucList", danhMucList);
            requestDispatcher = request.getRequestDispatcher("/view/edit.jsp");
        }


        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        //      int id, String ten, String gia, String soLuong, String mauSac, String moTa, DanhMuc danhMuc
        String ten = request.getParameter("ten");
        String gia = request.getParameter("gia");
        String soLuong = request.getParameter("soLuong");
        String mauSac = request.getParameter("mauSac");
        String moTa = request.getParameter("moTa");
        int idDanhMuc = Integer.parseInt(request.getParameter("danhMuc"));
        DanhMuc danhMuc = iDanhMucService.findById(idDanhMuc);
        List<DanhMuc> danhMucList = iDanhMucService.findAll();

        SanPham sanPham = new SanPham(ten, gia, soLuong, mauSac, moTa, danhMuc);
        String[] msgArr = iSanPhamService.create(sanPham);
        RequestDispatcher requestDispatcher = null;
        if (msgArr.length == 0) {
            request.setAttribute("message", "update successful");
            request.setAttribute("sanPham", sanPham);
            request.setAttribute("danhMucList", danhMucList);
            requestDispatcher = request.getRequestDispatcher("/view/add.jsp");
        } else {

            request.setAttribute("msgTen", msgArr[0]);
            request.setAttribute("msgGia", msgArr[1]);
            request.setAttribute("msgSoLuong", msgArr[2]);
            request.setAttribute("msgMauSac", msgArr[3]);
            request.setAttribute("sanPham", sanPham);
            request.setAttribute("danhMucList", danhMucList);
            requestDispatcher = request.getRequestDispatcher("/view/add.jsp");
        }


        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<SanPham> sanPhamList = iSanPhamService.findAll();

        request.setAttribute("sanPhamList", sanPhamList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<DanhMuc> danhMucList = iDanhMucService.findAll();
        SanPham sanPham = iSanPhamService.findById(id);
        request.setAttribute("danhMucList", danhMucList);
        request.setAttribute("sanPham", sanPham);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/edit.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<DanhMuc> danhMucList = iDanhMucService.findAll();
        request.setAttribute("danhMucList", danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/add.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
