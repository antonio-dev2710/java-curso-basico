package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao02 {
	
	//Sem a anotação, o compilador reclamaria de que a variável local s nunca é utilizada. Com a anotação, o compilador ignora de modo silencioso esse aviso localmente no método foo. Isso permite manter os avisos em outros locais da mesma unidade de compilação ou do mesmo projeto.

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Escolha um sexo M ou F:");
		String sexo=scan.next();
		switch(sexo){
		case "F":System.out.println("Feminino ");break;
		case "M":System.out.println("Masculino ");break;
		default:System.out.println("Sexo inválido");
		}
		
		
	}

}
