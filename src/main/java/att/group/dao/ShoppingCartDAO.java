package att.group.dao;

import att.group.model.Product;
import att.group.model.ShoppingCart;

public interface ShoppingCartDAO {
    void addToCart(int id);
    void removeFromCart(int product);
    void setCart(ShoppingCart cart);
    ShoppingCart getCart();
}
