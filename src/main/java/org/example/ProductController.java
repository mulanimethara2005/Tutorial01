package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")


public class ProductController {
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(id,"Laptop", 999.99);
    }


}
