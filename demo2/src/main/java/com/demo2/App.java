package com.demo2;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Endpoint.publish("http://0.0.0.0:8080/TestServices/TestService", new TestService());
        System.out.println("App server started on port: 8080");
    }
}
