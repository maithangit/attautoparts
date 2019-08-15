package att.group.controller;

import att.group.dao.ProductDAO;
import att.group.manager.ProductManager;
import att.group.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Thang Mai
public class ProductDetailsController extends HttpServlet {
    private ProductDAO productDAO = new ProductManager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramName = "id";
        String paramValue = request.getParameter(paramName);
        Product product = productDAO.getProductDetailsById(Integer.parseInt(paramValue));
        if (product != null){
            request.setAttribute("product", product);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("productdetails.jsp");
            requestDispatcher.forward(request, response);
        }
        else{
            request.setAttribute("error_product", "Incorrect product");
            request.getRequestDispatcher("productdetails.jsp").forward(request,response);
        }
    }
}
