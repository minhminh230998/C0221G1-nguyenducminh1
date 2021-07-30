package servlet;

import calculator.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCalculator", urlPatterns = "/calculator")
public class ServletCalculator extends HttpServlet {
    List<Calculator> list = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("nb1"));
        float second = Float.parseFloat(request.getParameter("nb2"));
        char operator = request.getParameter("operator").charAt(0);
        String result="";
        try {
            result += Calculator.calculate(first, second, operator);
        }catch (Exception e){
            result=e.getMessage();
        }


        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
