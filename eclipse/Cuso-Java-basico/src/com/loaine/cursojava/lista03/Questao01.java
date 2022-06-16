package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double nota;
		System.out.println("escolha uma nota: ");
		
		for(nota= scan.nextDouble();nota<0 || nota >10;) {
			
			System.out.println("escolha uma nota: ");
			nota=scan.nextDouble();
		}
		System.out.println("Sua nota está correta 0-10: "+ nota);
		
	}

}
