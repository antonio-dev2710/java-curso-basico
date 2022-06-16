package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);

		int media=0;
		double totalGasto=0;
		
		System.out.println("Digite o número de turmas:");
		
		int qtdCds=scan.nextInt();
		
for(int i=0;i<qtdCds;i++) {
	
	System.out.println("Quanto foi gasto nesse cd:");
	
	double gastoCds=scan.nextDouble();
	
	totalGasto=totalGasto+gastoCds;
	
	

	
}		
//media
totalGasto=totalGasto/qtdCds;
System.out.println("media :"+totalGasto);
	}


	
	
}
