package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		
		

		System.out.print("Qual tabuda deseja: ");
		int tabuada=scan.nextInt();
		System.out.print("Quer começar a multiplicar por qual numéro: ");
		int comeco=scan.nextInt();
		int resultado;
		System.out.print("Quer terminar a multiplicar por qual numéro: ");
		int max=scan.nextInt();
		
		System.out.println("Mostrar a tabuada de: "+tabuada);
		System.out.println("Começa por: "+comeco);
		System.out.println("Termina por: "+max);
		
			System.out.println("  ");
			System.out.println("A tabuada de "+tabuada+" Começa por: "+comeco+" e "+" Termina por: "+max);
		
		for(int i=comeco ;i<=max;i++) {
			resultado=tabuada*i;
			System.out.println(tabuada+ " x " +i+"= "+resultado);
		}
		
		
	}


	
	
}
