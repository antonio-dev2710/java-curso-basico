package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite dois n�mero: ");
		double numero=scan.nextDouble();
		double numero2=scan.nextDouble();
		System.out.print("Qual oper��o deseja fzr divis�o multpilca��o subtra��o ou soma ?");
		String operacao=scan.next();		
		
	
		if("soma".equals(operacao)) {
			double operacaoSoma=numero+numero2;
		double somaDecimal =operacaoSoma %1;
		double somaParImpar =operacaoSoma %2;
		
			if(somaDecimal ==1) {
				System.out.println("N�mero Decimal ");
			
				}
				else {
					System.out.println("N�mero Inteiro ");
					
				}
			
			if(somaParImpar==0) {
				System.out.println("N�mero par ");
				
			}
			else {
				 System.out.println("N�mero impar");
			}
		
			if(operacaoSoma>0) {
				System.out.println("N�mero positivo ");
				
			}
			
			else {
				System.out.println("N�mero negativo ");
			}
					
		}
		
		
		if("multpilca��o".equals(operacao)) {
			double operacaoMultiplicacao=numero*numero2;
		double multiplicacaoDecimal = operacaoMultiplicacao%1;
		double multiplicacaoParImpar = operacaoMultiplicacao %2;
		
			if(multiplicacaoDecimal !=0) {
				System.out.println("N�mero Decimal ");
			
				}
				else {
					System.out.println("N�mero Inteiro ");
					
				}
			
			if(multiplicacaoParImpar==0) {
				System.out.println("N�mero par ");
				
			}
			else {
				 System.out.println("N�mero impar");
			}
		
			if(operacaoMultiplicacao>0) {
				System.out.println("N�mero positivo ");
				
			}
			
			else {
				System.out.println("N�mero negativo ");
			}
					
		}
		
		if("divis�o".equals(operacao)) {
			double operacaoDivisao=numero/numero2;
		double DivisaoDecimal = operacaoDivisao%1;
		double DivisaoParImpar = operacaoDivisao %2;
		
			if(DivisaoDecimal !=0) {
				System.out.println("N�mero Decimal ");
			
				}
				else {
					System.out.println("N�mero Inteiro ");
					
				}
			
			if(DivisaoParImpar==0) {
				System.out.println("N�mero par ");
				
			}
			else {
				 System.out.println("N�mero impar");
			}
		
			if(operacaoDivisao>0) {
				System.out.println("N�mero positivo ");
				
			}
			
			else {
				System.out.println("N�mero negativo ");
			}
					
		}
			
	}


	
	
}
