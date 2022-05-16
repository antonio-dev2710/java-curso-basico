package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Digite três números: ");
		double numero01=scan.nextDouble(),numero02=scan.nextDouble(),numero03=scan.nextDouble();
		
		if(numero01>numero02&&numero01>numero03) {
			System.out.print("Maior numero 1: "+numero01);
		}
		
		else if(numero02>numero01&&numero02>numero03) {
			System.out.print("Maior numero 2: "+numero02);
		}
		else {
			System.out.print("Maior numero 3: "+numero03);
		}
		
		
		

	}

}
