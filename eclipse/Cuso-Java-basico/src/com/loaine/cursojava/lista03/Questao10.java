package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			
			
			int numero;
			int i=0;	
			int impar=0;
			int par=0;
			while( i<10) {
				System.out.println("Digite um numero: ");
				numero=scan.nextInt();
				if(numero%2==0) {
					
					par++;
					System.out.println("É par: "+par);
				}
				
				else {
					;
					impar++;
					System.out.println("É impar: "+impar);
				}
				
				++i;
			}
											
		

	}

}
