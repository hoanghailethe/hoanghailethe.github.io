package com.sessionShoppingCart.HW14.Repository;

import com.sessionShoppingCart.HW14.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ArrayList<Product> products;
    private long nextId = 1;
    public ProductRepository() {
        products = new ArrayList<>();
        nextId = 1;
        initData();
    }

    public List<Product> getAll() {
        return products;
    }

    public Optional<Product> findById(long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public long createProduct(Product product) {
        product.setId(nextId);
        nextId += 1;
        products.add(product);
        return nextId;
    }

    public void initData() {
        createProduct(new Product("hennessey", "Victoria Secret", 9000000, "hennessey.jpg"));
        createProduct(new Product("mclarenF1", "Sony", 4500000, "mclarenF1.jpg"));
        createProduct(new Product("mclarren", "Vinsmart", 4000000, "mclarren.jpg"));
        createProduct(new Product("noble", "Logitech", 3000000, "noble.jpg"));
        createProduct(new Product("pagani", "Logitech", 3000000, "pagani.jpg"));
        createProduct(new Product("porsche", "Logitech", 3000000, "porsche.jpg"));
        createProduct(new Product("redbugati", "Logitech", 3000000, "redbugati.jpg"));
        createProduct(new Product("saleen", "Logitech", 3000000, "saleen.jpg"));

    }

}
