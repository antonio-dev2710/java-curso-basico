package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("O tamanho em metros quadrados da �rea a ser pintada? ");
		double area=scan.nextDouble();
		int lataLitros=18;
		int metrosTinta=3;
		int precoLata=80;
		int areaPintadaComUmaLata=lataLitros*metrosTinta;
		//cobertura da tinta � de 1 litro para cada 3 metros quadrados
		double litrosGastos=area/3;
		
		
		if(area>=areaPintadaComUmaLata) {
			double quantidadeLata=(double)(litrosGastos/lataLitros);
			double precoTotal=quantidadeLata*precoLata;
			System.out.print(precoTotal+"R$");
			
		}else {
			System.out.print(precoLata+"R$");
		}

	}

}
