package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao05 {
	
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Escolha um n?mero: ");
		double numero=scan.nextDouble();
		if(numero>=0) {
			System.out.print("positivo ");
			
		}else {
			System.out.print("negativo");
		}
		
	}

}
