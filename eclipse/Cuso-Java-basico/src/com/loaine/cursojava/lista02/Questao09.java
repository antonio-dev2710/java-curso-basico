package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
	
		System.out.print("Digite tres numeros: ");
double numero01=scan.nextDouble(),numero02=scan.nextDouble(),numero03=scan.nextDouble();
		
		if(numero01>=numero02&&numero01>=numero03&&numero03<=numero02) {
			System.out.print("Ordem decrescente 1: "+numero01+numero02+numero03);
			
		}
		else if(numero01<=numero02&&numero03<=numero02&&numero03<=numero01) {
			System.out.print("Ordem decrescente 2: "+numero02+numero01+numero03);
			
		}
		else if(numero03>=numero02&&numero01>=numero02&&numero03>=numero01) {
			System.out.print("Ordem decrescente 3: "+numero03 + numero01 +numero02);
		}
		
		else if(numero03>=numero01&&numero03>=numero02 &&numero02>=numero01) {
			System.out.print("Ordem decrescente 4: "+numero03+numero02+numero01);
		}
		
		else{
			System.out.print("Ordem decrescente 5: "+numero02+numero03+numero01);
		}
		
	}

}
