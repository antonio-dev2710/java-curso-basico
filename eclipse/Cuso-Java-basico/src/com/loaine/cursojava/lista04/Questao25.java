package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		int i;
		int [] B=new int[A.length];
		System.out.println("digite um n�mero: ");
		for(i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			
			B[i] = (A[i]%2==0 )? 1 : 0;
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
