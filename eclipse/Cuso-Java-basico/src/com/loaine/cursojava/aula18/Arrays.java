package com.loaine.cursojava.aula18;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
		
		//passar as posi��es 
		double[] temp=new double[365];
		temp[0]= 31.3;
		temp[1]= 34.3;
		temp[2]= 39.3;
		temp[3]= 26.3;
		
		System.out.println("O valor da temperatura do dia 3 �: "+temp[2]);
		//apresenta quantos n�meros double pode colocar no array
		System.out.println("O tamanho �: "+temp.length);
		
		for(int i = 0; i<temp.length;i++) {
		
			System.out.println("O valor da temperatura do dia "+(i+1)+"�: "+temp[i]);
		}
		
		for(double temperaturas : temp) {
			System.out.println(temperaturas);
		}
	}
		

}
