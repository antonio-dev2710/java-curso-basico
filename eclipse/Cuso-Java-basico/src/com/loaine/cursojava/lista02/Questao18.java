package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Escolha uma data dd/mm/aaaa ");
		int dia= scan.nextInt();
		int mes=scan.nextInt();
		int ano=scan.nextInt();
		
		if(dia>31||mes>12 || ano<1000 || mes<0 ||dia<0 || ano<0) {
			System.out.print("tente outra data");
			return;
			
		};
		int centenaDia=dia/100%10;
		int dezenaDia=dia/10%10;
		int unidadeDia=dia/1%10;
		
		 int centenaMes=mes/100%10;
		 int dezenaMes=mes/10%10;
		 int  unidadeMes=mes/1%10;
		 
		 int milAno=ano/1000%10;
		 int centenaAno=ano/100%10;
		 int dezenaAno=ano/10%10;
		 int unidadeAno=ano/1%10;
		 
		
	if(centenaDia!=0 ) {
		System.out.print("tem outra data");
		return;
	}
	else if(centenaMes!=0) {
		System.out.print("tem outra data");
		return;
	}
		
	System.out.print("Escolha uma data dd/mm/aaaa :"+ dia+'/'+mes+"/"+ano);
		
	}


	
	
}
