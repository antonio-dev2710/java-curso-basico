package com.loaine.cursojava.lista08;

import java.util.Scanner;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	String [] disciplinas=new String[3];
	double[] notas=new double[3];
	
	//metodo
	
	void calcularMedia() {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Digite as notas: ");
		for(int i=0;i<notas.length;i++) {
			
			 notas[i]=scan.nextDouble();
		}
		
		System.out.println("Digite o nome das disciplinas: ");

		for(int i=0;i<disciplinas.length;i++) {
			
			 disciplinas[i]=scan.next();
		}
		 
		
		String resultado;
		
		for(int i=0;i<disciplinas.length;i++) {
			
			 if( notas[i]>=7) {
				 
				 resultado="Aprovado";
				 
				 
			 }
			 else {
				 resultado="Reprovado";
			 }
			 
			
			 if(i==0) {
				 System.out.println("Resultado final: ");
			 }
			 
			 System.out.println(disciplinas[i]+": "+ notas[i]+": "+ resultado);
		}
		
		
	}
	
}
