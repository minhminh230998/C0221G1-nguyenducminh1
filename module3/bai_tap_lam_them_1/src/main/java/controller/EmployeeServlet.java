package controller;

import model.bean.Employee;
import model.service.IEmployeeService;
import model.service.impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"", "/employee"})
public class EmployeeServlet extends HttpServlet {
    IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            case "edit":
                editEmployee(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                break;
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Employee> employeeList = iEmployeeService.findByName(name);
        RequestDispatcher requestDispatcher = null;
        if (employeeList.size() == 0) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
            request.setAttribute("employeeLists", employeeList);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iEmployeeService.deleteEmployee(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");

        Employee employee = new Employee(id, name, birthday);
        String[] msgArr = iEmployeeService.editEmployee(employee);
        RequestDispatcher requestDispatcher = null;
        if (msgArr.length == 0) {
            request.setAttribute("message", "update successful");
            request.setAttribute("employee", employee);
            requestDispatcher = request.getRequestDispatcher("/employee/add.jsp");
        } else {
            request.setAttribute("msgName", msgArr[0]);
            request.setAttribute("msgBirthday", msgArr[1]);
            request.setAttribute("employee", employee);
            requestDispatcher = request.getRequestDispatcher("/employee/add.jsp");
        }


        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");

        Employee employee = new Employee(name, birthday);
        String[] msgArr = iEmployeeService.createEmployee(employee);
        RequestDispatcher requestDispatcher = null;
        if (msgArr.length == 0) {
            request.setAttribute("message", "update successful");
            request.setAttribute("employee", employee);
            requestDispatcher = request.getRequestDispatcher("/employee/add.jsp");
        } else {
            request.setAttribute("msgName", msgArr[0]);
            request.setAttribute("msgBirthday", msgArr[1]);
            request.setAttribute("employee", employee);
            requestDispatcher = request.getRequestDispatcher("/employee/add.jsp");
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
                showEmployeeList(request, response);
                break;
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/add.jsp");
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
        Employee employee = iEmployeeService.findById(id);
        RequestDispatcher requestDispatcher = null;
        if (employee == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("/employee/edit.jsp");
            request.setAttribute("employee", employee);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showEmployeeList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = iEmployeeService.findAll();

        request.setAttribute("employeeLists", employeeList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
