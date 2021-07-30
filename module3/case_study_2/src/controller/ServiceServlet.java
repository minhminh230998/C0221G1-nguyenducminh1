package controller;

import model.bean.service.House;
import model.bean.service.Room;
import model.bean.service.Villa;
import model.service.IService;
import model.service.impl.ServiceServiceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    IService iService=new ServiceServiceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "villa":
                addVilla(request, response);
                break;
            case "house":
                addHouse(request, response);
                break;
            case "room":
                addRoom(request, response);
                break;
        }
    }

    private void addRoom(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        String area=request.getParameter("area");
        Double cost=Double.parseDouble(request.getParameter("cost"));
        int maxPeople=Integer.parseInt(request.getParameter("maxPeople"));
        int rentType=Integer.parseInt(request.getParameter("rentType"));
        int serviceType=3;
        iService.createRoom(new Room(rentType,serviceType,name,area,cost,maxPeople));
        request.setAttribute("message", "Thêm thành công");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-villa.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void addHouse(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        String area=request.getParameter("area");
        Double cost=Double.parseDouble(request.getParameter("cost"));
        int maxPeople=Integer.parseInt(request.getParameter("maxPeople"));
        int rentType=Integer.parseInt(request.getParameter("rentType"));
        int serviceType=2;
        String standardRoom=request.getParameter("standardRoom");
        String description=request.getParameter("description");
        int numberFloors=Integer.parseInt(request.getParameter("numberFloors"));
        iService.createHouse(new House(rentType,serviceType,name,area,cost,maxPeople,standardRoom,description,numberFloors));
        request.setAttribute("message", "Thêm thành công");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-house.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addVilla(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        String area=request.getParameter("area");
        Double cost=Double.parseDouble(request.getParameter("cost"));
        int maxPeople=Integer.parseInt(request.getParameter("maxPeople"));
        int rentType=Integer.parseInt(request.getParameter("rentType"));
        int serviceType=1;
        String standardRoom=request.getParameter("standardRoom");
        String description=request.getParameter("description");
        Float poolArea=Float.parseFloat(request.getParameter("poolArea"));
        int numberFloors=Integer.parseInt(request.getParameter("numberFloors"));
        iService.createVilla(new Villa(rentType,serviceType,name,area,cost,maxPeople,standardRoom,description,poolArea,numberFloors));
        request.setAttribute("message", "Thêm thành công");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-villa.jsp");
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
        switch (action) {
            case "villa":
                showFormVilla(request, response);
                break;
            case "house":
                showFormHouse(request, response);
                break;
            case "room":
                showFormRoom(request, response);
                break;
        }
    }

    private void showFormRoom(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-room.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormHouse(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-house.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormVilla(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-villa.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
