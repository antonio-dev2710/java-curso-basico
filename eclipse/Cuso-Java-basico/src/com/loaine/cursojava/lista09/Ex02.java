package com.loaine.cursojava.lista09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println(Calculadora.somar(1, 2));
		System.out.println("Escolha o valor de n:");
		System.out.println(Calculadora.elevar(2,4));
		System.out.println(Calculadora.dividir(10, 2));
		System.out.println(Calculadora.multiplicar(5, 5));
		System.out.println(Calculadora.subtrair(40, 20));
		
		int num;
		
		do {
			System.out.println("Escolha o fatorial:");
			num=scan.nextInt();
			
		}while(num<0);
		
		
		System.out.println(Calculadora.fatorar(num));
	}
	
	

}
