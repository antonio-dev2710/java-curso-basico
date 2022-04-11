package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Questao02 {
	
	//Sem a anota��o, o compilador reclamaria de que a vari�vel local s nunca � utilizada. Com a anota��o, o compilador ignora de modo silencioso esse aviso localmente no m�todo foo. Isso permite manter os avisos em outros locais da mesma unidade de compila��o ou do mesmo projeto.

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Digite um n�mero:");
		Scanner scan=new Scanner(System.in);
		
		int numero=scan.nextInt();
		
		System.out.println("O n�mero informado foi: "+numero);
	}

}
