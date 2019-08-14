package edu.mum.wap.controller;

import com.google.gson.Gson;
import edu.mum.wap.dao.ShoppingCartDAO;
import edu.mum.wap.dao.impl.ShoppingCartDAOImpl;
import edu.mum.wap.model.CartItem;
import edu.mum.wap.model.ShoppingCart;
import edu.mum.wap.util.ShoppingCartUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//Alican
public class ShoppingCartController extends HttpServlet {

    private ShoppingCartDAO shoppingCartDAO = new ShoppingCartDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }
}
