package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

		//digitar as notas 
		//contar o numero de notas

		//somar as notas
		// a partir do numero de ntoas tirar a m�dia

		
		double media=0;
		int numeroDeNotas=0;
		
		System.out.println("Digite o n�mero de notas:");
		int i=scan.nextInt();
		if(i<=1) {
			System.out.println("tem que ser no m�nimo duas notas:");
		}
		System.out.println("Digite as notas aq:");
	
		do {
			double notas=scan.nextDouble();
				
				if(notas>=0||notas<=10) {
				
				media=media+notas;
				i--;
				 numeroDeNotas++;
				}
				
				 if(notas>10 || notas<0) {
					 
					 media=media-notas;
					 System.out.println("vc digitou um valor incoerente");
					 return;
					 
				 }
		}
		while(i>=1);
		
		media = media / numeroDeNotas;
		
		System.out.println("Sua m�dia �:"+media);
		
	}
	

}
