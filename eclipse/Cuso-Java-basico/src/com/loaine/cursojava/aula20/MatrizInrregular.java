package com.loaine.cursojava.aula20;

import java.util.Scanner;

public class MatrizInrregular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de pessoas que se�o entrevistadas:");
		
		int numEntrevist=scan.nextInt();
		
		String[][] nomeFilhos = new String[numEntrevist][];
		
		for(int i=0;i<nomeFilhos.length;i++) {
			System.out.println("Entre com a quant de filhos:");
			
			int qtdFilhos=scan.nextInt();
			//instanciou em filhos
			nomeFilhos[i]=new String[qtdFilhos];
			
			for(int j=0;j<nomeFilhos[i].length;j++) {
				System.out.println("Digite o nome dos filhos: "+ (j+1) );
				
				nomeFilhos[i][j]=scan.next();
				
				
			}
			
		}
		
		
		for(int i=0;i<nomeFilhos.length;i++) {
			System.out.println("Pessoa: "+i+ "numero de filhos :"+nomeFilhos.length);
			

			for(int j=0;j<nomeFilhos[i].length;j++) {
				System.out.println(nomeFilhos[i][j]);
				
				
				
				
			}
			
		}
		
		
	}

}
