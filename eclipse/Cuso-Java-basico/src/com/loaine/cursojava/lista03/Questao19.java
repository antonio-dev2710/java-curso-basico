package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Tablea de preços ");
		double totalPrecos = 0;
		
		int qtdProdutos=50;
		for(int i=1; i<=qtdProdutos;i++) {
			double precos=1.99;
			totalPrecos=totalPrecos+precos;
			
			System.out.println(i+"-"+"R$"+String.format(" %.2f",totalPrecos ).replaceAll(",", "."));
			
		}
		
		
		
		
		
	}


	
	
}
