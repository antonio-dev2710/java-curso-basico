package com.loaine.cursojava.lista05;

import java.util.Random;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int[] [] matriz=new int[3][3];
		int[] [] matrizPar=new int[3][3];
		int[] [] matrizImpar=new int[3][3];
		int i=0, j=0;
		
		
		int colunaB=0;
		int qtdPar=0;
		int qtdImpar=0;
		int colunaC=0;
		 Random gerador = new Random();
		for( i =0;i<matriz.length;i++) {
			
			for( j =0;j<matriz[i].length;j++) {
				
				
				 
				matriz[i][j]= gerador.nextInt(200);
				
					if(matriz[i][j]%2==0) {
						if(colunaB==3) {
							colunaB=0;
						}
						matrizPar[i][colunaB]=matriz[i][j];
						colunaB++;
						qtdPar++;
					}
					else {
						if(colunaC==3) {
							colunaC=0;
						}
						matrizImpar[i][colunaC]=matriz[i][j];
						colunaC++;
						qtdImpar++;
					}
			}
		}
		
		
	
		System.out.print("Matriz =");
		System.out.println(" ");
		for( i=0; i<matriz.length;i++) {
			System.out.println(" ");
			for( j =0;j<matriz[i].length;j++) {
			
			System.out.print(matriz[i][j]+" ");			
		}
		}
		
		System.out.println(" ");
		
		System.out.print("Matriz par =");
		System.out.println(" ");
		for( i=0; i<matriz.length;i++) {
			System.out.println(" ");
			for( colunaB =0;colunaB<matriz[i].length;colunaB++) {
				
				System.out.print(matrizPar[i][colunaB]+" " );
			}
			
						
		}
		System.out.println(" " );
		System.out.print("Quantidade:"+qtdPar );
		System.out.println(" " );
		
		System.out.print("Matriz Impar =");
		System.out.println(" ");
		for( i=0; i<matriz.length;i++) {
			System.out.println(" ");
			for( colunaC =0;colunaC<matriz[i].length;colunaC++) {
				System.out.print(matrizImpar[i][colunaC]+" " );		
			}
			
					
		}
		System.out.println(" " );
		System.out.println("Quantidade:"+qtdImpar );
	}
	

}
