package com.arpon.webApp.controller;

import com.arpon.webApp.models.Product;
import com.arpon.webApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductByid(@PathVariable int prodId) {
        return productService.getProductByID(prodId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "added successfully";
    }
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return "updated successfully";
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "deleted successfully";
    }

}
