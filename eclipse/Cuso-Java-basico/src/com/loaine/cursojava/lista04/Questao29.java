package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		int [] B=new int[A.length];
		int [] C=new int[A.length*2];
		int i=0;
		int g=0;
		int j=10;
		
		System.out.println("digite os n?mero A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		System.out.println("digite os n?mero B : ");
		for(i=0; i<A.length;i++) {
			
			B [i]=scan.nextInt();
			
		}
		
		
		for(i=0; i<A.length;i++) {
			C [i] = A [i];
			
			C[A.length+i]=B[i];
			
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
		
		System.out.println(" ");
		
		System.out.print("Vetor C =");
		for( i=0; i<C.length;i++) {
			
			System.out.print(C[i]+" ");
						
		}

	}
}
