package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Vc prefere álcool ou gasolina ? ");
		String combustivel = scan.next();
		
		
		
		
		double descontoTres=1.3;
		double descontoCinco=1.5;
		double precoAlcool=1.90;
		double descontoQuatro=1.4;
		double descontoSeis=1.6;
		double precoGasolina=2.50;
	
		if(combustivel.equals("álcool")) {
			System.out.print("Quantos litros ?");
			double A = scan.nextDouble();
			
			if(A>=0 && A<=20) {
				 A =A*descontoTres*precoAlcool;
				 return;
			}
			else {
				A=A*descontoCinco*precoAlcool;
				return;
			}
		}	
		
		if(combustivel.equals("gasolina")) {
			System.out.print("Quantos litros ?");
			double G = scan.nextDouble();
			
			if(G>=0 && G<=20) {
				G=G*descontoQuatro*precoGasolina;
				return;
			}
			else {
				G=G*descontoSeis*precoGasolina;
				return;
			}
		}	
		
	}
	
}
