
package com.loaine.cursojava.lista03;

import java.util.Scanner;

public class Quest?o13 {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.print("Escolha uma numero:");
		int numero=scan.nextInt();
		int fatorial=numero;
		int aux=0;
		int i;
		System.out.print(fatorial+"!"+" = ");
		for( i=fatorial;i>1;i--) {
			numero=numero*(i-1);
			
						System.out.print(i+" . ");
			
			}
		

		
		System.out.print(" "+i+"  "+" = "+numero);
		
	}

}
