package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		char [] B=new char[A.length];
	
		int i;
		
		
		System.out.println("digite os n?mero A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();

		}
		
		for(i=0; i<A.length;i++) {
	
			if(A [i]<7) {
				B[i]='a';
			}
			
			else if(A [i]==7) {
				B[i]='b';
			}
			else if(A [i]>7 && A [i]<10){
				B[i] =  'c';
			}
			else if(A [i]==10) {
				B[i] =  'd';
			}
			else {
				B[i] =  'e';
			}
			
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
