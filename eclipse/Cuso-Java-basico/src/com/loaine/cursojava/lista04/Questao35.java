package com.loaine.cursojava.lista04;

import java.util.Scanner;
//duvida
public class Questao35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		int i = 0;
	
		//2 3 5 7
		System.out.println("digite os n�mero A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		
		
		
		for(i=0; i<A.length;i++) {
			System.out.println("Analisando o numero = "+A[i]);
			
			for(int j=1; j<=A[i];j++) {
				
				if(A[i]%j==0 ) {
					
					System.out.println(j +" ");
					
				}
					
			}
					
		}
		
		
		
		
		
}
}
