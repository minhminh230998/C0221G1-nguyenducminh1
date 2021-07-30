package controller;

import model.bean.Product;
import model.service.ProductService;
import model.service.impl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/product"})

public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> product = productService.findAll();
        request.setAttribute("products", product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "update":
                updateProduct(request, response);
                break;
            case "remove":
                removeProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;

            default:
                listProduct(request, response);
                break;

        }

    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String describe = request.getParameter("describe");
        String producer = request.getParameter("producer");
        productService.update(id, new Product(id, name, price, describe, producer));
        request.setAttribute("message", "update thành công");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/product/update.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void removeProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.remove(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String describe = request.getParameter("describe");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, describe, producer);
        productService.create(id, product);
        try {
            response.sendRedirect("/product");
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
            case "view":
                break;
            case "create":
                formCreateProduct(request, response);
                break;
            case "update":
                formUpdateProduct(request, response);
                break;
            case "remove":
                formRemoveProduct(request, response);
                break;
            case "display":
                formDisplay(request, response);
                break;

            default:
                listProduct(request, response);
                break;

        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("search");
        List<Product> products = productService.search(name);
        RequestDispatcher requestDispatcher=null;
        if(products.size()==0){
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        }else {
            request.setAttribute("products", products);
            requestDispatcher = request.getRequestDispatcher("/view/product/search.jsp");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formDisplay(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product products = productService.findById(id);
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/product/display.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formUpdateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product products = productService.findById(id);
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/product/update.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formRemoveProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product products = productService.findById(id);
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/product/remove.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void formCreateProduct(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
