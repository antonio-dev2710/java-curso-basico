package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Colque a sua altura: ");
		double altura=scan.nextDouble();
		
		
		

		double peso=(72.7*altura) - 58;
		System.out.println("O seu peso �: "+peso+"kg");
		
		
	}

}
