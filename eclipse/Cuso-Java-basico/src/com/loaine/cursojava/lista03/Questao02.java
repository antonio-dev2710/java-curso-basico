package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao02 {
	//declarar as variáveis q vão usar fora do loop
	//consome mais espaço na memória 

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//string é uma classe em java
	Scanner scan=new Scanner(System.in);
	
	System.out.println("escolha um nome de usuário: ");
	String nomeUsuario=scan.next();
	
	System.out.println("escolha uma senha: ");
	String sennha=scan.next();
	
	while(nomeUsuario.equalsIgnoreCase(sennha)) {
		
		System.out.println("A senha está igual ao nome do usuário ");
		
		System.out.println("escolha outro nome de usuário: ");
		 nomeUsuario=scan.next();
		
		System.out.println("escolha outra senha: ");
		 sennha=scan.next();
		 
	
	}
	
	System.out.println("A senha está correta!! ");
	}

}
