package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora? ");
		double valorPorHora=scan.nextDouble();
		
		System.out.print("Quantas horas trabalhadas no mês? ");
		double horaDeTrabalhoMes=scan.nextDouble();
		
		double totalSalario=valorPorHora*horaDeTrabalhoMes;
		System.out.print("Sálario no mês: "+totalSalario+"R$");
		
		
		
	}

}
