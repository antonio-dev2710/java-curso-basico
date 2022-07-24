package com.loaine.cursojava.lista10;

public class SolucaoFiboLoi {

	public static int fibomacci(int num) {
		
		if(num<2) {
			return 1;
		}
		return fibomacci(num-1)+fibomacci(num-2 );
	}
}
