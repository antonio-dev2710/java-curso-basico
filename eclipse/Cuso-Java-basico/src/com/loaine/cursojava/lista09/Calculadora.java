package com.loaine.cursojava.lista09;

public class Calculadora {
	
	
//m�todos
	
	public static double somar(double num1, double num2) {
		
		return (num1+num2);
		
	}
	
public static double subtrair(double num1, double num2) {
		
		return (num1-num2);
		
	}
public static double multiplicar(double num1, double num2) {
	
	return (num1*num2);
	
}
public static double dividir(double num1, double num2) {
	
	return (num1/num2);
	
}
public static double elevar(double num1, double n) {
	
	return Math.pow(num1,n);
	
}
public static int fatorar(int num1) {
	int total= 1;
	
	
	if(num1>0) {
		for(int i=num1;i>1;i--) {
			total*=i;
		}
			
	}
	
	
	return total;
	
}



}
