package controller;

import model.bean.User;
import model.service.IUserService;
import model.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"", "/user"})
public class UserServlet extends HttpServlet {
    IUserService iUserService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request, response);
                break;
            case "edit":
                updateUser(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;

            case "search":
            default:
                showUser(request, response);
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newUser = new User(id, name, email, country);
        iUserService.createUser(newUser);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iUserService.deleteUser(id);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        boolean check = iUserService.update(user);

        if (check) {
            request.setAttribute("message", "update thành công");

        } else {
            request.setAttribute("message", "udate không thành công");
        }
        request.setAttribute("users", user);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user/update-user.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userLists = iUserService.findAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user/list-user.jsp");
        request.setAttribute("userLists", userLists);
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
                FormCreate(request, response);
                break;
            case "edit":
                FormUpdate(request, response);
                break;
            case "delete":
                FormDelete(request, response);
                break;
            case "search":
                FormSearch(request, response);
                break;
            case "sort":
                FormSort(request, response);
                break;
            default:
                showUser(request, response);
                break;
        }
    }

    private void FormSort(HttpServletRequest request, HttpServletResponse response) {

        List<User> userLists;
        userLists = iUserService.sort();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user/list-user.jsp");
        request.setAttribute("userLists", userLists);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void FormSearch(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("country");
        List<User> userLists;
        userLists = iUserService.search(country);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user/list-user.jsp");
        request.setAttribute("userLists", userLists);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void FormCreate(HttpServletRequest request, HttpServletResponse response) {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user/create.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void FormDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User users = iUserService.findById(id);
        RequestDispatcher requestDispatcher = null;
        request.setAttribute("users", users);
        if (users == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {

            requestDispatcher = request.getRequestDispatcher("/user/delete.jsp");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void FormUpdate(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User users = iUserService.findById(id);
        request.setAttribute("users", users);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user/update-user.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
