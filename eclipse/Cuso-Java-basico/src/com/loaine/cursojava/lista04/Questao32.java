package com.loaine.cursojava.lista04;

import java.util.Scanner;
//duvida
public class Questao32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[5];
		int [] B=new int[A.length];
	
		
		int i=0;
		int posA;
		int tabuada = 0;
		int max = 10;
		System.out.println("digite os n�mero A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		
		
		for(i=0; i<A.length;i++) {
			
			System.out.print("TABUADA de: "+A[i]);
			System.out.println(" ");
			for(posA=0; posA<max; posA++) {
				 
					tabuada=A[i]*posA;
					System.out.println(A[i]+"X"+posA+" = "+tabuada);
					
			}
		
		}	
		

	
}
}
