package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] A=new int[10];
		boolean par=true;
		System.out.println("digite um n�mero: ");
		for(int i=0; i<A.length;i++) {
			
			A [i]=scan.nextInt();
			if(A [i]%2==0 ) {
				System.out.println("par = "+par+" "+A[i]);
			}
			
			else {
				System.out.println("fim impar = "+A[i]);
				break;
			}
					
		}
		
		

		
		
		
	}

}
