package com.loaine.cursojava.aula30;

public class Carro {
	//classe carros, possui 5 atributos
	//no momento que se dar vida a esse carro e é chamado de objeto
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//cosntrutores
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		//this.marca é o atributo da classe carro e marca é o parametro
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	

	
	public Carro() {}

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("CHAMANDO O CONSTRUTOR COM 3 PARAMENTROS");
	}


	public Carro(String marca, String modelo) {
		//Esse this ta se refirindo ao construtor de cima
		this(marca,modelo,10);
		
		System.out.println("CHAMANDO O CONSTRUTOR COM 2 PARAMENTROS");
	}




	//metodos
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+this.capCombustivel*this.consumoCombustivel);

	}
	
	
	double obterAutnomia() {
		System.out.println("Método obterAutnomia foi chamado");
		
		return this.capCombustivel*this.consumoCombustivel;
	}
		
		double calcularCombustivel(double km) {
			double qtdCombustivel= km/this.consumoCombustivel;
			
			return qtdCombustivel;
		}
	}

