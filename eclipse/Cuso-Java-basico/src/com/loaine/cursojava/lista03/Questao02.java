package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao02 {
	//declarar as vari�veis q v�o usar fora do loop
	//consome mais espa�o na mem�ria 

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//string � uma classe em java
	Scanner scan=new Scanner(System.in);
	
	System.out.println("escolha um nome de usu�rio: ");
	String nomeUsuario=scan.next();
	
	System.out.println("escolha uma senha: ");
	String sennha=scan.next();
	
	while(nomeUsuario.equalsIgnoreCase(sennha)) {
		
		System.out.println("A senha est� igual ao nome do usu�rio ");
		
		System.out.println("escolha outro nome de usu�rio: ");
		 nomeUsuario=scan.next();
		
		System.out.println("escolha outra senha: ");
		 sennha=scan.next();
		 
	
	}
	
	System.out.println("A senha est� correta!! ");
	}

}
