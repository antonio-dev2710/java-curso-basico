package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
	

			System.out.print("Qual tabuda deseja: ");
			int tabuada=scan.nextInt();
			int resultado;
			int max=10;
			
			for(int i = 0;i<=max;i++) {
				resultado=tabuada*i;
				System.out.println(tabuada+ " x " +i+"= "+resultado);
			}

		
	}

}
