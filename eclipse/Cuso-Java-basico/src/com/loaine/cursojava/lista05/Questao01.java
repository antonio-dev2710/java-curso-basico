package com.loaine.cursojava.lista05;

import java.util.Random;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int[] [] numeros=new int[4][4];
		int maior=0;
		int i=0;
		int j=0;
		int posj=0;
		int posi=0;
		for( i =0;i<numeros.length;i++) {
			
			for( j =0;j<numeros[i].length;j++) {
				
				 Random gerador = new Random();
				 
				numeros[i][j]= gerador.nextInt(10);
				
				if(numeros[i][j]>=0&&numeros[i][j]<=9) {
				
			
					if(numeros[i][j]>maior) {
					maior=numeros[i][j];
					posi=i;
					posj=j;
					
				
				}
				
			}
			
			}
		}
		
		System.out.println("O maior numeor �: "+ maior+" linha "+posi+" coluna "+posj);
	
		
	}
	

}
