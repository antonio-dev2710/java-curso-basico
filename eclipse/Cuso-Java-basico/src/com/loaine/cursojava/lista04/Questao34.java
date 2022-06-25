package com.loaine.cursojava.lista04;

import java.util.Scanner;
//duvida
public class Questao34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		int i = 0;
	
		//2 3 5 7
		System.out.println("digite os número A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		
		
		System.out.print("Vetor A =");
		for(i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
					
		}
		
		System.out.println("  ");
		
		System.out.print("Vetor A-PAR =");
		for(i=0; i<A.length;i++) {
			
				if(A[i]%2==0 ) {
					
					System.out.print(A[i]+" ");
					
				}
					
			}
		
}
}
