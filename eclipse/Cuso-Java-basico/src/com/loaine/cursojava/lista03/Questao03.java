package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Escolha uma letra:");
		String letras=scan.next();
		
		if(letras.length()>1) {
			System.out.print("tem mais de uma letra");
			return;
		}
		switch(letras){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println("Vogal ");break;
		default:System.out.println("Consoante");
		}
	}

}
