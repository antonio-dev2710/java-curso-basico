package com.loaine.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nRFatorial= MinhaCalculadora.fatorialNR(5);
		System.out.println(nRFatorial);
		
		int recursivoFatorial=MinhaCalculadora.fatorial(5);
		System.out.println(recursivoFatorial);
	}

}
