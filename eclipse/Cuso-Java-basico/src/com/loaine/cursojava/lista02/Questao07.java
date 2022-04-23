package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Escolha um número: ");
	double lado=scan.nextDouble();
	double area=Math.pow(lado, 2);
	double dobroDaArea=2*area;
	
	System.out.print("O dobro da area do quadrado é: "+dobroDaArea);
	}

}
