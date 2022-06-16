package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		//taxa de crescimento=(valor final - valor inicial/valor inicial)*100
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Coloque o numero do crescimento da população por ano A: ");
		int populacaoA=scan.nextInt();
		System.out.print("Coloque a taxa A: ");
		double taxaDeCrescimentoA=scan.nextDouble();
		taxaDeCrescimentoA=(taxaDeCrescimentoA/100);
		
		
		
		System.out.print("Coloque o numero do crescimento da população por ano B: ");
		int populacaoB=scan.nextInt();
		System.out.print("Coloque a taxa B: ");
		double taxaDeCrescimentoB=scan.nextDouble();
		taxaDeCrescimentoB=taxaDeCrescimentoB/100;
		
		
		
		//enquaanto B for menor que A fzr o loop
		if(populacaoB<populacaoA) {
			 int anoB=0;
			 
			while(populacaoB<populacaoA) {
				populacaoB=(int) (taxaDeCrescimentoB*populacaoB+(populacaoB*100)/100);
				 anoB++; 
			}
			
			System.out.println("ano: "+anoB);
			 System.out.println("População: " +populacaoB);
			 
		}
		
		if(populacaoA<populacaoB) {
					//enquaanto A for menor que B fzr o loop
				 int anoA=0;
				while(populacaoA<populacaoB) {
					populacaoA=(int) (taxaDeCrescimentoA*populacaoA+(populacaoA*100)/100);
					anoA++;
				 
					}
			System.out.println("ano: "+anoA);
			 System.out.println("População: " +populacaoA);
		}

	}

}
