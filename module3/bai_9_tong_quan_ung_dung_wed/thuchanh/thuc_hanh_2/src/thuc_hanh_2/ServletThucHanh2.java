package thuc_hanh_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "ServletThucHanh2",value = "/login")
public class ServletThucHanh2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hoTen=request.getParameter("hoTen");
        String password=request.getParameter("password");
        PrintWriter printWriter=response.getWriter();
        if ("admin".equals(hoTen)&& "admin".equals(password)){
            printWriter.println("hello bạn:"+hoTen);
        }else {
            printWriter.println("Login Error");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
