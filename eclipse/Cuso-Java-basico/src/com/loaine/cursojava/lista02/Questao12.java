package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Valor sem desconto (V): R$ 125,00

		//Porcentagem de desconto (%): 15%

		//Valor descontado (Vd): ?

		//Valor final (Vf): ?

		//125 x 15/100 (ou 0,15) = 18,75

		//> 125 – 18,75 = 106,25
		//1º passo: V x % = Vd

		//2º passo: V – Vd = Vf
				
				System.out.print("Quanto você ganha por hora? ");
				double valorPorHora=scan.nextDouble();
				
				System.out.print("Quantas horas trabalhadas no mês? ");
				double horaDeTrabalhoMes=scan.nextDouble();
				
				double salarioBruto=valorPorHora*horaDeTrabalhoMes;
				System.out.println("Sálario Bruto: "+salarioBruto+"R$");
				
				double impostoDeRenda;
				double inss=0.10;
				double sindicato=0.03;
				double fgts=0.11;
						
				double pagouImpostoDeRenda;
				double pagouInss;	
				double pagouSindicato;
				double pagouFgts;
				
				double descontoTotal;
				
				double salarioLiquido;
				if(salarioBruto<=900) {
					impostoDeRenda=0;
					pagouImpostoDeRenda=salarioBruto*impostoDeRenda;
					System.out.println("(-)IR: "+ pagouImpostoDeRenda+"R$");
					
					pagouInss=salarioBruto*inss;
					System.out.println("Inss: "+ pagouInss+"R$");
					
					pagouSindicato=salarioBruto*sindicato;
					System.out.println("Sindicato: "+ pagouSindicato+"R$");
					pagouFgts=salarioBruto*fgts;
					System.out.println("(-)FGTS: "+pagouFgts+"R$");
					descontoTotal=pagouImpostoDeRenda+ pagouInss;
					
					salarioLiquido=salarioBruto-descontoTotal;
					System.out.println("Salário Líquido: "+salarioLiquido+"R$");
					
					
				}	
				else if(salarioBruto>900 && salarioBruto<=1500) {
					impostoDeRenda=0.05;
					pagouImpostoDeRenda=salarioBruto*impostoDeRenda;
					System.out.println("(-)IR: "+ pagouImpostoDeRenda+"R$");
					
					pagouInss=salarioBruto*inss;
					System.out.println("Inss: "+ pagouInss+"R$");
					
					pagouSindicato=salarioBruto*sindicato;
					System.out.println("Sindicato: "+ pagouSindicato+"R$");
					pagouFgts=salarioBruto*fgts;
					System.out.println("(-)FGTS: "+pagouFgts+"R$");
					descontoTotal=pagouImpostoDeRenda+ pagouInss;
					
					salarioLiquido=salarioBruto-descontoTotal;
					System.out.println("Salário Líquido: "+salarioLiquido+"R$");
				}
					else if(salarioBruto>1500 && salarioBruto<=2000) {
						impostoDeRenda=0.1;
						pagouImpostoDeRenda=salarioBruto*impostoDeRenda;
						System.out.println("(-)IR: "+ pagouImpostoDeRenda+"R$");
						
						pagouInss=salarioBruto*inss;
						System.out.println("Inss: "+ pagouInss+"R$");
						
						pagouSindicato=salarioBruto*sindicato;
						System.out.println("Sindicato: "+ pagouSindicato+"R$");
						pagouFgts=salarioBruto*fgts;
						System.out.println("(-)FGTS: "+pagouFgts+"R$");
						descontoTotal=pagouImpostoDeRenda+ pagouInss;
						
						salarioLiquido=salarioBruto-descontoTotal;
						System.out.println("Salário Líquido: "+salarioLiquido+"R$");
					}
	}

}
