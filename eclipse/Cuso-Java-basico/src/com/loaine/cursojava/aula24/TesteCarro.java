package com.loaine.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		//intasciando carros
		//objeto-van
		Carros van=new Carros();
		
		van.marca="Fiat";
		van.modelo="Ducato";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;
		
		System.out.println(van.marca);
		
		//objeto fusca
Carros fusca=new Carros();
		
		fusca.marca="Volkswagen";
		fusca.modelo="Fusca";
		fusca.numPassageiros=4;
		fusca.capCombustivel=30;
		fusca.consumoCombustivel=0.15;
		
		System.out.println(fusca.marca);
		
	}

}
