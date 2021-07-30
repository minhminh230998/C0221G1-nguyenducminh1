package thuc_hanh_4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ServletThucHanh4", urlPatterns = "/giaTri")
public class ServletThucHanh4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> ngonNgu = new HashMap<>();
        ngonNgu.put("hello", "Xin chào");
        ngonNgu.put("value", "Giá trị");
        ngonNgu.put("go", "đi");
        String timKiem = request.getParameter("vn");
        String ketQua = ngonNgu.get(timKiem);

        if (ketQua == null) {
            ketQua = "không rìm thấy";
        }
        request.setAttribute("layKetQua", ketQua);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ketQua.jsp");
        dispatcher.forward(request, response);
    }
}
