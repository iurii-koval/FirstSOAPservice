package com.iko.javabrains;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ShopInfo {
    
    @WebMethod
    @WebResult(partName = "lookupOutput")
    public String getShopInfo(@WebParam(name = "lookupInput")String property) {
        String response = "invalid property name!";
        if ("shopName".equals(property)) {
            response = "Test Mart";
        } else if ("since".equals(property)) {
            response = "since 2016";
        }
        return response;
    }
    
}
