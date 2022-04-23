package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Digite o raio: ");
		double raio=scan.nextDouble();
		
		
		double area=Math.PI*Math.pow(raio,2);
		System.out.print("Área do circulo: "+area);
		

	}

}
