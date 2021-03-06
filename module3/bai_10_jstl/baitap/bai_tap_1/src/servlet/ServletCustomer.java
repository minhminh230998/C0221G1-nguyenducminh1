package servlet;

import module.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer",urlPatterns = "/Customer")
public class ServletCustomer extends HttpServlet {
    List<Customer> list=new ArrayList<>();
    @Override
    public void init() throws ServletException {

        list.add(new Customer("Minh","20","Quảng Nam","https://cdnmedia.thethaovanhoa.vn/2015/03/30/15/45/m.jpg"));
        list.add(new Customer("Đức","21","Đà Nẵng","https://cms.lichngaytot.com/medias/original/2015/5/13/Khuon-mat-chu-vuong-he-lo-dieu-gi-ve-ban-chat-con-nguoi.jpg"));
        list.add(new Customer("Hoàng","22","Quảng Nam","https://vansu.net/sites/default/files/pictures/07/guong-mat-dep-nhat-the-gioi-3.jpg"));
        list.add(new Customer("Tâm","23","Huế","data:image/jpeg;base64,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"));
        list.add(new Customer("Tấn","24","Quảng Nam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEemOpQfizNN5MonVdsKufkIMOlw-ShyUwBA&usqp=CAU"));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",list);
        request.getRequestDispatcher("/listCustomer.jsp").forward(request,response);
    }
}
