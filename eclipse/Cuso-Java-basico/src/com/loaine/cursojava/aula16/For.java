package com.loaine.cursojava.aula16;

public class For {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++ ){
			System.out.println("contando "+i);
		}	
	;
		for(int i=5; i>=0; i-- ){
			System.out.println("contando "+i);
		}			
		
		
		for(int i=0 ,j=10; i<j; i++,j--){
			System.out.println("I: "+i+"J: "+j);
		}
		
		//Partes ausentes 
		int i=0;
		for(; i<10;) {
			System.out.println("i tem valor: "+ i);
			i+=2;
		}
		
		//loop infinito
		//for(;;);
		
		// loop de corpo vazio
		
		int soma = 0;
		for(i = 1; i<6; soma += i++);
		System.out.println("Soma: "+ soma);
		
	}

}
