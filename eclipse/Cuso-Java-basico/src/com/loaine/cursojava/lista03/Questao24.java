package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ano q o funcionario foi contratado
		//salario inicial
		//a partir do 2 ano a porcentagem dobra
		Scanner scan=new Scanner(System.in);
		System.out.println("Qual ano vc come?ou a trabalahar?");
		int anoInicial=scan.nextInt();
		double aumentoPorcentagem=1.5;
		int anoFinal=2022;
		
		System.out.println("Qual sal?rio incial?");
		double salarioInical=scan.nextDouble();
		double salarioPorcent=0;
		
		for(int i=0;anoInicial<=anoFinal;i++) {
			
			
				
			if(i==1) {
					salarioPorcent=salarioInical*aumentoPorcentagem;
					salarioPorcent=salarioPorcent/100;
					salarioPorcent=salarioPorcent+salarioInical;
			}
			
			else if(i>=2) {
						aumentoPorcentagem=aumentoPorcentagem*2;
						salarioPorcent=salarioInical*aumentoPorcentagem;
						salarioPorcent=salarioPorcent/100;
						salarioPorcent=salarioPorcent+salarioInical;
			}
			
			else{
				salarioPorcent=salarioInical;
			}
			
			
			
			System.out.println("Ano: "+ anoInicial+" Sal?rio: "+salarioPorcent);
			anoInicial++;
		}
		
		
		
					
	
			
	}


	
	
}
