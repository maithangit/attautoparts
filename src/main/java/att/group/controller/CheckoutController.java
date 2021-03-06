package att.group.controller;

import com.google.gson.Gson;
import att.group.dao.ShoppingCartDAO;
import att.group.dao.UserDAO;
import att.group.manager.ShoppingCartManager;
import att.group.model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CheckoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    Gson mapper = new Gson();
    private ShoppingCartDAO shoppingCartDao = new ShoppingCartManager();;
    private UserDAO userDAO;
    private ShoppingCart shoppingCart;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(true);
        if(session != null && session.getAttribute("shoppingCart") != null) {
            shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
        } else {
            session.setAttribute("shoppingCart", shoppingCart);
        }
        userDAO = (UserDAO)getServletContext().getAttribute("userDAO");
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getSession().getAttribute("user_info") == null) {
            req.getSession().setAttribute("err_msg_checkout", "You need to log in or register first.");
        }
        else
        {
            User user = userDAO.getUserByUsername((String) req.getSession().getAttribute("user_info"));
            req.setAttribute("user", user);
        }

        req.getRequestDispatcher("checkout.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getParameter("order") != null){
            Order order = mapper.fromJson(req.getParameter("order"), Order.class);
            User user = userDAO.getUserByUsername(req.getSession().getAttribute("user_info").toString());
            order.setUserId(user.getId());
            List<OrderItem> orderItems = new ArrayList<>();
            for(CartItem cart: shoppingCart.getItems()){
                OrderItem orderItem = new OrderItem(UUID.randomUUID().toString(), cart.getQuantity(), cart.getItem());
                orderItems.add(orderItem);
            }
            order.setOrderItems(orderItems);

            req.getSession().setAttribute("shoppingCart", null);
            req.setAttribute("numItems", 0);
            shoppingCart = null;
        }
        resp.getWriter().print("success");
    }
}
