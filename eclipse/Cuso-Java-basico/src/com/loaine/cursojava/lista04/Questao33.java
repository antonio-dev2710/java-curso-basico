package com.loaine.cursojava.lista04;

import java.util.Scanner;
//duvida
public class Questao33 {

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
			
				
				if(A[i]==2||A[i]==3||A[i]==5||A[i]==7 ) {
					System.out.println(" � primo- "+A[i]);
				}
				
				else if(A[i]%2 == 0 || A[i]%3 == 0 || A[i]%5 == 0 || A[i]%7 == 0 || A[i]==1) {
					System.out.println(" n�o primo- "+A[i]);
				}
				
				else {
					System.out.println(" � primo- "+A[i]);
				}
				
				
			}
			
	
}
}
