package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Digite 5 n?meros: ");
		double numero01=scan.nextDouble(),
					numero02=scan.nextDouble(),
						numero03=scan.nextDouble(),
							numero04=scan.nextDouble(),
								numero05=scan.nextDouble();
										
	
		
		while(numero01!=0&&numero02!=0&&numero03!=0&&numero04!=0&&numero05!=0) {
			
			System.out.print((numero01+numero02+numero03+numero04+numero05)/5);
			return;
		}
		
		
		

	}

}
