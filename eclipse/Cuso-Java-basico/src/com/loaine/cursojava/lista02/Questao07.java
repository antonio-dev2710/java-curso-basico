package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Escolha um n�mero: ");
	
	
	System.out.print("Digite tr�s n�meros: ");
	double numero01=scan.nextDouble(),numero02=scan.nextDouble(),numero03=scan.nextDouble();
	
	if(numero01>numero02&&numero01>numero03) {
		System.out.print("Maior numero 1: "+numero01);
		if(numero02<numero03) {
			System.out.print("Menor numero 1: "+numero02);
		}else {
			System.out.print("Menor numero 1: "+numero03);
		}
		
	}
	else if(numero02>numero01&&numero02>numero03) {
		System.out.print("Maior numero 2: "+numero02);
		if(numero01<numero03) {
			System.out.print("Menor numero 2: "+numero01);
		}
		else {
			System.out.print("Menor numero 2: "+numero03);
		}
		
	}
	
	else if(numero03>numero01&&numero03>numero02) {
		System.out.print("Maior numero 3: "+numero03);
		if(numero02<numero01) {
			System.out.print("Menor numero 3: "+numero02);
		}
		else {
			System.out.print("Menor numero 3: "+numero01);
		}
		
	}
	
	
	
}

}
