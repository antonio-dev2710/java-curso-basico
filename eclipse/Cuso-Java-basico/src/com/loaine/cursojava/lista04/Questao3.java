package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int[] A=new int[15];
		
		int[] B=new int[A.length];
		
		
		for(int i=0;i<A.length;i++) {
			System.out.println("Digite o valor: ");
			A[i]=scan.nextInt();
			
			B[i]=A[i]*A[i];
				System.out.println("O valor de B �: "+B[i]+" �ndice "+(i+1));
				
		}
		
		
	}
	

}
