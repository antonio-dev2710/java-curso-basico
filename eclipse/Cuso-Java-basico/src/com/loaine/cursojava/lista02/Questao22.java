package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		System.out.print("Digite um n�mero: ");
		double numero=scan.nextDouble();
		double divisao = numero%1;
		
		
	
		if(divisao==1) {
		System.out.print("N�mero Decimal ");
	
		}
		else {
			System.out.print("N�mero Inteiro ");
			
		}
	}


	
	
}
