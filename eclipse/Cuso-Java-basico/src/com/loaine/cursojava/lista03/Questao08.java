package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite  dois numeros: ");
		int numero01=scan.nextInt(),numero02=scan.nextInt();
		int numero= numero01-numero02;
		int totalNum=0;
		if(numero==1 || numero==0) {
			System.out.print("n?o tem intervalo");
			
		}
		
		else if(numero01<numero02) {
			
			numero01++;
			
			while(numero01<numero02) {
				System.out.println(numero01++);
				totalNum=totalNum+numero01;
			}
			System.out.println(totalNum);
		}
		
		else if(numero02<numero01) {
			numero02++;
			while(numero02<numero01) {
				System.out.print(numero02++);
				totalNum=totalNum+numero02;
			}
			System.out.println(totalNum);
		}
		
		
		
		
		
		
	}

}
