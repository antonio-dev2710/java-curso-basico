package com.loaine.cursojava.lista04;

public class Questao01 {

	public static void main(String[] args) {
		
		int[] A=new int[5];
		
		int[] B=new int[A.length];
		
		int x=2;
		for(int i=0;i<A.length;i++) {
			
			A[i]=x+2;
				System.out.println("O valor de B é: "+B[i]);
				x++;
		}
		
		
	}
	

}
