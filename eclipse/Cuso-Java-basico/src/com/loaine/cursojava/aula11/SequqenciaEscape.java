package com.loaine.cursojava.aula11;

public class SequqenciaEscape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print n tem quebra de linha
		//pirntln ? a mes coisa q add \n \r
		
		System.out.print("\"Hello World\"\n \r");
		//1\4 apenas com uma barra n passa pois ? inicio de caracter de escape
		System.out.print("1\\4");
	}

}
