package com.loaine.cursojava.aula21;

import java.util.Random;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		
		Random gerador=new Random();
		int [] notas =new int [10];
		for(int i=0;i<notas.length;i++) {
			notas[i]=gerador.nextInt(11);
		}
		
		
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
		}
		System.out.println("Usando o for each");
		//acessando um determinado valor desse array
		for(int nota:notas) {
			System.out.println(nota);
		}
		
		
		//FOREACH COM MATRIZES
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
		
		//acessando o array de notas de cada aluno
		System.out.println("Usando o for each arrays multidimencionais");
		for(double [] notasAluno:  notasAlunos) {
			for(double nota:  notasAluno) {
				System.out.println(nota);
			}
		}
}
	

}


