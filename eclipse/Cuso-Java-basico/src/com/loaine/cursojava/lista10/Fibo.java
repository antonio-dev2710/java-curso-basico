package com.loaine.cursojava.lista10;

public class Fibo {

	public static  int nA=0;
	 private static  int nB=1;
	 private static  int n;
	 private static int i=0;
	//metodo
	public  static  int  fibonacci(int total ) {
		
		if(i==20) {
			
			return n;
		}
		else {
			System.out.println(n);
		}
		n= nA+nB;
		nA=nB;
		nB=n;
		i++;
		
		
		return fibonacci(total=n);
	}

}
