package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] A=new int[5];
		
		int[] B=new int[A.length];
		
		
		System.out.println("Digite os valores: ");
		for(int i=0;i<A.length;i++) {
			
			A[i]=scan.nextInt();
			
			B[i]=A[i]%2;
			System.out.print(" A = "+A[i]+" ");
			System.out.print("<-->");
				System.out.print(" B = "+B[i]+" ");
				
		}
		
		
	}

	

	

}
