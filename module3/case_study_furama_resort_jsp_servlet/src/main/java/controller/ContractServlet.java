package controller;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Services;
import model.service.IContract;
import model.service.ICustomerService;
import model.service.IEmployeeService;
import model.service.IService;
import model.service.impl.ContractImpl;
import model.service.impl.CustomerServiceimpl;
import model.service.impl.EmployeeService;
import model.service.impl.ServiceServiceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    IContract iContract = new ContractImpl();
    ICustomerService iCustomerService = new CustomerServiceimpl();
    IEmployeeService iEmployeeService = new EmployeeService();
    IService iService = new ServiceServiceimpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "add":
                addContract(request, response);
                break;

        }
    }

    private void addContract(HttpServletRequest request, HttpServletResponse response) {
//        ,endDate,deposit,employeeId,customerId,serviceId
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        Double deposit = Double.parseDouble(request.getParameter("deposit"));
        String employeeId = request.getParameter("employeeId");
        String customerId = request.getParameter("customerId");
        String serviceId = request.getParameter("serviceId");
        Employee employee = iEmployeeService.findById(employeeId);
        Customer customer = iCustomerService.findById(customerId);
        Services villa = iService.findById(serviceId);
        // String startDate, String endDate, double deposit, Employee employee, Customer customer, Services
        //services
        Contract contract = new Contract(startDate, endDate, deposit, employee, customer, villa);
        iContract.createContract(contract);
        request.setAttribute("contract", contract);
        request.setAttribute("message",
                "update successful");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/contract/add-contract.jsp");
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
                showFormContract(request, response);
                break;
        }
    }

    private void showFormContract(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customer = iCustomerService.findAll();
        List<Employee> employees = iEmployeeService.findAll();
        List<Services> service = iService.findAll();
        request.setAttribute("customer", customer);
        request.setAttribute("employees", employees);
        request.setAttribute("service", service);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/contract/add-contract.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
