package com.demo2;

import java.util.Base64;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ConverterService implements IConverterService{

    @Override
    @WebMethod
    public String EncodeBase64(String value) {
        return new String(Base64.getEncoder().encode(value.getBytes()));
    }
    
    @Override
    @WebMethod
    public String DecodeBase64(String value) {
        return new String(Base64.getDecoder().decode(value));
    }
}
