package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Telefonou para a v�tima?");
		boolean telefone=scan.nextBoolean();
		int numero=0;
		if(telefone==true) {
			numero=1;
		}
		else {
			numero=numero+0;
		}
		System.out.print("Esteve no local do crime?");
		boolean local=scan.nextBoolean();
		
		if(local==true) {
			numero=numero+numero;
		}
		else {
			numero=numero+0;
		}
		System.out.print("Mora perto da v�tima?");
		boolean moaradia=scan.nextBoolean();
		if(moaradia==true) {
			numero=numero+1;
		}
		else {
			numero=numero+0;
		}
		System.out.print("Devia para a v�tima?");
		boolean vitima=scan.nextBoolean();
		if(vitima==true) {
			numero=numero+1;
		}
		else {
			numero=numero+0;
		}
		System.out.print("J� trabalhou com a v�tima?");
		boolean  trabalho=scan.nextBoolean();
		if( trabalho==true) {
			numero=numero+1;
		}
		else {
			numero=numero+0;
		}
		
		if(numero==2) {
			System.out.print("Suspeita");
		}
		else if(numero==3 || numero==4) {
			System.out.print( "C�mplice" );
		}
		else if(numero==5) {
			System.out.print("Assassino");
		}
		else {
			System.out.print("Inocente");
		}
		
		
		
		
		
	}


	
	
}
