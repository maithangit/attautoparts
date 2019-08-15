package att.group.dao;

import att.group.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductDAO {
    List<Product> findAllProducts();
    List<Product> findBestSellerProducts();
    Map<Integer, Product> getProductDB();
    Product getProductDetailsById(int id);
}
