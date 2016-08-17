package com.iko.javabrains;

import com.iko.javabrains.business.ProductServiceImpl;
import com.iko.javabrains.model.Product;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "com.iko.javabrains.ProductCatalogInterface",
        portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
    
    ProductServiceImpl productService = new ProductServiceImpl();
    
    @Override
    public List<String> getProductCategories() {
        return productService.getProductCategories();
    }
    
    @Override
    public List<String> getProducts(String category) {
        return productService.getProducts(category);
    }
    
    @Override
    public List<Product> getProductsV2(String category){
        return productService.getProductsV2(category);
    }
    
    @Override
    public boolean addProduct(String productCategory, String product) {
        return productService.addProduct(productCategory, product);
    }
    
}
