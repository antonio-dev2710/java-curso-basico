package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int aluno = 1;
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] media = new double[nota1.length];
		System.out.println("Digite a  Nota1 e Nota2 para 10 alunos : "  );
		for(int i=0; i<nota1.length;i++) {
			nota1[i]=scan.nextDouble();
			nota2[i]=scan.nextDouble();
		}
		
		for(int i=0; i<nota1.length;i++) {
			media[i]=nota1[i]+nota2[i];
			media[i]=media[i]/2;
		}
		System.out.print("------------------------------------- ");
		System.out.println(" ");
		System.out.println(" RESULT:");
		for(int i=0; i<nota1.length;i++) {
			
			if(media[i]<7) {
				System.out.println("Aluno: "+ aluno+" Reprovado = "+ media[i]);
			}
			else if(media[i]>=7 && media[i]<=10) {
				System.out.println("Aluno: "+ aluno+" Aprovado = "+ media[i]);
					
			}
			aluno++;
			System.out.println(" ");
		}
	}

}
