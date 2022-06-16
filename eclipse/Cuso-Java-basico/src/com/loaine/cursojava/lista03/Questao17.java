package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int media=0;

		System.out.println("Digite o número de turmas:");
		
		int turmas=scan.nextInt();
		
for(int i=0;i<turmas;i++) {
	
	System.out.println("Digite o número de alunos:");
	int alunos = scan.nextInt();
	if(alunos<=40) {
		System.out.println("tem q ser mais q 40 alunos");
		
		alunos=0;
		i--;
	}
	media = media + alunos;
	
}		

media=media/turmas;

System.out.println("media :"+media);

	}

}
