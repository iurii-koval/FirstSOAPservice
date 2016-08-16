package com.iko.javabrains;

import com.iko.javabrains.model.Product;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService",
        targetNamespace = "http://www.testmart.com")
public interface ProductCatalogInterface {

    @WebMethod
    boolean addProduct(String productCategory, String product);

    @WebMethod
    List<String> getProductCategories();

    @WebMethod
    List<String> getProducts(String category);

    @WebMethod
    List<Product> getProductsV2(String category);
    
}
