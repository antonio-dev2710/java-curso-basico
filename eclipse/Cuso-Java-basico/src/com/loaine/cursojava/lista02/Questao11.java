package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite seu sal?rio: ");
		double salario=scan.nextDouble();
		double salarioAtual;
		double percentual;
		if(salario>0 && salario<=280) {
			percentual=20;
			salarioAtual=salario*1.20;
		}
		else if(salario>280 && salario<=700) {
			percentual=15;
			salarioAtual=salario*1.15;
		}
		else if(salario>700 && salario<=1500) {
			percentual=10;
			salarioAtual=salario*1.10;
		}
		else {percentual=5;
			salarioAtual=salario*1.05;
		}
		System.out.println("o sal?rio antes do reajuste: "+salario+
				"\r\n"+ "o percentual de aumento aplicado "+percentual+"%"+"\r\n"
				+ "o valor do aumento: "+(salarioAtual-salario)+"\r\n"
				+ "o novo sal?rio, ap?s o aumento. "+salarioAtual);
		
		
		

	}

}
