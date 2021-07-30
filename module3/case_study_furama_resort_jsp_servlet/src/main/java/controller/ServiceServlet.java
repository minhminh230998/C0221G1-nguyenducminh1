package controller;

import model.bean.service.RentType;
import model.bean.service.Services;
import model.bean.service.ServiceType;
import model.service.IRentType;
import model.service.IService;
import model.service.IServiceType;
import model.service.impl.RentTypeImpl;
import model.service.impl.ServiceServiceimpl;
import model.service.impl.ServiceTypeImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    IService iService=new ServiceServiceimpl();
    IServiceType iServiceType=new ServiceTypeImpl();
    IRentType iRentType=new RentTypeImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "add":
                addService(request, response);
                break;
        }
    }


    private void addService(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String area=request.getParameter("area");
        Double cost=Double.parseDouble(request.getParameter("cost"));
        int maxPeople=Integer.parseInt(request.getParameter("maxPeople"));
        int idRentType=Integer.parseInt(request.getParameter("rentType"));
        int idServiceType=Integer.parseInt(request.getParameter("serviceType"));
        String standardRoom=request.getParameter("standardRoom");
        String description=request.getParameter("description");
        Float poolArea=Float.parseFloat(request.getParameter("poolArea"));
        int numberFloors=Integer.parseInt(request.getParameter("numberFloors"));
        if(standardRoom==""){
            standardRoom=null;
        }
        if(description==""){
            description=null;
        }
        if(poolArea==0){
            poolArea=0f;
        }
        if(numberFloors==0){
            numberFloors=0;
        }
        ServiceType serviceType=iServiceType.findById(idServiceType);
        RentType rentType=iRentType.findById(idRentType);
        iService.createVilla(new Services(id,rentType,serviceType,name,area,cost,maxPeople,standardRoom,description,poolArea,numberFloors));
        request.setAttribute("message", "update successful");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-service.jsp");
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
            case "add":
                showFormAddService(request, response);
                break;

        }
    }



    private void showFormAddService(HttpServletRequest request, HttpServletResponse response) {
        List<RentType> rentTypeList=iRentType.findAll();
        List<ServiceType> serviceTypeList=iServiceType.findAll();
        request.setAttribute("rentTypeList",rentTypeList);
        request.setAttribute("serviceTypeList",serviceTypeList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/service/add-service.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
