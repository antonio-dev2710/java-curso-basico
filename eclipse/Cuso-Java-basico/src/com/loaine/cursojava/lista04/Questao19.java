package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int[] A = new int[10];
		int idadeMaior=Integer.MIN_VALUE;
		int idadeMenor=Integer.MAX_VALUE;
		System.out.println("Digite um  n?mero :");
		
		for(int i=0; i<A.length;i++) {
			A[i]=scan.nextInt();
			
			if(A[i]<idadeMenor) {
				idadeMenor=A[i];
			}
			
			if(A[i]>idadeMaior) {
				idadeMaior=A[i];
			}
			
					
		}
		
		System.out.print("Vetor A =");
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
			
					
		}
		
		System.out.println(" ");
		
		System.out.println("Maior idade: "+idadeMaior+" anos");
		System.out.println("Maior idade: "+idadeMenor+" anos");
		
		
		
	}

}
