package controller;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.bean.customerService.AttachServiceContract;
import model.bean.customerService.CustomerService;
import model.bean.service.Services;
import model.service.*;
import model.service.impl.AttachServiceContractImpl;
import model.service.impl.ContractImpl;
import model.service.impl.CustomerServiceImplService;
import model.service.impl.ServiceServiceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServiceAttachServiceServlet", urlPatterns = "/cusseratt")
public class CustomerServiceAttachServiceServlet extends HttpServlet {
    ICustomerServiceService iCustomerServiceService = new CustomerServiceImplService();
    IAttachServiceContract iAttachServiceContract = new AttachServiceContractImpl();
    IContract iContract = new ContractImpl();
    IService iService = new ServiceServiceimpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editContract(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<CustomerService> customerServiceList = iCustomerServiceService.findByName(name);
        List<AttachServiceContract> attachServiceContractList = iAttachServiceContract.findAll();
        request.setAttribute("attachServiceContractList", attachServiceContractList);
        RequestDispatcher requestDispatcher = null;
        if (customerServiceList == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {

            request.setAttribute("customerServiceList", customerServiceList);

            requestDispatcher = request.getRequestDispatcher("/customerServiceAttach/search.jsp");

        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editContract(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String serviceId =request.getParameter("serviceId");
        Services services = iService.findById(serviceId);
        Contract contract = new Contract(id, services);
        boolean check = iContract.edit(contract);
        if (check) {
            request.setAttribute("message", "Update ");
            request.setAttribute("contract", contract);
        } else {
            request.setAttribute("message",
                    "update successful");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customerServiceAttach/edit.jsp");
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
            case "edit":
                showFormEdit(request, response);
                break;

            default:
                showList(request, response);
                break;
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Contract contract = iContract.findById(id);
        List<Services> services = iService.findAll();
        request.setAttribute("services", services);

        RequestDispatcher requestDispatcher = null;
        if (contract == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("/customerServiceAttach/edit.jsp");
            request.setAttribute("contract", contract);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerService> customerServiceList = iCustomerServiceService.findAll();
        List<AttachServiceContract> attachServiceContractList = iAttachServiceContract.findAll();
        request.setAttribute("customerServiceList", customerServiceList);
        request.setAttribute("attachServiceContractList", attachServiceContractList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customerServiceAttach/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
