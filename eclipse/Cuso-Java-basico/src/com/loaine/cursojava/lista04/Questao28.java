package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		int [] B=new int[A.length];
	
		int i=0;
		
		
		System.out.println("digite os n?mero A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		
		if(i==10) {
			i=0;
		}
		
		for(int j=9; j>=0;j--) {

			B[j]=A[i];
			
			i++;
		}
		
		System.out.print("Vetor A =");
		for( i=0; i<A.length;i++) {
			
			System.out.print(A[i]+" ");			
		}
		
		System.out.println(" ");
		
		System.out.print("Vetor B =");
		for( i=0; i<A.length;i++) {
			
			System.out.print(B[i]+" ");
						
		}
	

	}
}
