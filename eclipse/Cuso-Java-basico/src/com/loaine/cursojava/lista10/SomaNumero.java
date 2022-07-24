package com.loaine.cursojava.lista10;

public class SomaNumero {
	
	
	public static int somar(int numero){
	
		if(numero==0) {
			return 0;
		}
		
		return numero+somar( numero-1);
	}
	
}
