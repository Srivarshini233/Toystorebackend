package com.max.quizspring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.quizspring.model.Product;

@RestController()
@RequestMapping("/api/users")
public class ProductController {
    @Autowired
    private com.max.quizspring.service.ProductService uservice;

    // <--------------------------------->
    
    @PostMapping("/addproducts")
    public Product Addproduct(@RequestBody Product product) {
        return uservice.addproducts(product);
    }
    @GetMapping("/getproduct")
    public List<Product> GetProduct() {
        return uservice.getproduct();
    }
    @DeleteMapping("/deleteproduct/{id}")
    public String DeleteProduct(@PathVariable Long id) {
        return uservice.deleteproduct(id);
    }
}