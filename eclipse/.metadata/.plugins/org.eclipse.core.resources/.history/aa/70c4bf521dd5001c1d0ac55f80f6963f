package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Peça o tamanho de um arquivo para download (em MB)? ");
		double arquivoMb=scan.nextDouble();
		System.out.print(" A velocidade de um link de Internet (em Mbps)? ");
		double velocidadeMbs=scan.nextDouble();
		//picosegundo para minuto divida o valor de tempo por 6e+13

		double potencia=Math.pow(10, 13);
		//v=s/t
		double tempoMinutos=(double)((arquivoMb/velocidadeMbs)/( 6*potencia));
		
		System.out.print("O tempo aproximado de download do arquivo usando este link (em minutos): "+tempoMinutos);
	}


	
	
}
