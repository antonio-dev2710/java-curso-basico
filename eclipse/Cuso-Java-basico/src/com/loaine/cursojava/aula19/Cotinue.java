package com.loaine.cursojava.aula19;

import java.util.Scanner;

public class Cotinue {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com um n?mero");
		int num=scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max=scan.nextInt();
		
		for(int i=num;i<=max;i++) {
			if(i % 7 == 0) {
				//ele continua voltanto para condi??o inicial 
				continue;
			}
			System.out.println("O valor do i ?: "+i);

		}
			
	}

}
