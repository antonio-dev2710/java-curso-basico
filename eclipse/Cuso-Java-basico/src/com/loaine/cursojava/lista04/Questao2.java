package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int[] A=new int[8];
		
		int[] B=new int[A.length];
		
		
		for(int i=0;i<A.length;i++) {
			System.out.println("Digite o valor: ");
			A[i]=scan.nextInt();
			
			B[i]=A[i]*2;
				System.out.println("O valor de B �: "+B[i]+"�ndice"+i);
				
		}
		
		
		
	}
	

}
