package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Escolha dois números: ");
		double num01 =scan.nextDouble() ,num02= scan.nextDouble();
		if(num01>num02) {
			System.out.println("Esse número é o maior entre os escolhidos "+num01);
		}else {
			System.out.println("Esse número é o maior entre os escolhidos "+num02);
		}

	}

}
