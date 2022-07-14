package com.loaine.cursojava.lista05;

import java.util.Random;
import java.util.Scanner;

public class QuestaoJogoVelha {

	public static void main(String[] args) {
	
		//criar dois jogadores
		//opção de esolher a linha e a coluna 
		//vizualizar o tabuleiro apos cada jogada
		//sinalizar jogas invalidas
		//mostra o vencedor
		Scanner scan=new Scanner(System.in);
		
		char[][] jogoVelha = new char[3][3];
			
		System.out.println(" jogador 1 = X"+"\n" +" jogador 2 = "+"O");
		
		boolean ganhou= false;
		int jogada=0,linha=0,coluna=0;
		char sinal=0;
		
		
		
		
		while(!ganhou) {
			
			if(jogada%2==0) {
				System.out.println("Vez do jogador-1"+"\n"+"escolha linha e coluna");
				sinal='X';
			}else {
				System.out.println("Vez do jogador-2"+"\n"+"escolha linha e coluna");
				sinal='O';

			}
			
		
		
		
		boolean linhaValida=false;
		while(!linhaValida) {
				System.out.println("Entre com a linha(1,2 ou 3");
				linha=scan.nextInt();
				
				if(linha>=1 && linha<=3) {
					linhaValida=true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
				
				
			}
			
		boolean colunaValida=false;
		while(!colunaValida) {
				System.out.println("Entre com a linha(1,2 ou 3");
				coluna=scan.nextInt();
				
				if(coluna>=1 && coluna<=3) {
					colunaValida=true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
				
				
			}
		//decremento
		linha--;
		coluna--;
		if(jogoVelha[linha][coluna]=='X'||jogoVelha[linha][coluna]=='O') {
			System.out.println("Posição já usada, tente novamente");
		}
		else {
			jogoVelha[linha][coluna]=sinal;
			jogada++;
		}
		
		//imprimir o tabuleiro
		for(int i=0;i<jogoVelha.length;i++) {
			for(int j=0;j<jogoVelha[i].length;j++) {
				System.out.print(jogoVelha[i][j]+" | ");
			}
			System.out.println();
		
		}
		//verificar ganhador
		if((jogoVelha[0][0]=='X'&&jogoVelha[0][1]=='X'&&jogoVelha[0][2]=='X')||//linha1
				(jogoVelha[1][0]=='X'&&jogoVelha[1][1]=='X'&&jogoVelha[1][2]=='X')||//linha2
					(jogoVelha[2][0]=='X'&&jogoVelha[2][1]=='X'&&jogoVelha[2][2]=='X')||//linha3
						(jogoVelha[0][0]=='X'&&jogoVelha[1][0]=='X'&&jogoVelha[2][0]=='X')||//coluna1
							(jogoVelha[0][1]=='X'&&jogoVelha[1][1]=='X'&&jogoVelha[2][1]=='X')||//coluna2
								(jogoVelha[0][2]=='X'&&jogoVelha[1][2]=='X'&&jogoVelha[2][2]=='X')||//coluna3
									(jogoVelha[0][0]=='X'&&jogoVelha[1][1]=='X'&&jogoVelha[2][2]=='X'))//diagonal 
		{
			
					ganhou= true;
					System.out.println("Jogador-1 ganhou!!!");
		
		
		}
		else if((jogoVelha[0][0]=='O'&&jogoVelha[0][1]=='O'&&jogoVelha[0][2]=='O')||//linha1
					(jogoVelha[1][0]=='O'&&jogoVelha[1][1]=='O'&&jogoVelha[1][2]=='O')||//linha2
						(jogoVelha[2][0]=='O'&&jogoVelha[2][1]=='O'&&jogoVelha[2][2]=='O')||//linha3
							(jogoVelha[0][0]=='O'&&jogoVelha[1][0]=='O'&&jogoVelha[2][0]=='O')||//coluna1
								(jogoVelha[0][1]=='O'&&jogoVelha[1][1]=='O'&&jogoVelha[2][1]=='O')||//coluna2
									(jogoVelha[0][2]=='O'&&jogoVelha[1][2]=='O'&&jogoVelha[2][2]=='O')||//coluna3
										(jogoVelha[0][0]=='O'&&jogoVelha[1][1]=='O'&&jogoVelha[2][2]=='O'))//diagonal 
			{
				
						ganhou= true;
						System.out.println("Jogador-2 ganhou!!!");
			
			
			}
		
		else if(jogada==9) {
			ganhou=true;
			System.out.println("Empate");
			
			
			
		}
		
			
		 
			
		
		
	}
		
		
		
}
		

		
}
	
			

