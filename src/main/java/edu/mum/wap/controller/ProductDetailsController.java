package edu.mum.wap.controller;

import edu.mum.wap.dao.ProductDAO;
import edu.mum.wap.dao.impl.ProductDAOImpl;
import edu.mum.wap.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Thang Mai
public class ProductDetailsController extends HttpServlet {
    private ProductDAO productDAO = new ProductDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
