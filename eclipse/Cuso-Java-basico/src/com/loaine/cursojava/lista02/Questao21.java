package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite um n?mero: ");
		int numero=scan.nextInt();
		int divisao = numero%2;
		
		switch(divisao) {
		case 0:System.out.print("N?mero par ");
		break;
		default: System.out.println("N?mero impar");
		
		
		}
	}


	
	
}
