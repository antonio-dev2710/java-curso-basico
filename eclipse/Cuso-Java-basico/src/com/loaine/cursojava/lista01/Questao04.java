package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Coloque a primeira nota: ");
		double nota01=scan.nextDouble();
		System.out.print("Coloque a segunda nota: ");
		double nota02=scan.nextDouble();
		System.out.print("Coloque a terceira nota: ");
		double nota03=scan.nextDouble();
		System.out.print("Coloque a quarta nota: ");
		double nota04=scan.nextDouble();
		
		double media=(nota01+nota02+nota03+nota04)/4;
		System.out.print("Sua m�dia final �: "+media);

	}

}
