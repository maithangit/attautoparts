package att.group.manager;

import att.group.database.MockData;
import att.group.dao.ProductDAO;
import att.group.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductManager implements ProductDAO {
    @Override
    public List<Product> findAllProducts() {
        return new ArrayList<>(MockData.productDB.values());
    }

    @Override
    public List<Product> findBestSellerProducts() {
        return new ArrayList<>(MockData.bestSellerProducts.values());
    }

    @Override
    public Map<Integer, Product> getProductDB() {
        return MockData.productDB;
    }

    @Override
    public Product getProductDetailsById(int id) {
        return MockData.productDB.get(id);
    }
}
