package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Quanto voc� ganha por hora? ");
		double valorPorHora=scan.nextDouble();
		
		System.out.print("Quantas horas trabalhadas no m�s? ");
		double horaDeTrabalhoMes=scan.nextDouble();
		
		double totalSalario=valorPorHora*horaDeTrabalhoMes;
		System.out.print("S�lario no m�s: "+totalSalario+"R$");
		
		
		
	}

}
