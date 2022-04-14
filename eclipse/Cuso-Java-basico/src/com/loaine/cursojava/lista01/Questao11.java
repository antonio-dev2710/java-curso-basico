package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Escolha um valor: ");
		int valor01=scan.nextInt();
		System.out.print("Escolha mais um valor: ");
		int valor02=scan.nextInt();
		System.out.print("Escolha mais um valor: ");
		double valor03=scan.nextDouble();
		
		int triplo=3;

		int resultadoA=(2*valor01)*(valor02/2);
		System.out.println("o produto do dobro do primeiro com metade do segundo: "+resultadoA);
		double resultadoB=(3*valor01)+valor03;
		System.out.println("a soma do triplo do primeiro com o terceiro: "+resultadoB);
		double resultadoC=Math.pow(valor03, triplo);
		System.out.println("o terceiro elevado ao cubo: "+resultadoC);
		
		

	}

}
