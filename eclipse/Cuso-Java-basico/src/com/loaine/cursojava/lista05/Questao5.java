package com.loaine.cursojava.lista05;

import java.util.Random;



public class Questao5 {

	public static void main(String[] args) {
	
		//criar agenda
		//adicionar lembretes dentro das horas
		//poder acessar quando quiser
		//matriz tri-mes dia hora
		String[][][] agenda=new String[12][7][8];
		
		String compromisso="compromisso agendado";
		int opcao;
		 Random gerador = new Random();
		
		for(int i=0;i<agenda.length;i++) {
			for( int j=0;j<agenda[i].length;j++) {
				for( int k=0;k<agenda[i][j].length;k++) {
					
					System.out.println("         MENU         ");
					System.out.println("----------------------");
					System.out.println(" Para add um lebrete digite 0"
							+ "\n"+"Acessar quando quiser a agenda digite 1 "+ "\n");
							
					opcao=gerador.nextInt(2);
					System.out.println(opcao);
					
						switch(opcao){
						case 0:
							System.out.println("escolha o mes");
							i=gerador.nextInt(12);
							System.out.println(i);
							
							System.out.println("escolha o dia");
							j=gerador.nextInt(7);
							System.out.println(j);

							System.out.println("escolha a hora");
							k=gerador.nextInt(8);
							System.out.println(k);
							
							System.out.println(j);
							if(agenda[i][j][k]==null) {
							agenda[i][j][k]=compromisso;
							}
							
							else {
								
								
								do {
									System.out.println("Essa hora que vc escolheu está preenchida,escolha outra hora");
									System.out.println("escolha o mes");
									i=gerador.nextInt(12);
									System.out.println(i);
									
									System.out.println("escolha o dia");
									j=gerador.nextInt(7);
									System.out.println(j);

									System.out.println("escolha a hora");
									k=gerador.nextInt(8);
									System.out.println(k);
									
									System.out.println(j);
									
									
									
								}while(agenda[i][j][k]!=null);
								agenda[i][j][k]=compromisso;
							}
							 break;
							 
							 
						default:
							 if(i==0) {
								 i=0;
								 
							 }
							 else {
								 i--;
								 
							 }
							System.out.print("LEMBRETES");
							System.out.println(" ");
							
							for(int n = 0 ; n<agenda.length;n++) {
								for(int m = 0 ; m<agenda[n].length;m++) {
										for( int o = 0 ; o<agenda[n][m].length;o++) {
											System.out.println("Mês = " + n + " Dia = " + m + " hora = " + o);
											System.out.println(agenda[n][m][o]);
											
											
										}
								}
						}
							
							
							
							
							break;
							
							
							 
							 
						}
					
				}

			}
		}
		
		System.out.println("----------------------");
		System.out.println("SUA AGENDA ESTÁ PRONTA!!!!!!!");
		System.out.print("LEMBRETES");
		System.out.println(" ");
		for(int p = 0 ; p<agenda.length;p++) {
			for(int q = 0 ; q<agenda[p].length;q++) {
					for( int r = 0 ; r<agenda[p][q].length;r++) {
						System.out.println("Mês = " + p + " Dia = " + q + " hora = " + r);
						System.out.println("------"+agenda[p][q][r]+"------");
						
						
					}
			}
	}
		
						
		
	}
	
			
}
