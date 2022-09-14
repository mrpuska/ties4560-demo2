package com.demo2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class TestService implements ITestService{

    @Override
    @WebMethod
    public int add(int a, int b) {
        return a+b;
    }
    
}
