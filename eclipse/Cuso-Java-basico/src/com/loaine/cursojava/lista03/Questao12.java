package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//repetidamente substituindo-se o primeiro n�mero pelo segundo, 
		//e o segundo n�mero pela soma dos dois anteriores.
		Scanner scan=new Scanner(System.in);
		int n=0,na=0,nb=1;
		System.out.println("Escolha um n�mero m�ximo para seq de fib:");
		int max = scan.nextInt();
		System.out.println(na);
		for(int i=0;i<max;i++) {
			System.out.println(nb);
			n=nb+na;
			na=nb;
			nb=n;
		}
	}

}
