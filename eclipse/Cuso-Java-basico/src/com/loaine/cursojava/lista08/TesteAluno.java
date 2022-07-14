package com.loaine.cursojava.lista08;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Aluno anluno01 = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		 anluno01.nome=scan.next();
		System.out.println("Digite a matricula: ");
		anluno01.matricula=scan.nextInt();
		System.out.println("Digite o curso: ");
		anluno01.curso=scan.next();
		System.out.println( );
		//metodo
		anluno01.calcularMedia();

	}

}
