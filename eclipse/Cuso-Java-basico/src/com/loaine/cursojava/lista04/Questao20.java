package com.loaine.cursojava.lista04;



public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double cotacaoDolar=5.15;
		double [] A=new double[20];
		
		System.out.println("Digite o valor :");
		
		
		
		System.out.println("Cota��o do dolar para real :");
		System.out.print("----------------------------------------------");
		System.out.println(" ");

		System.out.println("Cota��o do dolar =  "+cotacaoDolar);
		System.out.println("DOLAR PARA RELA =");
		for(int i=1; i<A.length;i++) {
			
			A [i] = cotacaoDolar *i;

			if(i<=10) {
				System.out.print(" " +A [i]+" ");
			}
			
			if(i==10) {
				System.out.println(" ");
			}
			if(i>10) {
				System.out.print(" " +A [i]+" ");
				
			}
					
		}
		
		
		
		
	}

}
