package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Questao05 {
	
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Escolha uma medida: ");
		double metros=scan.nextDouble();
		
		double centimetros=metros*100;
		
		System.out.print("convertendo metros para centimetros: "+centimetros+"cm");
	
	}

}
