package com.loaine.cursojava.aula16;

public class DoWhile {

	public static void main(String[] args) {
		int i = 1;//contador
		
		int max=15;
		
		
		System.out.println("contando at� "+ max);	
	//excuta o bloco de c�digo e dps avalia a expressao
		
		do {
			System.out.println("contando "+i);
			i++;//i=i+1;i+=1
		}while(i<max);
		System.out.println("contando "+i);	
		
	}
	

}
