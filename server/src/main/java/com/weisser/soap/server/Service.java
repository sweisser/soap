package com.weisser.soap.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by stefan on 03.05.17.
 */
@WebService
public class Service {
    @WebMethod
    public String method1(String input) {
        return "Hello SOAP!";
    }

}
