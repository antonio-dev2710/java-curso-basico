package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite um nome: ");
		//nome maior que 3 caracteres
		String nome=scan.next();
	
		System.out.println("Digite sua idade: ");
		//de 0 a 150
		int idade=scan.nextInt();
		
		System.out.println("Digite seu salario: ");
		double salario=scan.nextDouble();
		
		System.out.println("Qual seu genero: ");
		String sexo=scan.next();
		//m ou f
		System.out.println("Qual seu estado civil: ");
		String estadoCivil=scan.next();
		// s,c,v,d
		
		
		while(nome.length()<=3){ 
			System.out.println("Digite seu nome ");
			//nome maior que 3 caracteres
			 nome=scan.next();
			 
		}
	
		while(idade<0 || idade>150) {
			System.out.println("Digite sua idade: ");
			//de 0 a 150
			 idade= scan.nextInt();
		}
		
		
		for(salario=salario;salario<0;salario=salario+0) {
			System.out.println("Digite seu salario: ");
			 salario=scan.nextDouble();
		}
		
		while((sexo.equals("f"))==false) {
			System.out.println("Qual seu genero: ");
			 sexo=scan.next();
		}
		
		while((sexo.equals("m"))==false) {
			System.out.println("Qual seu genero: ");
			 sexo=scan.next();
		}
		while((sexo.equals("s"))==false) {
			System.out.println("Qual seu estado civil: ");
			estadoCivil=scan.next();
		}
		
		while((sexo.equals("c"))==false) {
			System.out.println("Qual seu estado civil: ");
			 estadoCivil=scan.next();
		}
		while((sexo.equals("d"))==false) {
			System.out.println("Qual seu estado civil: ");
			 estadoCivil=scan.next();
		}
		
		while((sexo.equals("v"))==false) {
			System.out.println("Qual seu estado civil: ");
			 estadoCivil=scan.next();
		}
		
		
		System.out.println("Nome digitado: "+ nome);
		System.out.println("Sua idade: "+ idade);
		System.out.println("Seu salario: "+salario);
		System.out.println("Seu genero: "+sexo);
		System.out.println("Seu estado civil: "+estadoCivil);
	
			}
	
}
