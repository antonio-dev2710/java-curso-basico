package com.loaine.cursojava.aula20;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		
		//30 alunos e 4 notas-------------linha e coluna
		double [][] notasAlunos= new double [4]   [4];

		notasAlunos[0][0]=10;
		notasAlunos[0][1]=7;
		notasAlunos[0][2]=8;
		notasAlunos[0][3]=9.5;

		notasAlunos[1][0]=9;
		notasAlunos[1][1]=7;
		notasAlunos[1][2]=6;
		notasAlunos[1][3]=9.5;

		notasAlunos[2][0]=5;
		notasAlunos[2][1]=7;
		notasAlunos[2][2]=7.5;
		notasAlunos[2][3]=9.5;

		notasAlunos[3][0]=6.5;
		notasAlunos[3][1]=7;
		notasAlunos[3][2]=8;
		notasAlunos[3][3]=9.5;

		for(int i = 0 ; i<notasAlunos.length;i++) {
			
			System.out.print(notasAlunos[i]+ " ");
			for(int j = 0 ; j<notasAlunos[i].length;j++) {
				
				System.out.print(notasAlunos[i][j]+ " ");
			}

			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.println("  Media final  ");
		double soma;
		for(int i = 0 ; i<notasAlunos.length;i++) {
				soma=0;
			
			for(int j = 0 ; j<notasAlunos[i].length;j++) {
				
				soma+=notasAlunos[i][j];
			}

			System.out.println("media = "+soma/4);
		}

		//matriz de matrizes
		double [][] doisAlunos= {{9,4,5.6,7},{8,6,7,4}};

		for(int i = 0 ; i<doisAlunos.length;i++) {
		System.out.print("Aluno "+i+":");
		for(int j = 0 ; j<doisAlunos[i].length;j++) {

		System.out.print(doisAlunos[i][j]+ " ");
		}

		System.out.println();
		}
		
	}
	

}


