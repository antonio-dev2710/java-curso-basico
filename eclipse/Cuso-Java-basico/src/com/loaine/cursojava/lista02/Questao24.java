package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite dois número: ");
		double numero=scan.nextDouble();
		double numero2=scan.nextDouble();
		System.out.print("Qual operção deseja fzr divisão multpilcação subtração ou soma ?");
		String operacao=scan.next();		
		
	
		if("soma".equals(operacao)) {
			double operacaoSoma=numero+numero2;
		double somaDecimal =operacaoSoma %1;
		double somaParImpar =operacaoSoma %2;
		
			if(somaDecimal ==1) {
				System.out.println("Número Decimal ");
			
				}
				else {
					System.out.println("Número Inteiro ");
					
				}
			
			if(somaParImpar==0) {
				System.out.println("Número par ");
				
			}
			else {
				 System.out.println("Número impar");
			}
		
			if(operacaoSoma>0) {
				System.out.println("Número positivo ");
				
			}
			
			else {
				System.out.println("Número negativo ");
			}
					
		}
		
		
		if("multpilcação".equals(operacao)) {
			double operacaoMultiplicacao=numero*numero2;
		double multiplicacaoDecimal = operacaoMultiplicacao%1;
		double multiplicacaoParImpar = operacaoMultiplicacao %2;
		
			if(multiplicacaoDecimal !=0) {
				System.out.println("Número Decimal ");
			
				}
				else {
					System.out.println("Número Inteiro ");
					
				}
			
			if(multiplicacaoParImpar==0) {
				System.out.println("Número par ");
				
			}
			else {
				 System.out.println("Número impar");
			}
		
			if(operacaoMultiplicacao>0) {
				System.out.println("Número positivo ");
				
			}
			
			else {
				System.out.println("Número negativo ");
			}
					
		}
		
		if("divisão".equals(operacao)) {
			double operacaoDivisao=numero/numero2;
		double DivisaoDecimal = operacaoDivisao%1;
		double DivisaoParImpar = operacaoDivisao %2;
		
			if(DivisaoDecimal !=0) {
				System.out.println("Número Decimal ");
			
				}
				else {
					System.out.println("Número Inteiro ");
					
				}
			
			if(DivisaoParImpar==0) {
				System.out.println("Número par ");
				
			}
			else {
				 System.out.println("Número impar");
			}
		
			if(operacaoDivisao>0) {
				System.out.println("Número positivo ");
				
			}
			
			else {
				System.out.println("Número negativo ");
			}
					
		}
			
	}


	
	
}
