package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
//Valor sem desconto (V): R$ 125,00

//Porcentagem de desconto (%): 15%

//Valor descontado (Vd): ?

//Valor final (Vf): ?

//125 x 15/100 (ou 0,15) = 18,75

//> 125 – 18,75 = 106,25
//1º passo: V x % = Vd

//2º passo: V – Vd = Vf
		
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
