package com.loaine.cursojava.lista05;

import java.util.Random;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
	
		//criar agenda
		//adicionar lembretes dentro das horas
		//poder acessar quando quiser
		String[] [] agenda=new String[30][24];
		int horas=24;
		String compromisso="compromisso agendado";
		int opcao, i;
		 Random gerador = new Random();
		
		for( i=0;i<agenda.length;i++) {
			for(int j=0;j<agenda[i].length;j++) {
				System.out.println("         MENU         ");
				System.out.println("----------------------");
				System.out.println(" Para add um lebrete digite 0"
						+ "\n"+"Acessar quando quiser a agenda digite 1 "+ "\n");
						
				opcao=gerador.nextInt(2);
				System.out.println(opcao);
				switch(opcao){
				case 0:
					System.out.println("escolha o mes");
					i=gerador.nextInt(30);
					System.out.println(i);
					System.out.println("escolha a hora");
					j=gerador.nextInt(24);
					System.out.println(j);
					if(agenda[i][j]==null) {
					agenda[i][j]=compromisso;
					}
					else {
						do {
							System.out.println("Essa hora que vc escolheu está preenchida,escolha outra hora");
							j=gerador.nextInt(24);
							System.out.println("escolha o mes");
							i=gerador.nextInt(30);
							System.out.println(i);
							System.out.println("escolha a hora");
							j=gerador.nextInt(24);
							System.out.println(j);
							
							
						}while(agenda[i][j]!=null);
						agenda[i][j]=compromisso;
					}
					 break;
				
					
					
					default:
						//consulta o dia anterior
						 if(i==0) {
							 i=0;
						 }
						 else {
							 i--;
						 }
						System.out.print("LEMBRETES");
						System.out.println(" ");
						for(int k=0; k<agenda.length;k++) {
							System.out.print("Dia :"+k );
							System.out.println();

							for(int l =0;l<agenda[k].length;l++) {
								System.out.print( "hora: "+l+": "+agenda[k][l]+" ");
								
						}
							System.out.println();
						}
						
						
						
						break;
			  }
			}
		}
		
		System.out.println("----------------------");
		System.out.println("SUA AGENDA ESTÁ PRONTA!!!!!!!");
		for(int k=0; k<agenda.length;k++) {
			System.out.print("mes :"+k );
			System.out.println();

			for(int l =0;l<agenda[k].length;l++) {
				System.out.print( "hora: "+l+": "+agenda[k][l]+" ");
				
		}
			System.out.println();
		}
	}
	
}
