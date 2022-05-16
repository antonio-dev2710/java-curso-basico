package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);

		System.out.print("Digite um número menor do que 1000? ");
		
		int nota=scan.nextInt();
		if(nota<10 || nota>600) {
			System.out.print("Tente outro número ");
			return;
		}
		 int cedulaDeCem=nota/100;
		 nota=nota%100;
		 int cedulaDeCinquenta=nota/50;
		 nota=nota%50;
		 int cedulaDeDez=nota/10;
		 nota=nota%10;
		 int cedulaDeCinco=nota/5;
		 nota=nota%5;
		 int cedulaDeUm=nota/1;
		 
	if(cedulaDeDez==0) {
		
		System.out.print("o programa fornece: : " + cedulaDeCem+"  nota de 100, "+cedulaDeCinquenta  +" nota de 50, " +cedulaDeCinco+ " nota de 5 e  "+cedulaDeUm +" nota de 1");
	}
	else if(cedulaDeCinquenta==0) {
		System.out.print("o programa fornece: : " + cedulaDeCem+ " nota de 100, "+cedulaDeDez+" nota de 10 "+cedulaDeCinco+ " nota de 5 e "+cedulaDeUm +" nota de 1");
	}
	else if(cedulaDeCinco==0) {
		System.out.print("o programa fornece: : " + cedulaDeCem+ " nota de 100, "+cedulaDeCinquenta  +" nota de 50, " +cedulaDeDez+" nota de 10 "+cedulaDeUm +" nota de 1");
	}
	else if(cedulaDeCem==0) {
		System.out.print("o programa fornece: : " +cedulaDeCinquenta  +" nota de 50," +cedulaDeDez+" nota de 10"+cedulaDeCinco+ " nota de 5 e "+cedulaDeUm +" nota de 1");
	}
	else {
		System.out.print("o programa fornece: : " + cedulaDeCem+ " nota de 100, "+cedulaDeCinquenta  +" nota de 50," +cedulaDeDez+" nota de 10 "+cedulaDeCinco+ " nota de 5 e "+cedulaDeUm +" nota de 1");
		}
	}


	
	
}
