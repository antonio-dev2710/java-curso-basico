package com.loaine.cursojava.lista05;

import java.util.Random;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int[] [] numeros=new int[10][10];
		int maior5=Integer.MIN_VALUE;
		int menor5=Integer.MAX_VALUE;
		int maior7=Integer.MIN_VALUE;
		int menor7=Integer.MAX_VALUE;
		int i=0;
		int j=0;
		int linha5=0;
		int coluna7=0;
		
		for( i =0;i<numeros.length;i++) {
			
			for( j =0;j<numeros[i].length;j++) {
				
				 Random gerador = new Random();
				 
				numeros[i][j]= gerador.nextInt(10);
				
					if(i==5) {
						if(numeros[i][j]>maior5) {
							maior5=numeros[i][j];
							linha5=i;
							
						
							}
						if(numeros[i][j]<menor5) {
							menor5=numeros[i][j];
							linha5=i;
							
							
							}
					
					
					}
					
					if(j==7) {
						if(numeros[i][j]>maior7) {
							maior7=numeros[i][j];
							coluna7=j;
							}
						
						if(numeros[i][j]<menor7) {
							menor7=numeros[i][j];
							coluna7=j;
							}
						
					}
			}
		}
		
		System.out.println("O maior n?mero ?: "+ maior5+", O menor n?mero ?: "+menor5 +" linha: "+linha5 );
	
		System.out.println("O maior n?mero ?: "+ maior7+", O menor n?mero ?: "+menor7 +" coluna "+coluna7);
	}
	

}
