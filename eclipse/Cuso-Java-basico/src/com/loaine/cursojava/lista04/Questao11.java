package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int[] A = new int[5];
		int aux=0;
		int par=0;
		int impar=0;
		int i;
		System.out.print("Digite um  n?mero :");
		for(i=0; i<A.length;i++) {
			A[i]=scan.nextInt();
			
			A[i]=A[i]+aux;
			aux=A[i];
			if(A[i]%5==0) {
				System.out.println("? divisivel por 5=" +A[i]);
				
			}
			else {
				System.out.println("n?o ? divisivel por 5= "+A[i]);
			}
			
					
		}
		
	}

}
