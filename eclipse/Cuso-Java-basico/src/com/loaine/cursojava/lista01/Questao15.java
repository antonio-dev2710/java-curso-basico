package com.loaine.cursojava.lista01;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
//Valor sem desconto (V): R$ 125,00

//Porcentagem de desconto (%): 15%

//Valor descontado (Vd): ?

//Valor final (Vf): ?

//125 x 15/100 (ou 0,15) = 18,75

//> 125 ? 18,75 = 106,25
//1? passo: V x % = Vd

//2? passo: V ? Vd = Vf
		
		System.out.print("Quanto voc? ganha por hora? ");
		double valorPorHora=scan.nextDouble();
		
		System.out.print("Quantas horas trabalhadas no m?s? ");
		double horaDeTrabalhoMes=scan.nextDouble();
		
		double salarioBruto=valorPorHora*horaDeTrabalhoMes;
		System.out.println("S?lario Bruto: "+salarioBruto+"R$");
		
		double impostoDeRenda=0.11;
		double inss=0.08;
		double sindicato=0.05;
		
		double pagouImpostoDeRenda=salarioBruto*impostoDeRenda;
		System.out.println("IR: "+ pagouImpostoDeRenda+"R$");
		
		double pagouInss=salarioBruto*inss;
		System.out.println("Inss: "+ pagouInss+"R$");
		
		double pagouSindicato=salarioBruto*sindicato;
		System.out.println("Sindicato: "+ pagouSindicato+"R$");
		
		
		double descontoTotal=pagouImpostoDeRenda+ pagouInss+pagouSindicato;
		
		double salarioLiquido=salarioBruto-descontoTotal;
		
		System.out.println("Sal?rio L?quido: "+salarioLiquido+"R$");
		
	}

}
