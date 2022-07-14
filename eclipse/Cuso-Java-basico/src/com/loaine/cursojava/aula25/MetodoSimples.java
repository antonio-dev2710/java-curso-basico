package com.loaine.cursojava.aula25;

public class MetodoSimples {
	//classe carros, possui 5 atributos
	//no momento que se dar vida a esse carro e é chamado de objeto
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//tipo de retorno
	//vai retornar nenhum valor
	//sempre começa com verbo
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é "+(capCombustivel*consumoCombustivel)+" km");
	}
	
	//metodo com retorno
	//precisa delcarar o tipo
	//e colocar o return no final
	double obterAutonomia() {
		System.out.println("Obter autonomia foi chamado");
		return capCombustivel *consumoCombustivel;
	}
	
	//metodo com parametro
	
	double caclularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
