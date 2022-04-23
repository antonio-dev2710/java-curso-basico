package com.loaine.cursojava.aula15;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Escolha uma dia da semana(1-7):");
		int diaSemana=scan.nextInt();
		//O condicional switch testa o valor contido em uma variável 
		//e o compara com os valores fornecidos em cada caso, representados pela palavra reservada case.
		switch(diaSemana) {
		//sem o breack ele executa todas as linhas até achar o breack mesmo as outras condições sendo falsa
		case 1:System.out.println("Domingo");break;
		case 2:System.out.println("Segunda");break;
		case 3:System.out.println("Terça");break;
		case 4:System.out.println("Quarta");break;
		case 5:System.out.println("Quinta");break;
		case 6:System.out.println("Sexta");break;
		case 7:System.out.println("Sabado");break;
		//caso nenhuma das condicionais sejam atendidas
		
		default:System.out.println("Não é um dia da semana válido");
		}
		
	}

}
