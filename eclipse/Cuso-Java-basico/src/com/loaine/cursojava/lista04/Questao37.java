package com.loaine.cursojava.lista04;

import java.util.Scanner;
//duvida
public class Questao37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[15];
		int [] B=new int[A.length];
		int i = 0;
		int posB=0;
		int posA=0;
		int fatorial=0;
		
		//2 3 5 7
		System.out.println("digite os n?mero A : ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
		}
		
		
		System.out.print("Vetor A =");
		for(i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
					
		}
		
		System.out.println("  ");
		
		for(i=0; i<A.length;i++) {
			fatorial=A[i];
			for(int aux=A[i]; aux>1;aux--) {
				
				fatorial=fatorial*(aux-1);
			}
			B[posB]=fatorial;
			posB++;
		}
		
		System.out.println("  ");
		System.out.print("Fatorial de A =");
		for(i=0; i<A.length;i++) {
			System.out.print(B[i]+" ");
					
		}
		
		
}
}
