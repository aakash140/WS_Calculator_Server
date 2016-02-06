package com.java.ws.calculate;

import javax.jws.WebService;

@WebService(endpointInterface="com.java.ws.calculate.CalculatorIfc")
public class Calculator implements CalculatorIfc{

	public int add(int num1,int num2){
		return num1+num2;
	}

	public int sub(int num1,int num2){
		return num2-num1;
	}

	public int multiply(int num1, int num2){
		return num1*num2;
	}

	public float divide(int num1,int num2){
		return num2/num1;
	}
}