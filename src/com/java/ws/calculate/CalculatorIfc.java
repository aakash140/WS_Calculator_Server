package com.java.ws.calculate;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorIfc {
	
	public int add(int num1,int num2);
	
	public int sub(int num1,int num2);
	
	public int multiply(int num1,int num2);
	
	@WebMethod(exclude=true)
	public float divide(int num1, int num2);
}