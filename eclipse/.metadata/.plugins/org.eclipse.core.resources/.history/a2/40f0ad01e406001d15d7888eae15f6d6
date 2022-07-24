package com.loaine.cursojava.lista09;

import java.util.Scanner;

public class Lampada {

	private String tipo;
	private double voltagem, preco;
	int funcionar;
	//construtores
	Scanner scan= new Scanner(System.in);
	

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	//metodo
	public int getFuncionar() {
		
		if(funcionar>=0 && funcionar<=2) {
			if(funcionar==1) {
				System.out.println("Desligado");
			}
			if(funcionar==2){
				System.out.println("Ligado");
			}
				
		}
		
		else if(funcionar==3) {
			
			 System.out.println("Vc encerrou o metodo");
		}
			else {
				System.out.println("vc so pode escolher de 0 a 2 !!!");
			}
		
		return funcionar;
	}
	public void setFuncionar(int opcao) {
		this.funcionar=opcao;
		
		
	}
	
	
}
	/*while(opcao!=0) {
	
	opcao=scan.nextInt();
	

}
return opcao;
}
*/