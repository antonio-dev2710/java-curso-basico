package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite um n�mero menor do que 1000? ");
		
		int numero=scan.nextInt();
		int centena=numero/1000%10;
		int dezena=numero/10%10;
		int unidade=numero/1%10;
		
		
		System.out.print("O tempo aproximado de download do arquivo usando este link (em minutos): "+centena+", "+dezena+" e "+unidade);
	}


	
	
}
