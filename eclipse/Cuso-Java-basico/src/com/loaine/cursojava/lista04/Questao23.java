package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com um n?mero");
		int num=scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max=scan.nextInt();
		
		for(int i=num;i<=max;i++) {
			if(i % 7 == 0) {
				System.out.println("O valor do i ?: "+i);
				break;
			}
			
			
		}
		
	}

}
