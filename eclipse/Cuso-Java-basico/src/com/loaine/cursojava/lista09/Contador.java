package com.loaine.cursojava.lista09;

public class Contador {
	
	static int soma;

	//incrementar
	
	static int incrementar(int num) {
		soma+=num;
		return soma;
	}
	
	static int retornar(int num,int max) {
		
		num=soma;
		
		for(int i = num; i>max;i--) {
			soma--;
		}
		
	
	return soma;
}
	
	static int zerar(int num) {
		
		return soma=0;
	}
	
}
