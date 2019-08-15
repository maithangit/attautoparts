package att.group.manager;

import att.group.dao.ProductDAO;
import att.group.dao.ShoppingCartDAO;
import att.group.model.CartItem;
import att.group.model.Product;
import att.group.model.ShoppingCart;

import java.util.List;

public class ShoppingCartManager implements ShoppingCartDAO {

    private ProductDAO productDAO = new ProductManager();

    private ShoppingCart shoppingCart = new ShoppingCart();

    @Override
    public void addToCart(int id) {

        Product item = productDAO.getProductDB().get(id);
        List<CartItem> cartItems = shoppingCart.getItems();
        boolean addDuplicatedItem = false;

        for(CartItem e: cartItems){
            if(e.getItem() == item) {
                e.setQuantity(e.getQuantity() + 1);
                addDuplicatedItem = true;
            }
        }
        if(!addDuplicatedItem)
            shoppingCart.getItems().add(new CartItem(item, item.getPrice(), 1));
    }

    @Override
    public void removeFromCart(int product) {

    }

    @Override
    public void setCart(ShoppingCart cart) {
        if(cart != null)
            this.shoppingCart = cart;
        else
            this.shoppingCart = new ShoppingCart();
    }

    @Override
    public ShoppingCart getCart() {
        return this.shoppingCart;

    }
}
