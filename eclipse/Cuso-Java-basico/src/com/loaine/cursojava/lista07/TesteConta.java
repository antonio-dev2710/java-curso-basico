package com.loaine.cursojava.lista07;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		
		ContaCorrente cliente01=new ContaCorrente();
		
		boolean opFinalizada = false;
		cliente01.saldo=1000;
		
		System.out.println("Digite o numero da sua conta");
		cliente01.numero=scan.next();
		boolean numeroConta=cliente01.verificarNumeroConta();
		
		
		System.out.println("Vc ? cliente especial?");
		cliente01.status=scan.nextBoolean();
		
		
		while(!opFinalizada) {
			
			//depositar
			System.out.println("Deseja fzr algum deposito?");
			cliente01.depositar(scan.nextBoolean());
			
			//saque
			System.out.println("Deseja fzr algum saque?");
			cliente01.sacar(scan.nextBoolean());
			
			
		
			//vizualizar extrato
			System.out.println("Seu saldo atual ? de: "+ cliente01.saldo);
			
			System.out.println("N?mero :"+ numeroConta);
			
			System.out.println("Check especial : "+cliente01.status +cliente01.bonusEspecial);
			System.out.println("Seu Saldo ? "+cliente01.saldo);
			System.out.println("vc depositou "+cliente01.totalDeposito);
			System.out.println("vc sacou " + cliente01.totalSaque);
			
			System.out.println("Deseja finalizar a opera??o digete true");
			
			opFinalizada= scan.nextBoolean();
			
		}
		
	
		 
	}

}
