package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Coloque suas duas notas aq: ");
		double nota01=scan.nextDouble(), nota02=scan.nextDouble();
		double mediaNota=(nota01+nota02)/2;
		System.out.println(mediaNota);
		
		if(mediaNota>=7 && mediaNota<9.9) {
			System.out.print("Aprovado ");
		}else if(mediaNota==10) {
			System.out.print(" Aprovado com Distin��o ");
		}else {
			System.out.print("Reprovado ");
		}
		

	}

}
