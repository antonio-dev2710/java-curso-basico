package com.loaine.cursojava.aula35;

public class MinhaCalculadora {
	//sobrecarga, precisa mudar algo especifico porem o nome
	//do metodo ? o mesmo
	//? um titpo de polimorfimos de compila??o
	
	public static int fatorialNR(int num1) {
		
		if( num1 == 0) {
			return 1;
		}
		
		int total= 1;

			for(int i=num1;i>1;i--) {
				total*=i;
			
				
		}
		
		
		return total;
		
	}
	
	//metodos recursivos s?o utilizados em estrutura de dados
public static int fatorial(int num1) {
	
	//ponto de parada
	if( num1 == 0) {
		return 1;
	}
		return num1*fatorial(num1-1);
		
	}
}
