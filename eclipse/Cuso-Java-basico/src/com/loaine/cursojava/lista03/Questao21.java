package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		double preco= scan.nextDouble();
		double totalCompras=0;
		
				boolean fimDasCompras=true;
				int i=1;

		System.out.println("Produto"+i+": "+"R$"+String.format(" %.2f",preco).replaceAll(",", "."));
	

		for( int aux=1 ;fimDasCompras==true ;aux++) {
			
				for( i=2;preco!=0 ;i++) {
					
			totalCompras= totalCompras+preco;
			preco=scan.nextDouble();
			
			System.out.println("Produto "+i+": "+"R$"+String.format(" %.2f",preco).replaceAll(",", "."));
			
		}
		
				System.out.println("Total "+": "+"R$"+String.format(" %.2f",totalCompras).replaceAll(",", "."));
		
				
				System.out.println("Quanto vc deu para o caixa:");
				double valorCliente=scan.nextDouble();
				System.out.println("Dineiro: "+valorCliente);
				
				
				double troco=valorCliente-totalCompras;
				if(valorCliente>totalCompras) {
					System.out.println("Troco: "+ troco);
					
				}
				
				else {System.out.println("Sem troco ");
				}
				
				System.out.println("fim");
				
				System.out.println(fimDasCompras=scan.nextBoolean());
				if(fimDasCompras==false) {
					return;
				}
				else {i=1;
				
					preco=scan.nextDouble();
					System.out.println("Produto"+i+": "+"R$"+String.format(" %.2f",preco).replaceAll(",", "."));
				}
	}
		
		System.out.println("fim");

	}
	
}
