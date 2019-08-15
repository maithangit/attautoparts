package att.group.controller;

import att.group.dao.ProductDAO;
import att.group.manager.ProductManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Thang Mai
public class ProductListController extends HttpServlet {

    private ProductDAO productDAO = new ProductManager();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("newProducts", productDAO.findAllProducts());
        req.setAttribute("bestSeller", productDAO.findBestSellerProducts());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("product.jsp");
        requestDispatcher.forward(req, resp);
    }
}
