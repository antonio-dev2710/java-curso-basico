package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("digite 3 n�meros: ");
		double a=scan.nextDouble();
		if(a==0) {
			return;
		}
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		
		double delta = (Math.pow(b,2))-(4*a*c);
		if(delta<0) {
			System.out.println("a equa��o n�o possui raizes reais.");
			return;
		}
		else if(delta==0) {
			System.out.println("delta calculado igual a zero a equa��o possui apenas uma raiz real");
		}
		else if(delta>0) {
			System.out.println("delta  positivo, a equa��o possui duas raiz reais");
		}
		System.out.println(delta);
		//formula de bascara
		double raizDeDelta=Math.sqrt(delta);
		
		double bascarax1= ((-(b))+raizDeDelta)/(2*a);
		
		double bascarax2= ((-(b))-raizDeDelta)/(2*a);
		System.out.println(bascarax1);
		System.out.println(bascarax2);
	}

}
