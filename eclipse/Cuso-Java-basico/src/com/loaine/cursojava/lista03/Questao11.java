package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite a base e o expoente: ");

		int base=scan.nextInt();
		int expoente=scan.nextInt();
		int i=1;
		int totalPotencia = base;
		while(i<expoente) {
			totalPotencia=totalPotencia*base;
			
			++i;
		}
		
		
		
		
		

	}

}
