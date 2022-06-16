package com.loaine.cursojava.lista02;

import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Vc prefere maçã, morango ou maçã e morango ? ");
		String fruta  = scan.next();
		double valorMaca;
		double valorMorango;
		double valorMorangoMaca;
		
		if(fruta.equals("maçã")) {
			System.out.print("Quantos kg ?");
			double maca = scan.nextDouble();
			
			if(maca>=0&&maca<=5) {
				valorMaca=1.80;
				maca=maca*valorMaca;
				System.out.print(maca+"R$");
				 return;
			}
			else if(maca>5 && maca<8) {
				valorMaca=1.50;
				maca=maca*valorMaca;
				System.out.print(maca+"R$");
				
		}	
			else {
				valorMaca=1.50;
				maca=maca*valorMaca*1.1;
				System.out.print(maca+"R$");
			

		}	
	}
		
		if(fruta.equals("morango")) {
			System.out.print("Quantos kg ?");
			double morango = scan.nextDouble();
			
			
			
			if(morango>=0&&morango<=5) {
				valorMorango=2.50;
				 morango=morango*valorMorango;
				System.out.print(morango+"R$");
				if( morango>25) {
					morango=morango*valorMorango*1.1;
					System.out.print(morango+"R$");
					 return;
				}
				 return;
			}
			else if( morango>5 &&  morango<8) {
				valorMorango=2.20;
				morango=morango*valorMorango;
				System.out.print(morango+"R$");	
		}	
			else {
				valorMorango=2.20;
				morango=morango*valorMorango*1.1;
				System.out.print(morango+"R$");
		
		}
			
			
			
	}
		
		if(fruta.equals("maçã e morango ")) {
			System.out.print("Quantos kg ?");
			double macaMorango = scan.nextDouble();
			
			
			if(macaMorango>=0&&macaMorango<=5) {
				valorMorangoMaca=2.50+1.80;
				macaMorango=macaMorango*valorMorangoMaca;
				System.out.print(macaMorango+"R$");
				if(macaMorango>25) {
					macaMorango=macaMorango*valorMorangoMaca*1.1;
					System.out.print(macaMorango+"R$");
					 return;
				}
				 return;
			}
			else if(macaMorango>5 && macaMorango<8) {
				valorMorangoMaca=2.20+1.50;
				macaMorango=macaMorango*valorMorangoMaca;
				System.out.print(macaMorango+"R$");
				
		}
			else{
				valorMorangoMaca=2.20+1.50;
				macaMorango=macaMorango*valorMorangoMaca*1.1;
				System.out.print(macaMorango+"R$");
			
				
				
		}	
	}

		
 }
}
