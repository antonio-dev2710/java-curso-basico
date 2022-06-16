package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			
			
			
			System.out.print("Escolha um turno: ");
			
			String turno=scan.next();
			
			switch(turno) {
			case"N":System.out.println("Boa noite");
			break;
			case"M":System.out.println("Bom dia");
			break;
			case"V":System.out.println("Boa tarde");
			case"n":System.out.println("Boa noite");
			break;
			case"m":System.out.println("Bom dia");
			break;
			case"v":System.out.println("Boa tarde");
			break;
			default:System.out.println("Valor Inválido!");

			}
			
		

	}

}
