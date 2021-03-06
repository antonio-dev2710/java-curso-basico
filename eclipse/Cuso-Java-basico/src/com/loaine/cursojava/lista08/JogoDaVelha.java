package com.loaine.cursojava.lista08;

public class JogoDaVelha {

	private char[][] jogoVelha;
	private int jogada;
	
	
	
	public JogoDaVelha() {
		this.jogoVelha = new char[3][3];
		this.jogada =1;
	}

	public JogoDaVelha(char[][] jogoVelha, int jogada) {
		super();
		this.jogoVelha = new char[3][3];
		this.jogada =1;
	}
	
	

	public char[][] getJogoVelha() {
		return jogoVelha;
	}

	public void setJogoVelha(char[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	//metodo validar jogada
	public boolean validarJogada(int linha, int coluna, char sinal) {
		
		if(jogoVelha[linha][coluna]=='X'||jogoVelha[linha][coluna]=='O') {
			return false;
		}
		else {
			jogoVelha[linha][coluna]=sinal;
			jogada++;
			return true;
		}
	}
	
	//metodo imprimir o tabuleiro
	public void imprimirTabuleiro() {
		
				for(int i=0;i<jogoVelha.length;i++) {
					for(int j=0;j<jogoVelha[i].length;j++) {
						System.out.print(jogoVelha[i][j]+" | ");
					}
					System.out.println();
				
				}
	}
	
	//metodo ganhador
	public boolean verificarGanhador(char sinal) {
		 if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || //linha 1
	                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //linha 2
	                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //linha 3
	                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //coluna 1
	                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //coluna 2
	                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //coluna 3
	                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || //diagonal
	                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {  //diagonal inversa
	            return true;
	        }
	        return false;
	    }
	
	//metodo empate
	public boolean verificarEmpate() {
		if(jogada>=9) {
			return true;
		}
		
		return false;
	}
	
	//metodo vez do jogador
	public boolean vezJogador1() {
		if(jogada%2==1) {
			return true;
		}else {
			return false;

		}
		
	}





}
