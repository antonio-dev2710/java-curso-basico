package com.loaine.cursojava.lista04;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int[] A = new int[10];
		int superior=0;
		int igual=0;
		int somaMenor15=0;
		int media=0;
		
		System.out.println("Digite um  n?mero :");
		
		for(int i=0; i<A.length;i++) {
			A[i]=scan.nextInt();
			
			
			
			if(A[i]<15) {
				somaMenor15+=A[i];
			}
			else if(A[i]==15) {
				igual++;
			}
			else {
				media=media+A[i];
				superior++;
			}
					
		}
		
		System.out.print("Vetor A =");
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+" ");
			
					
		}
		
		System.out.println(" ");
		
		System.out.println("Soma menores que 15 "+somaMenor15);
		System.out.println("Quantidade igual a 15 "+igual);
		System.out.println("Quantidade : "+superior+" Meidia Sup a 15 :"+media/superior);
		
	}

}
