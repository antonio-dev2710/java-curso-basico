package com.loaine.cursojava.lista07;

import java.util.Scanner;

public class ContaCorrente {
	
	String numero;
		
	double saldo;
	boolean status;
	int totalDeposito,totalSaque;
	double saque,deposito, bonusEspecial=500, valorsaqueEspecial;
	
	Scanner scan=new Scanner(System.in);
	
	//verifiacao do numero
	boolean verificarNumeroConta(){
		
		
		while(numero.length()!=8) {
			System.out.println("Seu numero esta incorreto, digite novamente");
			 numero=scan.next();
			 return false;
		}
		return true;
	}
	
	
	
		//Depoisitar
	double depositar(boolean vfDeposito ) {
		
		while(vfDeposito) {
			
			System.out.println("Digite o valor?");
			deposito=scan.nextDouble();
			if(deposito==0) {
				vfDeposito=false;
			}
						
			else {
					saldo+=deposito;
					totalDeposito+=deposito;

				System.out.println("Deseja fzr mais algum deposito?");
				vfDeposito=scan.nextBoolean();
			}
		}
		
		return deposito;
	}
		
		//saque
double sacar(boolean vfSaque ) {
		
		while(vfSaque) {
			
			System.out.println("Digite o valor?");
			saque=scan.nextDouble();
			valorsaqueEspecial=saque;
			;
			if(saque==0 && saldo>0) {
				vfSaque=false;
			}
			else if(saldo<=0 && status) {
				System.out.println("Vc é um cliente especial ganhou 500 de bonus");
				
				if(saque<=bonusEspecial) {
					bonusEspecial-=valorsaqueEspecial;
					vfSaque=false;
				}
				else {
					System.out.println("operação incorreta, tente mais tarde");
					vfSaque=true;
				}
				
				
			}
			else if(saldo<=0 && !status) {
				bonusEspecial=0;
				System.out.println("Vc n pode sacar dinheiro ");
				vfSaque=false;
				
				
			}
			else {saldo-=saque;
				totalSaque+=saque;
				System.out.println("Deseja fzr mais algum saque?");
				vfSaque=scan.nextBoolean();
			}
		}
		
		return saque;
	}
		
		
		
		
		
}
	

			
	
			

			
			
	



