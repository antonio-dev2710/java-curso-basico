package com.loaine.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		//intasciando carros
		//objeto-van
		MetodoSimples van=new MetodoSimples();
		
		van.marca="Fiat";
		van.modelo="Ducato";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;
		
		van.exibirAutonomia();
		//objeto fusca
MetodoSimples fusca=new MetodoSimples();
		
		fusca.marca="Volkswagen";
		fusca.modelo="Fusca";
		fusca.numPassageiros=4;
		fusca.capCombustivel=30;
		fusca.consumoCombustivel=0.15;
		
		
		
		double autonomia=fusca.obterAutonomia();
		System.out.println("A autonomia do carro ? "+autonomia+" km");
		
		double qtdCombustivel = fusca.caclularCombustivel(10);
		System.out.println("A qtd de combustivel "+qtdCombustivel);
		
		
	}

}
