package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] A=new int[10];
		
		int[] B=new int[A.length];
		
		int[] C=new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			System.out.println("Digite dois valores: ");
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
			C[i]=A[i]*B[i];
				System.out.println("O valor de B ?: "+C[i]+" ?ndice "+(i+1));
				
		}
		
		
	}

	

	

}
