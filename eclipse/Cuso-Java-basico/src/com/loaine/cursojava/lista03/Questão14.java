package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Quest?o14 {

	public static void main(String[] args) {
		//ent?o a cada 50 quilos ele paga 4 reais de multa
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite um numero:");
		int numero=scan.nextInt();
		int denominador=2;
	while(denominador<=5) {
			 if(numero==1||numero==2||numero==3){
				System.out.println("? primo");
				return;
			}
			 
			 int resto=numero%denominador;

			 denominador++;
			 
			 if(resto==0) {
				 System.out.println(" n?o ? primo");
					return;
			 }
		}
		 System.out.println(" ? primo");
		
	
		
	}

}
