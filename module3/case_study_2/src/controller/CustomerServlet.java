package controller;

import model.bean.customer.Customer;
import model.service.ICustomerService;
import model.service.impl.CustomerServiceimpl;

import javax.print.DocFlavor;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    ICustomerService iCustomerService = new CustomerServiceimpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "search":
                searchCustomer(request,response);
            default:
                break;
        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Customer> customerList = iCustomerService.findByName(name);
        RequestDispatcher requestDispatcher = null;
        if (customerList == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {

            request.setAttribute("customerLists", customerList);

            requestDispatcher=request.getRequestDispatcher("/customer/search-customer.jsp");

        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int idType = Integer.parseInt(request.getParameter("typeId"));
        int idCard = Integer.parseInt(request.getParameter("idCard"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gioitinh");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");

        Customer customer = new Customer(id, idType, name, birthday, gender, idCard, phoneNumber, email, address);
        boolean check = iCustomerService.editCustomer(customer);
        if (check) {
            request.setAttribute("message", "Update thành công");
            request.setAttribute("customer", customer);
        } else {
            request.setAttribute("message", "Update không thành công");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer/edit-customer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iCustomerService.deleteCustomer(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int idType = Integer.parseInt(request.getParameter("typeId"));
        int idCard = Integer.parseInt(request.getParameter("idCard"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gioitinh");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        Customer customer = new Customer(idType, name, birthday, gender, idCard, phoneNumber, email, address);
        iCustomerService.createCustomer(customer);
        request.setAttribute("message", "update thành công");
        request.setAttribute("customer", customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer/add-customer.jsp");
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
            case "delete":
                showFormDelete(request, response);
                break;
            case "show":
                showCustomer(request, response);
            default:
                showCustomerList(request, response);
                break;
        }
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.findById(id);
        RequestDispatcher requestDispatcher = null;
        if (customer == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {

            request.setAttribute("customer", customer);

                requestDispatcher=request.getRequestDispatcher("/customer");

        }
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
        Customer customer = iCustomerService.findById(id);
        RequestDispatcher requestDispatcher = null;
        if (customer == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("/customer/edit-customer.jsp");
            request.setAttribute("customer", customer);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {

    }


    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer/add-customer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = iCustomerService.findAll();
        request.setAttribute("customerLists", customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer/list-customer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
