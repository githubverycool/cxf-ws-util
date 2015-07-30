package com.server.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.swing.Spring;

import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import com.server.IUserService;

@WebService(endpointInterface="com.server.IUserService",serviceName="UserService",portName="UserServicePort")
@SOAPBinding(style=Style.RPC)
public class UserServiceImpl  implements IUserService {

	@Override
	public String getSuccess(int i) {
		return "success:" + i;
	}
	
    public static void main(String[] args) {  
        System.out.println("Server is starting...");  
        javax.xml.ws.Endpoint.publish("http://localhost:8080/cxf-ws-util/userservice", new UserServiceImpl());
        System.out.println("Server is started...");  
    }  

}
