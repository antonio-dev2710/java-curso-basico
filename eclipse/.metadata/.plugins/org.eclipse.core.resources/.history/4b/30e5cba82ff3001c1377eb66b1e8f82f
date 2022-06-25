package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int[] A = new int[10];
		int par=0;
		int impar=0;
		double media=0;
		int numero;
		System.out.print("Digite um  número :");
		for(int i=0; i<A.length;i++) {
			A[i]=scan.nextInt();
			numero=A[i];
			A[i]%=2;
			
			if(A[i]==0) {
				 par++;
			}
			else {
				media=media+numero;
				 impar++;
			}
					
		}
		System.out.println("Par "+(par*100)/10+"%");
		System.out.println("Impar: "+(impar*100)/10+"% "+" media: "+ media/impar);
	}

}
