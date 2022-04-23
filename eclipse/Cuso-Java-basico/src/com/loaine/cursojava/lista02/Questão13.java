
package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questão13 {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		//responda true ou false
		System.out.print("Vc é mulher?");
		boolean genero=scan.nextBoolean();
		
		System.out.print("Qual é a sua altura?");
		double altura=scan.nextDouble();
		double pesoIdeal;
		if(genero==true) {
			//(62.1*h) - 44.7
			
			pesoIdeal=(62.1*altura) - 44.7;
			
			System.out.print("Seu peso ideal é: "+pesoIdeal);
			
		}
		else {
			//(72.7*h) - 58
			pesoIdeal=(72.7*altura) - 58;

			System.out.print("Seu peso ideal é: "+pesoIdeal);
			
		}
		
	}

}
