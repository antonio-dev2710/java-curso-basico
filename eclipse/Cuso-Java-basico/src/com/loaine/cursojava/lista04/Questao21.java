package com.loaine.cursojava.lista04;



public class Questao21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A=new int[20];
		double porcent1=0;
		double porcent0=0;
		for(int i=1; i<A.length;i++) {
			
			A [i] = (int)Math.round(Math.random()*1);

			if(A [i]==1) {
				 porcent1++;
			}
			
			else {
				porcent0++;
			}
					
		}
		
		System.out.println("Porcentagem de zero = "+ (porcent0*100)/20);
		System.out.println("Porcentagem de um = "+ (porcent1*100)/20);
		
		
		
		
	}

}
