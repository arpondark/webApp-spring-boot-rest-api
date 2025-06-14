package com.arpon.webApp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arpon.webApp.models.Product;
@Service
public class ProductService {
    List<Product> products =new ArrayList<>( Arrays.asList(new Product(101, "iphone", 5000), new Product(102, "iphone", 5000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductByID(int prodId) {
        return products.stream().filter(p->p.getProdId() == prodId).findFirst().orElse(new Product(100,"error",0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
    for (int i = 0; i < products.size(); i++) {
        Product p = products.get(i);
        if (p.getProdId() == product.getProdId()) {
            products.set(i, product);
            return;
        }
    }
    }

    public void deleteProduct(int id) {
        products.removeIf(p->p.getProdId() == id);
        
    }
}
