package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite um ano:");
		
		int ano = scan.nextInt();
		int dezena;
		 int unidade;
		 dezena=ano/10%10;
		 unidade=ano/1%10;
		 if(dezena==0 && unidade==0 && ano<=999) {
				ano=ano/100;
				 ano  = ano%4;
				 if(dezena==0) {
						System.out.print("? bissexto");
					}
					else {
						System.out.print("N?o ? bissexto");
					}
				}
			
		
		
		if(ano<=9999 && dezena==0 && unidade==0 ) {
			ano=ano/100;
			 ano  = ano%4;
			 if(dezena==0) {
					System.out.print("? bissexto");
				}
				else {
					System.out.print("N?o ? bissexto");
				}
			 }
		
		
		//para os numeros diferentes de zero na dezena e na unida
		//transformar em string concatenar e transformar em numero
		
		if(dezena!=0 && unidade!=0) {
		dezena=dezena*10+(unidade);
		
		dezena = dezena%4;
		
		
		if(dezena==0) {
			System.out.print("? bissexto");
		}
		else {
			System.out.print("N?o ? bissexto");
		}
		}
	}

}
