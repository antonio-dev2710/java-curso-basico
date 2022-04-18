package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("O tamanho em metros quadrados da área a ser pintada? ");
		double area=scan.nextDouble();
		
		System.out.print("Vc quer o galão de 18 litros ou de 3,6 galões ? ");
		double lataLitros=scan.nextDouble();
		
		System.out.print("Vc quer o galões  de 18 litros e de 3,6 ? ");
		boolean lataMista=scan.nextBoolean();
		
		double metrosTinta=6;
		int precoLata=80;
		double areaPintadaComUmaLata=(double) (lataLitros*metrosTinta);
		//cobertura da tinta é de 1 litro para cada 6 metros quadrados
		double litrosGastos=area/metrosTinta;
		
		if(lataLitros==18) {
			
			System.out.println("Vc vai precisar compar  "+litrosGastos+"L");
		if(area>=areaPintadaComUmaLata) {
			double quantidadeLata=(double)(litrosGastos/lataLitros);
			System.out.println("Quantidade de latas: "+quantidadeLata);
			double precoTotal=quantidadeLata*precoLata;
			System.out.println(precoTotal+"R$");		
		}	
		else {
			System.out.print(precoLata+"R$");
		 }
		return;
	   }
		
		
		if(lataLitros==3.6) {
			System.out.println("Vc vai precisar compar  "+litrosGastos+"L");
			 metrosTinta=6;
			 precoLata=25;
			 areaPintadaComUmaLata=lataLitros*metrosTinta;
			//cobertura da tinta é de 1 litro para cada 6 metros quadrados
			litrosGastos=area/metrosTinta;
			
			if(area>=areaPintadaComUmaLata) {
				double quantidadeLata=(double)(litrosGastos/lataLitros);
				System.out.println("Quantidade de latas :"+quantidadeLata);
				double precoTotal=quantidadeLata*precoLata;
				System.out.println(precoTotal+"R$");		
			}	
			else {
				System.out.print(precoLata+"R$");
			 }
			return;
		}
		
		
		if(lataMista==true) {
			System.out.println("Vc vai precisar compar  "+litrosGastos+"L");
			 metrosTinta=6;
			 precoLata=105;
			 lataLitros=21.6;
			 areaPintadaComUmaLata=lataLitros*metrosTinta;
			//cobertura da tinta é de 1 litro para cada 6 metros quadrados
			litrosGastos=area/metrosTinta;
			
			if(area>=areaPintadaComUmaLata) {
				
				// folga de 10% isso quer dizer um desconto em cima da quantidade de latas
				//1º passo: V x % = Vd

				//2º passo: V – Vd = Vf
				double quantidadeLata=(double)(litrosGastos/lataLitros);
				double quantidadeLataDesconto=quantidadeLata-(quantidadeLata*0.1);
				System.out.println("Quantidade de latas :"+quantidadeLataDesconto);
				double precoTotal=quantidadeLataDesconto*precoLata;
				System.out.println(precoTotal+"R$");		
			}	
			else {
				System.out.print(precoLata+"R$");
			 }
			return;
		}
		
		
	}


	
	
}
