package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		double precoPao=0.18;
		System.out.println("Preco do p�o: "+"R$"+precoPao);
		
		
		System.out.println("Tablea de pre�os ");
		double totalPrecos = 0;
		
		int qtdProdutos=50;
		for(int i=1; i<=qtdProdutos;i++) {
			
			totalPrecos=totalPrecos+precoPao;
			
			System.out.println(i+"-"+"R$"+String.format(" %.2f",totalPrecos ).replaceAll(",", "."));
			
		}

			}

	
}
