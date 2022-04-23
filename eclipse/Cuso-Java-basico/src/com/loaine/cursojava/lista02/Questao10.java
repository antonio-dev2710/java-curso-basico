package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			
			//C = 5 * ((F-32) / 9).
			
			System.out.print("Escolha uma temperatura: ");
			
			double  temperaturaCelsius=scan.nextDouble();
			double  temperaturaFahrenheit;
			temperaturaFahrenheit=32+(1.8*temperaturaCelsius);
			
			
			System.out.print("temperatura Celcius: "+temperaturaFahrenheit+"°F");

	}

}
