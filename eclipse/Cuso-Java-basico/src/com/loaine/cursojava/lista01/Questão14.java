package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Quest?o14 {

	public static void main(String[] args) {
		//ent?o a cada 50 quilos ele paga 4 reais de multa
		Scanner scan=new Scanner(System.in);
		System.out.print("Coloque o quilo total de peixe:");
		double pesoDePeixes=scan.nextDouble();
		int limite=50;
		int multa=4;
		
		
		if(pesoDePeixes>=limite) {
			
			double excesso=(pesoDePeixes/limite);
			System.out.println("Vc teve um excesso de:"+excesso+"Kg");
			
			double taxaExtra=excesso*multa;
			System.out.println("Logo vc tem um taxa extra a pagar de:"+taxaExtra+"R$");
		}else {
			
			System.out.println("Vc n aprsenta excesso "+pesoDePeixes+"Kg");
		}
	}

}
