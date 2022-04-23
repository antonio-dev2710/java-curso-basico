package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Escolha uma letra:");
		String letras=scan.next();
		switch(letras){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":System.out.println("Vogal ");break;
		default:System.out.println("Consoante");
		}
	}

}
