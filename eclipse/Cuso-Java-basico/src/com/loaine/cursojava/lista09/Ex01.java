package com.loaine.cursojava.lista09;

public class Ex01 {

	public static void main(String[] args) {
		Contador.soma=5;
		int aux=Contador.soma;
		//incrementar
		Contador.incrementar(1);
		Contador.incrementar(2);
		Contador.incrementar(3);
		//retornar
	System.out.println(Contador.retornar((Contador.soma),aux));
	//zerar
	System.out.println(Contador.zerar(Contador.incrementar(Contador.soma)));
		
		
		
		
		
		
	}

}
