package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

		
		System.out.print("Digite os 3 lados de um  triângulo ? ");
		double ladoT1=scan.nextDouble();
		double ladoT2=scan.nextDouble();
		double ladoT3=scan.nextDouble();
		
		double SomaDoisLados1 = ladoT1+ ladoT2;
		double SomaDoisLados2= ladoT1+ ladoT3;
		double SomaDoisLados3= ladoT2+ ladoT3;
		
		if(SomaDoisLados1>ladoT3||SomaDoisLados2>ladoT2||SomaDoisLados3>ladoT2) {
			
			System.out.println("É triangulo ");
			if(ladoT1==ladoT2 && ladoT2==ladoT3 && ladoT1==ladoT3) {
				System.out.println("Equilátero ");
			}
			else if(ladoT1==ladoT2 || ladoT2==ladoT3 || ladoT1==ladoT3) {
				System.out.println("Isósceles ");
			}
			else {
				System.out.println("Escaleno ");
			}
		}
		
	}

}
