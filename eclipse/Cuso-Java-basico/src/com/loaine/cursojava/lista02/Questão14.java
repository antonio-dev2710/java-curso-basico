package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Quest�o14 {

	public static void main(String[] args) {
		//ent�o a cada 50 quilos ele paga 4 reais de multa
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite as duas notas parciais:");
		double nota1=scan.nextDouble();
		double nota2=scan.nextDouble();
		double media=(nota1+nota2)/2;
		String conceito;
		String aprv="Aprovado";
		String rep="Reprovado";
		if(media>=9&&media<=10) {
			conceito="A";
			
			System.out.println("Sua m�dia �: "+media+" " +conceito+" "+aprv);}
			
		else if(media>=7.5&&media<=9) {
			conceito="B";
			
			System.out.println("Sua m�dia �: "+media+" " +conceito+" "+aprv);}
			
			
		else if(media>=6&&media<=7.5) {
			conceito="C";
			
			System.out.println("Sua m�dia �: "+ media +" "+ conceito +" "+ aprv);}
			
		else if(media>=4.5&&media<=6) {
			conceito="D";
			
			System.out.println("Sua m�dia �: "+media+" " +conceito+" "+rep);}
			
			
		else {
				conceito="E";
			
			System.out.println("Sua m�dia �: "+media+" " +conceito+" "+rep);	
		}
		
	}

}
