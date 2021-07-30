package controller;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.service.IDivision;
import model.service.IEducationDegree;
import model.service.IEmployeeService;
import model.service.IPosition;
import model.service.impl.DivisionImpl;
import model.service.impl.EducationDegreeImpl;
import model.service.impl.EmployeeService;
import model.service.impl.PositionImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = {"/employee"})
public class EmployeeServlet extends HttpServlet {
    IEmployeeService iEmployeeService=new EmployeeService();
    IPosition iPosition=new PositionImpl();
    IDivision iDivision=new DivisionImpl();
    IEducationDegree iEducationDegree=new EducationDegreeImpl();
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
                searchEmployee(request,response);
            default:
                break;
        }
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        List<Employee> employeeList=iEmployeeService.findByName(name);
        RequestDispatcher requestDispatcher=null;
        if(employeeList==null){
             requestDispatcher=request.getRequestDispatcher("/error.jsp");
        }else {
            request.setAttribute("employeeList",employeeList);
            requestDispatcher=request.getRequestDispatcher("/employee/search-employee.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        iEmployeeService.deleteEmployee(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducationDegree = Integer.parseInt(request.getParameter("idEducationDegree"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gioitinh");
        String email = request.getParameter("email");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        Position position=iPosition.findById(idPosition);
        EducationDegree educationDegree=iEducationDegree.findById(idEducationDegree);
        Division division=iDivision.findById(idDivision);
        Employee employee = new Employee(id,position, educationDegree, division, name, birthday, idCard, gender, salary,phoneNumber,email,address);
        boolean check = iEmployeeService.editEmployee(employee);
        if (check) {
            request.setAttribute("message", "update successful");
            request.setAttribute("employee", employee);
        } else {
            request.setAttribute("message", "\n" +
                    "update failed");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/edit-employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        int idPosition = Integer.parseInt(request.getParameter("position"));
        int idEducationDegree = Integer.parseInt(request.getParameter("education"));
        int idDivision = Integer.parseInt(request.getParameter("division"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gioitinh");
        String email = request.getParameter("email");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        Position position=iPosition.findById(idPosition);
        EducationDegree educationDegree=iEducationDegree.findById(idEducationDegree);
        Division division=iDivision.findById(idDivision);
        Employee employee = new Employee(id,position, educationDegree, division, name, birthday, idCard, gender, salary,phoneNumber,email,address);
        iEmployeeService.createEmployee(employee);
        request.setAttribute("message", "update successful");
        request.setAttribute("employee", employee);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/add-employee.jsp");
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
                showEmployee(request, response);


            default:
                showEmployeeList(request, response);

                break;
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positions=iPosition.findAll();
        List<Division> divisions=iDivision.findAll();
        List<EducationDegree> educationDegrees=iEducationDegree.findAll();
        request.setAttribute("positions", positions);
        request.setAttribute("divisions", divisions);
        request.setAttribute("educationDegrees", educationDegrees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/add-employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        String id =request.getParameter("id");
        Employee employee = iEmployeeService.findById(id);
        List<Position> positions=iPosition.findAll();
        List<Division> divisions=iDivision.findAll();
        List<EducationDegree> educationDegrees=iEducationDegree.findAll();
        request.setAttribute("divisions", divisions);
        request.setAttribute("educationDegrees", educationDegrees);
        RequestDispatcher requestDispatcher = null;
        request.setAttribute("positions",positions);
        if (employee == null) {

            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("/employee/edit-employee.jsp");
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

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showEmployeeList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = iEmployeeService.findAll();

        request.setAttribute("employeeLists", employeeList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/list-employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
