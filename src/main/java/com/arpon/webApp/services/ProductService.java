package com.arpon.webApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpon.webApp.models.Product;
import com.arpon.webApp.repository.ProductRepo;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductByID(int prodId) {
        return repo.findById(prodId).orElseThrow(() -> new RuntimeException("Product not found with ID: " + prodId));
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
