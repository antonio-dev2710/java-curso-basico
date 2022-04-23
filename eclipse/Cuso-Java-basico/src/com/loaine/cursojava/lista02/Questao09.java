package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
	//C = 5 * ((F-32) / 9).
		
		System.out.print("Escolha uma temperatura: ");
		
		double temperaturaFahrenheit=scan.nextDouble();
		double temperaturaCelsius= 5 * ((temperaturaFahrenheit-32) / 9);
		
		System.out.print("temperatura Celcius: "+temperaturaCelsius+"°C");
		
		
		
		
	}

}
