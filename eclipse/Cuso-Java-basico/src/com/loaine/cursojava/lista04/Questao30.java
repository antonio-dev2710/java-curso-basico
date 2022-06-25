package com.loaine.cursojava.lista04;

import java.util.Scanner;
//duvida
public class Questao30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[20];
		int [] B=new int[A.length];
		int [] C=new int[A.length];
		
		int i=0;
		int posB=0;
		int posC=0;
		System.out.println("digite os número A : ");
		for(i=0; i<B.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		
		
		for(i=0; i<A.length;i++) {
			if(A [i]%2==0) {
				B [posB]=A[i];
				
				posB++;
			}
			else {
				C [posC]=A[i];
				posC++;
			}
			
		}
		
		
		
		System.out.print("Vetor A =");
		for( i=0; i<A.length;i++) {
			
			System.out.print(A[i]+" ");			
		}
		
		System.out.println(" ");
		
		System.out.print("Vetor B =");
		for( i=0; i<posB;i++) {
			
			System.out.print(B[i]+" ");
						
		}
System.out.println(" ");
		
		System.out.print("Vetor C =");
		for( i=0; i<posC;i++) {
			
			System.out.print(C[i]+" ");
						
		}
		

	
}
}
