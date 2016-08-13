package com.iko.javabrains;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService
public class ProductCatalog {
    
    public List<String> getProductCategories() {
        List<String> productCategories = new ArrayList<>();
        productCategories.add("books");
        productCategories.add("music");
        productCategories.add("moovies");
        return productCategories;
    }
    
}
