package com.loaine.cursojava.aula29;

public class Carro {
	//classe carros, possui 5 atributos
	//no momento que se dar vida a esse carro e ? chamado de objeto
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//cosntrutores
	Carro(){
		System.out.println("Classe carro instaciada");
		numPassageiros=4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiro_,double capCombustivel_,double consumoCombustivel_){
		marca=marca_;
		 modelo=modelo_;
		 numPassageiros=numPassageiro_;
		 capCombustivel=capCombustivel_;
		 consumoCombustivel=consumoCombustivel_;
	}
	
	
	//metodos
	void exibirAutonomia() {
		System.out.println("A autonomia do carro ?: "+capCombustivel*consumoCombustivel);

	}
	
	double obterAutnomia() {
		System.out.println("M?todo obterAutnomia foi chamado");
		
		return capCombustivel*consumoCombustivel;
	}
		
		double calcularCombustivel(double km) {
			double qtdCombustivel= km/consumoCombustivel;
			
			return qtdCombustivel;
		}
	}

