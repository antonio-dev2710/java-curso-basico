package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		double media=0;
		int numeroDeIdades=0;
		double idade=0;
		
		System.out.println("Digite o n�mero de pessoas:");
		int i=scan.nextInt();
		if(i<=1) {
			System.out.println("tem que ser no m�nimo duas idades:");
		}
		System.out.println("Digite as idades aq:");
	
		do {
			 idade=scan.nextDouble();
				
				
				
				media=media+idade;
				i--;
				 numeroDeIdades++;
				
				
					 
					
				
		}
		while(i>=1);
		
		media = media / numeroDeIdades;
		
		System.out.println("Sua m�dia �:"+idade);
		
		if(media>=0 && media<=25) {
			System.out.println("Jovem");
		}
		
		else if(media>=26 && media<=60) {
			System.out.println("Adulta");
		}
		
		else {
			System.out.println("Coroa");
		}
		
	}

}
