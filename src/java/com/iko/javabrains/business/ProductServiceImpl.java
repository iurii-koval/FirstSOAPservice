package com.iko.javabrains.business;

import com.iko.javabrains.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
    
    List<String> books = new ArrayList<>();
    List<String> music = new ArrayList<>();
    List<String> moovies = new ArrayList<>();
    
    
    public List<String> getProductCategories() {
        List<String> productCategories = new ArrayList<>();
        productCategories.add("books");
        productCategories.add("music");
        productCategories.add("moovies");
        return productCategories;
    }
    
    public List<Product> getProductsV2(String priductCategory) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("oca 8", "421", 45.45));
        products.add(new Product("clean code", "532", 50.99));
        return products;
    }
    
    public List<String> getProducts(String productCategory) {
        switch(productCategory.toLowerCase()) {
            case "books" :
                return books;
            case "music" :
                return music;
            case "moovies" : 
                return moovies;
            default:
                return null;
        }       
    }
    
    public boolean addProduct(String productCategory, String product) {
        switch(productCategory.toLowerCase()) {
            case "books" :
                books.add(product);
                break;
            case "music" :
                music.add(product);
                break;
            case "moovies" :
                moovies.add(product);
                break;
            default:
                return false;                
        }
        return true;
    }
    
    public ProductServiceImpl() {
        books.add("7 habits");
        books.add("the godfather");
        books.add("oca java 8");
        
        music.add("Damien Jurado");
        music.add("Limp Bizkit");
        music.add("The Killers");
        
        moovies.add("snatch");
        moovies.add("revolver");
        moovies.add("moneyball");              
    }
    
}
