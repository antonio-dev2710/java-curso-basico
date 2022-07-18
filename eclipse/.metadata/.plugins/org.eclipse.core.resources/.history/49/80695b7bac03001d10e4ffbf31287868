package com.loaine.cursojava.lista08;

import java.util.Scanner;

public class Lampada {

	String tipo;
	double voltagem;
	double preco;
	
	//metodo
	
	int funcionar(int opcao) {
		Scanner scan= new Scanner(System.in);
		
		
		while(opcao!=0) {
			System.out.println("Escolha 1 para ligar a luz e 2 para apagar a luz"+"\n"+"0 para encerrar");
			opcao=scan.nextInt();
			if(opcao>=0 && opcao<=2) {
			if(opcao==1) {
				System.out.println("Desligado");
			}
			if(opcao==2){
				System.out.println("Ligado");
			}
			
			
		}
			else {
				System.out.println("vc so pode escolher de 0 a 2 !!!");
			}
		
		}
		return opcao;
	}
}
