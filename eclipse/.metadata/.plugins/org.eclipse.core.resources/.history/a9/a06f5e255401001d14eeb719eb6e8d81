package com.loaine.cursojava.aula31;

//public qualquer classe de outro pacote pode ver 
 public class Carro {
	//classe carros, possui 5 atributos
	//no momento que se dar vida a esse carro e é chamado de objeto
	public String marca;
	//Default-Apenas pode ser utilizando dentro da propio pacote  
	String modelo;
	int numPassageiros;
	//Private-vc so consegue ver detro da propia classe
	 private double capCombustivel;
	double consumoCombustivel;
	
	



	//metodos
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+this.capCombustivel*this.consumoCombustivel);

	}
	
	
	public double obterAutnomia() {
		System.out.println("Método obterAutnomia foi chamado");
		
		return this.capCombustivel*this.consumoCombustivel;
	}
	
	//metodo auxiliar
	private double divideKmPorConsumoCombustivel(double km) {
		return  km/this.consumoCombustivel;
	}
		
		double calcularCombustivel(double km) {
			
			
			return this.divideKmPorConsumoCombustivel(km);
		}
	}

