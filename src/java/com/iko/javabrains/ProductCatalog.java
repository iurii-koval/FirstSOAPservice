package com.iko.javabrains;

import com.iko.javabrains.business.ProductServiceImpl;
import java.util.List;
import javax.jws.WebService;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService",
        targetNamespace = "http://www.testmart.com")
public class ProductCatalog {
    
    ProductServiceImpl productService = new ProductServiceImpl();
    
    public List<String> getProductCategories() {
        return productService.getProductCategories();
    }
    
    public List<String> getProducts(String category) {
        return productService.getProducts(category);
    }
    
    public boolean addProduct(String productCategory, String product) {
        return productService.addProduct(productCategory, product);
    }
    
}
