package com.loaine.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		/*System.out.println("digite seu nome completo:");
		String nomeCompleto=scan.nextLine();
		System.out.println("Seu nome completo ?:"+nomeCompleto);
		
		System.out.println("digite seu primeiro nome:");
		String primeiroNome=scan.nextLine();
		System.out.println("Seu premeiro nome ?:"+primeiroNome);
		
		System.out.println("digite a sua idade:");
		int idade= scan.nextInt();
		System.out.println("digite sua idade:"+idade);
		
		System.out.println("digite a sua altura:");
		double altura= scan.nextDouble();
		System.out.println("digite sua altura:"+altura);*/
		
		System.out.println("digite a seu primeiro nome,idade,altura e se tem cachorro:");
		String primeiroNome=scan.next();
		int idade= scan.nextInt();
		double altura= scan.nextDouble();
		boolean temPet=scan.nextBoolean();
		System.out.println("Vc digitou os seguintes valores:");
		
		System.out.println(primeiroNome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(temPet);
		System.out.println(temPet);
		
		

	}

}
