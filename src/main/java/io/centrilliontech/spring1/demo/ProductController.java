package io.centrilliontech.spring1.demo;

import io.centrilliontech.spring1.demo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return new Product(id, "Demo Product");
    }

}
