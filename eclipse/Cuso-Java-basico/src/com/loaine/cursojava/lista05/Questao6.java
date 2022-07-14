package com.loaine.cursojava.lista05;

import java.util.Random;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
	
		//criar dois jogadores
		//opção de esolher a linha e a coluna 
		//vizualizar o tabuleiro apos cada jogada
		//sinalizar jogas invalidas
		//mostra o vencedor
		Scanner scan=new Scanner(System.in);
		
		String jogador;
		
		int linha=0, coluna=0, numero=1,x=0,o=0,i,m=0, n=0,
				 contadorEmpate=0,ponto1,ponto2;
		
		 Random gerador = new Random();
		String [][] jogoVelha=new String[3][3];
		for( i =0; i<jogoVelha.length;i++) {
			System.out.println("Vez do jogador 1= X"+" Vez do jogador 2= "+"O");
			System.out.println("Vez do jogador"+numero);
			jogador=scan.next();
			
			System.out.println("Escolha a linha e a coluna");
			//jogador-2
			if(numero==2) {
			linha=gerador.nextInt(3);
			System.out.println("linha "+linha);
			coluna=gerador.nextInt(3);
			System.out.println("Coluna "+coluna);
			}
			
			//jogador-1
			else {
				linha=scan.nextInt();
				System.out.println("linha "+linha);
				coluna=scan.nextInt();
				System.out.println("Coluna "+coluna);
			}
			
			
			
			//verificaçao
			if(jogoVelha[linha][coluna]==null) {
				jogoVelha[linha][coluna]=jogador;
				System.out.println(jogoVelha[linha][coluna]);
			}
			else {
				do {
					System.out.println("Essa linha e coluna já ta preenchida, escolha outra");
					linha=gerador.nextInt(3);
					System.out.println("linha "+linha);
					coluna=gerador.nextInt(3);
					System.out.println("Coluna "+coluna);

				
			}while(jogoVelha[linha][coluna]!=null);
				
				jogoVelha[linha][coluna]=jogador;
					
			}
			
			
			//soma de cada jogador
			if(jogador.equalsIgnoreCase("x")) {
				
				x++;
				
				
			}
			if(jogador.equalsIgnoreCase("o")) {
				
				o++;
				
			}
			
			////vizualizar tabuleiro e ver quem ganhou
			for(int k=0;k<jogoVelha.length;k++) {
				
				for(int l=0;l<jogoVelha[k].length;l++) {
					if(jogoVelha[linha][coluna] ==jogoVelha[k][l] ) {
						jogoVelha[k][l]=jogoVelha[linha][coluna];
						
						System.out.print(jogoVelha[k][l]+" ");
					}
					else {
						System.out.print(jogoVelha[k][l]+" ");
						
					}
				}
				System.out.println( );
				
				
			}
			
			//verificar quem venceu
			
			if(x>=3) {
				
				ponto1=0;ponto2=0;m=0;n=0;
					for( m=0;m<jogoVelha.length;m++) {
						
						for( n=0;n<jogoVelha[m].length;n++) {
							
							if(jogoVelha[m][n]==null) {
								System.out.println("tem nulo");
								break;
								
							}
							//jogador-1
						if(jogoVelha[m][n].equalsIgnoreCase("x")) {
								
							ponto1++;
							ponto2--;
							
							
							System.out.println(ponto1+"ponto para o jogador 1");
						}
						
							
							if(ponto1==3) {
								System.out.println("jogador 1 venceu");
								return;
							}
						
						
						//jogador-2
						if(jogoVelha[m][n]==null) {
							System.out.print("tem nulo");
							break;
							
						}
						if(jogoVelha[m][n].equalsIgnoreCase("o")) {
								ponto2++;
								ponto1--;
								
							System.out.println(ponto2+" ponto para o jogador 2");
							}
						
						
							
							if(ponto2==3) {
								System.out.println("jogador 2 venceu");
								return;
							}
							
					
						}
						System.out.println( );
						
					
					}
					
					
				}
			
			//Empate
			contadorEmpate++;
			if(contadorEmpate==9) {
				System.out.println("EMPATOUU!");
				return;
				
			}
			
			//troca de jogador
			System.out.println("TROCA DE JOGADOR" );
			
			if(numero==1) {
				numero=2;
			}
			else {
				numero=1;
				
			}
			if(i==2) {
				i--;
			}
			
			
		}
				
		//fim
			
			
		}
		

		
	}
	
			

