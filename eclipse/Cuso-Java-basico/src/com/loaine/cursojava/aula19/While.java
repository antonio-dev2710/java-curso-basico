package com.loaine.cursojava.aula19;

public class While {

	public static void main(String[] args) {
		int i = 1;//contador
		
		int max=10;
		
		
		System.out.println("contando at? "+ max);	
		
		while(i<=max) {
			System.out.println("contando "+i);
			i++;//i=i+1;i+=1
		}
				
		System.out.println("contando "+i);
	}

}
