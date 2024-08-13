package com.max.quizspring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.quizspring.model.Product;
import com.max.quizspring.repo.ProductRepo;



@Service
public class ProductService {
    

    @Autowired
    private ProductRepo prepo;

  
    
    // <--------------------------->
    
    public List<Product> getproduct(){
        return prepo.findAll();
    }
    public Product addproducts(Product product){
        return prepo.save(product);
    }
    public String deleteproduct(Long id){
        prepo.deleteById(id);
        return "User Deleted Successfully" + id;
    }
}